package com.project.playerzpot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		login("8855067542", "qwerty@123");
		logoutFromAccount();
		driver.close();
		
	}
	
	public static void login(String mobileNumber, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Development Avecto\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://qcweb.playerzpot.com/");

		By mobile = By.xpath("//input[@type='tel']");
		doSendKeys(mobile, mobileNumber);

		By submit = By.xpath("//input[@type='submit']");
		doClick(submit);

		smallWait();

		By passwordfield = By.xpath("//input[@type='password']");
		doSendKeys(passwordfield, password);
		smallWait();

		By loginButton = By.xpath("//input[@type='submit']");
		doClick(loginButton);

		By noThanks = By.cssSelector("#wzrk-cancel");
		clickWhenReady(noThanks, 5);
		System.out.println("Logged with user: "+ mobileNumber);

	}

	public static void logoutFromAccount() throws InterruptedException {
		
		
		driver.get("https://qcweb.playerzpot.com/menu");

		By logout = By.xpath("(//div[@class='more_page_icon'])[17]");
		doClick(logout);
		By logoutButton = By.xpath("(//div[@class='vertically-center'])[2]");
		doClick(logoutButton);
		System.out.println("Logged out from Palyerzpot");
		smallWait();
		
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
	

	/**
	 * Generic method for waiting for element using explicit wait
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementToBeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * Generic method to perform click using explicit wait
	 * 
	 * @param locator
	 * @param timeout
	 */
	public static void clickWhenReady(By locator, int timeout) {
		waitForElementToBeClickable(locator, timeout).click();
	}

	/**
	 * Method to get Webelement
	 * 
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * Method to send Keys
	 * 
	 * @param locator
	 * @param value
	 */
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void smallWait() throws InterruptedException {
		Thread.sleep(3000);
	}

}
