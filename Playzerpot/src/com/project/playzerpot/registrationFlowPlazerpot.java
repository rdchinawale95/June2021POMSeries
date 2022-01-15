package com.project.playzerpot;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class registrationFlowPlazerpot {

	static WebDriver driver;

	@Test
	@BeforeMethod
	public void invokeBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Development Avecto\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		
	}	
	
	
@Test
	public  void newRegistratio() throws InterruptedException {
		String mobilenumber="9850639109";
		String emailID="Test9876@gmail.com";
		driver.get("https://qcweb.playerzpot.com/");
		
		By signup=By.xpath("//a[@onclick='signUpEvent()']");
		doClick(signup);
		
		By mobile=By.xpath("(//input[@type='tel'])[1]");
		doSendKeys(mobile, mobilenumber);
		System.out.println("Registration number is: "+mobilenumber);
		
		By email=By.xpath("//input[@type='email']");
		doSendKeys(email, emailID);
		System.out.println("Registration number is: "+emailID);
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test635@gmail.com");
		By Next=By.xpath("//div[@onclick='check_value();']/span");
		clickWhenReady(Next, 5);
		
	
		By popup=By.xpath("(//div[@class='modal-dialog']//button[text()='OK'])[1]");
		clickWhenReady(popup, 5);
		smallWait();
		
		By password=By.xpath("(//div[@class='custom_focus']//input[@type='password'])[1]");
		doSendKeys(password, "qwerty@123");
		
		By state=By.xpath("//select[@class='form-control select_ajax step2_state']");
		doClick(state);
		By selectState=By.xpath("//select[@class='form-control select_ajax step2_state']/option");
		doClickDDWOSelect(selectState, "Maharashtra");
		
		By Register=By.xpath("//div[@class='text-center']/button[text()='Register']");
		clickWhenReady(Register, 10);
		
		By enterOTP=By.xpath("(//input[@type='tel'])[2]");
		doSendKeys(enterOTP, "123456");
		System.out.println("OTP entered");
		
		smallWait();
		
		By getRegistered=By.xpath("//button[text()='Confirm & Get Registered']");
		doClick(getRegistered);
		
		By congratulations= By.xpath("//h4[@class='modal-title signin_left text-uppercase']");
		String s= getText(congratulations);
		System.out.println("Registrtaion successfull message:"+" "+getText(congratulations));
		//System.out.println("*************");
		
		if (s.contains("Congratulation")) {
			System.out.println("Test case PASSED");
		}
}

	
	
//	@AfterClass
//
//	public static void logoutFromAccount() {
//		driver.get("https://qcweb.playerzpot.com/menu");
//
//		By logout = By.xpath("(//div[@class='more_page_icon'])[17]");
//		doClick(logout);
//		System.out.println("********");
//	}
	
	
	//Have used static for Generic methods so that it can be used in same class
	
		/**
		 * Generic method to select value from any Dropdown
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
		 * @param locator
		 * @param timeout
		 * @return
		 */
		public static WebElement waitForElementToBeClickable(By locator,int timeout) {
			WebDriverWait wait= new WebDriverWait(driver,timeout);
			return wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		
		/**
		 * Generic method to perform click using explicit wait
		 * @param locator
		 * @param timeout
		 */
		public static void clickWhenReady(By locator,int timeout) {
			waitForElementToBeClickable(locator, timeout).click();
		}
		/**
		 * Method to get Webelement
		 * @param locator
		 * @return
		 */
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		/**
		 * Method to send Keys
		 * @param locator
		 * @param value
		 */
		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}

		
		/**
		 * Method to perform click operation
		 * @param locator
		 */
		public static void doClick(By locator) {
			getElement(locator).click();
		}
		
		/**
		 * Method to get text
		 * @param locator
		 * @return
		 */
		public static String getText(By locator) {
			return  getElement(locator).getText();
		}
		
		/**
		 * Small wait
		 * @throws InterruptedException
		 */
		public static void smallWait() throws InterruptedException {
			Thread.sleep(3000);
		}
		
		
		/**
		 * Click using Actions class
		 * @param locator
		 */
		public static void actionsClick(By locator) {
			Actions act= new Actions(driver);
			act.click(getElement(locator)).perform();
		}


	
}
	
