package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination_practice {

	static WebDriver driver;

	public static void selectContact(String name) {
		String checkBox = "//a[text()='" + name + "']//parent::td//preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkBox)).click();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();
		List<WebElement> ind=driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
		
	int i=0;
	while (true) {
		if (driver.findElements(By.linkText("Yadav Vaibhav111")).size()==1) {
			selectContact("Yadav Vaibhav111");
			break;
		}else {
			ind.get(i).click();
			ind= driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
		}
	i++;
	}
		
	}
	
}