package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_axes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()='Abe
		// Sabian']//parent::td//preceding-sibling::td/input[@type='checkbox']")).click();
		// select("Akshay patil");
		// select("AAA1 B111");
		// select("Abe Sabian");

		// System.out.println(getContactDetails("Aastha Grover"));
		// System.out.println(getContactDetails("Aliss Jeyhun"));
		// System.out.println(getContactDetails("Abe Sabian"));

		//// a[text()='Abe Sabian']//parent::td//following-sibling::td

		//// td//preceding-sibling::td/input[@type='checkbox']
		List<WebElement> check = driver.findElements(By.xpath("//td//preceding-sibling::td/input[@type='checkbox']"));
		// (//td//preceding-sibling::td/input[@type='checkbox'])[2]
		int a = check.size();
		System.out.println(a);
		for (int i = 2; i <= a; i++) {
			driver.findElement(By.xpath("(//td//preceding-sibling::td/input[@type='checkbox'])[" + i + "]")).click();
			Thread.sleep(200);
			
			
			////a[text()='Dushmantha Chameera']//parent::td//following-sibling::td
		}
		
		

	}

	public static List<String> getContactDetails(String name) {
		List<WebElement> contacts = driver
				.findElements(By.xpath("//a[text()='" + name + "']//parent::td//following-sibling::td"));
		List<String> contactDet = new ArrayList<String>();
		for (WebElement a : contacts) {
			String s = a.getText();
			contactDet.add(s);
		}
		return contactDet;
	}

	public static void select(String name) {
		driver.findElement(
				By.xpath("//a[text()='" + name + "']//parent::td//preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}
}
