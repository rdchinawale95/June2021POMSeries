package com.project.playerzpot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addMoneyToPlayerzpot {

	static WebDriver driver;

	/**
	 * Main method to run the add money script
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

		addMoneyToAccount("8855067542", "qwerty@123", 100);

		// Logout is also included after addition of amount
		logoutFromAccount();
	}

	/**
	 * Method for adding money to wallet using cards. User needs to pass Mobile
	 * number and password to method for executing Method contains By locators and
	 * generic methods have been leveraged
	 * 
	 * @param mobileNumber
	 * @param password
	 * @throws InterruptedException
	 */
	public static void addMoneyToAccount(String mobileNumber, String password, int amount) throws InterruptedException {
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

		By moreButton = By.xpath("(//div[@class='footer text-center menu-footer']/a)[4]");
		clickWhenReady(moreButton, 5);

		By wallet = By.xpath("(//div[@class='more_page_icon'])[2]");
		doClick(wallet);

		By balance = By.xpath("//div[@class='col-50']");
		System.out.println("Current Balance is: " + " " + getText(balance));

		By deposit = By.xpath("//button[@data-target=\"#deposit_amnt_pups\"]");
		clickWhenReady(deposit, 10);

		By enterAmount = By.xpath("//input[@placeholder=\"Enter amount\"]");
		String s = String.valueOf(amount);
		doSendKeys(enterAmount, s);
		System.out.println("Entered amount is: " + s);

		By addMoney = By.xpath("(//div[@class='vertically-center'])[1]");
		doClick(addMoney);

		By addCard = By.xpath("(//div[@class='ppm-orange add-new-txt'])[1]");
		doClick(addCard);

		smallWait();

		By CC = By.name("ccard_number");
		doSendKeys(CC, "5123");
		doSendKeys(CC, "4567");
		doSendKeys(CC, "8901");
		doSendKeys(CC, "2346");

		smallWait();

		By nameonCC = By.id("cname_on_card");
		doSendKeys(nameonCC, "Test Test");

		By CVV = By.name("ccvv_number");
		doSendKeys(CVV, "123");

		By month = By.id("cexpiry_date_month");
		doClick(month);

		By selectMonth = By.xpath("//select[@id='cexpiry_date_month']/option");
		doClickDDWOSelect(selectMonth, "Aug (8)");

		By Year = By.id("cexpiry_date_year");
		doClick(Year);

		By selectYear = By.xpath("//select[@id='cexpiry_date_year']/option");
		doClickDDWOSelect(selectYear, "2021");

		By payButton = By.name("pay_button");
		doClick(payButton);

		By OTPBank = By.name("password");
		doSendKeys(OTPBank, "123456");

		By OTPpayButton = By.id("submitBtn");
		doClick(OTPpayButton);

		System.out.println("New Balance is: " + getText(balance));
		System.out.println("Testcase PASSED");

		smallWait();
		

	}

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

	public static void logoutFromAccount() {
		driver.get("https://qcweb.playerzpot.com/menu");

		By logout = By.xpath("(//div[@class='more_page_icon'])[17]");
		doClick(logout);
		By logoutButton = By.xpath("(//div[@class='vertically-center'])[2]");
		doClick(logoutButton);
	}

}
