package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.get("https://www.online.citibank.co.in/");
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div[1]/div[4]/div/div[1]")).click();
//		Thread.sleep(3000);
		By Industry = By.xpath("//*[@id='Form_submitForm_Industry']/option");
		By Country = By.name("Country");
		
		doClickDDWOSelect(Industry, "Aerospace");

//		By citi = By.xpath("//div[@class='applyHldr']//a");
//		doClickDDWOSelect(citi, "Citigold Account");

		System.out.println("********");

	}

	public static void doClickDDWOSelect(By locator, String value) {
		List<WebElement> list = driver.findElements(locator);

		for (WebElement a : list) {
			String s = a.getText();

			if (s.contains(value)) {
				a.click();
				break;
			}
		}

	}

}
