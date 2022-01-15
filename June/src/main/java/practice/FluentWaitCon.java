package practice;



import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitCon {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		WebElement email=waitForElementWithFluentWait(emailId, 10, 1000);
//		email.sendKeys("asdfghj");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
				wait.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class);
				
	wait.until(ExpectedConditions.presenceOfElementLocated(emailId)).sendKeys("yhnbvcxzfg");
	}
	
	public static WebElement waitForElementWithFluentWait(By locator,int timeout,long polling) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(polling))
				.ignoring(NoSuchElementException.class);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				
	}
	
	public static WebDriver waitForFrameWithFluentWait(By locator,int timeout,long polling) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(polling))
				.ignoring(NoSuchElementException.class);
		
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
				
	}

}
