package com.project.playerzpot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registrationFlowPlayerzpot {

	static WebDriver driver;

	/**
	 * Main method to run registration flow
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Development Avecto\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newRegistrationFlow("7789299929", "test75360@gmail.com");

	}

	public static void newRegistrationFlow(String mobilenumber, String emailID) throws InterruptedException {
		driver.get("https://qcweb.playerzpot.com/");

		By signup = By.xpath("//a[@onclick='signUpEvent()']");
		doClick(signup);

		By mobile = By.xpath("(//input[@type='tel'])[1]");
		doSendKeys(mobile, mobilenumber);
		System.out.println("Registration number is: " + mobilenumber);

		By email = By.xpath("//input[@type='email']");
		doSendKeys(email, emailID);
		System.out.println("Registration email is: " + emailID);

		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test635@gmail.com");
		By Next = By.xpath("//div[@onclick='check_value();']/span");
		clickWhenReady(Next, 10);

		By popup = By.xpath("(//div[@class='modal-dialog']//button[text()='OK'])[1]");
		clickWhenReady(popup, 10);
		;

		By password = By.xpath("(//div[@class='custom_focus']//input[@type='password'])[1]");
		smallWait();
		doSendKeys(password, "qwerty@123");

		By state = By.xpath("//select[@class='form-control select_ajax step2_state']");
		doClick(state);

		By selectState = By.xpath("//select[@class='form-control select_ajax step2_state']/option");
		doClickDDWOSelect(selectState, "Maharashtra");

		By Register = By.xpath("//div[@class='text-center']/button[text()='Register']");
		clickWhenReady(Register, 10);

		By enterOTP = By.xpath("(//input[@type='tel'])[2]");
		smallWait();
		doSendKeys(enterOTP, "123456");
		System.out.println("OTP entered");

		smallWait();

		By getRegistered = By.xpath("//button[text()='Confirm & Get Registered']");
		doClick(getRegistered);

		System.out.println("Test case PASSED");
		Thread.sleep(5000);
		driver.close();

	}
	// Have used static for Generic methods so that it can be used in same clSass

	/**
	 * Generic method to select value from any Dropdown
	 * 
	 * @param locator
	 * @param value
	 */
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

	/**
	 * Method to perform click operation
	 * 
	 * @param locator
	 */
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	/**
	 * Method to get text
	 * 
	 * @param locator
	 * @return
	 */
	public static String getText(By locator) {
		return getElement(locator).getText();
	}

	/**
	 * Small wait
	 * 
	 * @throws InterruptedException
	 */
	public static void smallWait() throws InterruptedException {
		Thread.sleep(3000);
	}

	/**
	 * Click using Actions class
	 * 
	 * @param locator
	 */
	public static void actionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}
