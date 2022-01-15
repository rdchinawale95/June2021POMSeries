package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cognizant.com/");
		Thread.sleep(5000);
		
		
		By laser=By.xpath("//a[@title='READ ARTICLES']");
		waitForElement(laser, 60).click();
		System.out.println("************");
		
		
	}
	
	public static WebElement waitForElement(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
	return	wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}
