package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_TRaverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// table[@id="customers"]/tbody/tr[3]/td[1]

		String Before_xpath = "//table[@id='customers']/tbody/tr[";
		String after_xpath = "]/td[1]";
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();

		for (int i = 2; i <= rowcount; i++) {
			String compXpath = Before_xpath + i + after_xpath;
			// System.out.println(compXpath);
			String compVal = driver.findElement(By.xpath(compXpath)).getText();
			System.out.println(compVal);
		}

		System.out.println("*********************");

		String Before_xpath1 = "//table[@id='customers']/tbody/tr[";
		String after_xpath1 = "]/td[2]";
		int rowcount1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();

		for (int i = 2; i <= rowcount; i++) {
			String compXpath1 = Before_xpath1 + i + after_xpath1;
			// System.out.println(compXpath);
			String compVal1 = driver.findElement(By.xpath(compXpath1)).getText();
			System.out.println(compVal1);
		}
		System.out.println("*********************");

		String Before_xpath2 = "//table[@id='customers']/tbody/tr[";
		String after_xpath2 = "]/td[3]";
		int rowcount2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();

		for (int i = 2; i <= rowcount; i++) {
			String compXpath2 = Before_xpath2 + i + after_xpath2;
			// System.out.println(compXpath);
			String compVal2 = driver.findElement(By.xpath(compXpath2)).getText();
			System.out.println(compVal2);
		}

	}

}
