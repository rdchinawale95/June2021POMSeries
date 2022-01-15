package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightClick {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			// driver.get("https://www.google.co.in/");
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			Thread.sleep(2000);

			driver.manage().window().maximize();
			
			WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
			
			Actions act= new Actions(driver);
			act.contextClick(rightClick).perform();
	}

}
