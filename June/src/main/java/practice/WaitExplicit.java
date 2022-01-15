package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExplicit {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		waitforFrameandSwitchtoit("mainpanel", 5);
		By contacts=By.linkText("CONTACTS");
		clickWhenReady(contacts, 5);
		//driver.findElement(By.linkText("CONTACTS")).click();
		System.out.println("*********");
		
	}
	
	public static void waitforFrameandSwitchtoit(String frameName,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
	}
	
	public static void waitforFrameandSwitchtoit(By frameLocator,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public static void waitforFrameandSwitchtoit(int frameIndex,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitforFrameandSwitchtoit(WebElement frameElement,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @param intervalTime
	 */
	public static void waitForElementVisibleUsingBy(By locator,int timeout,int intervalTime) {
		WebDriverWait wait= new WebDriverWait(driver,timeout,intervalTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void waitForElementVisibleUsingWebElement(By locator,int timeout,int intervalTime) {
		WebDriverWait wait= new WebDriverWait(driver,timeout,intervalTime);
		wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does notnecessarily mean that the element is visible.
	 * @param locator
	 * @param timeout
	 * @param intervalTime
	 */
	public static void waitForElementPresence(By locator,int timeout,int intervalTime) {
		WebDriverWait wait= new WebDriverWait(driver,timeout,intervalTime);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementToBeClickable(By locator,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void clickWhenReady(By locator,int timeout) {
		waitForElementToBeClickable(locator, timeout).click();
	}

}
