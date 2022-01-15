package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.get("https://www.google.co.in/");
		driver.get("http://mrbool.com/");
		
		WebElement content= driver.findElement(By.xpath("//a[@class='menulink']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(content).perform();
		
		Thread.sleep(2000);
		WebElement courses= driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a"));
		Thread.sleep(2000);
		courses.click();
	
	}

}
