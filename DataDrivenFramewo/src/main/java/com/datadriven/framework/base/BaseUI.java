package com.datadriven.framework.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.datadriven.framework.utils.DateUtils;
import com.datadriven.framework.utils.ExtentReportManager;

public class BaseUI {
	public Properties prop;
	public WebDriver driver;
	public ExtentReports report= ExtentReportManager.getReportInstance();
	public ExtentTest logger;
	
	SoftAssert softAssert = new SoftAssert();

	/****************** Invoke Browser ***********************/
	  
	public void invokeBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Mozilla")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//src//test//resources//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "//src//test//resources//drivers//IEdriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);

		if (prop == null) {
			prop = new Properties();
			try {
				FileInputStream file = new FileInputStream(System.getProperty("user.dir")
						+ "//src//test//resources//ObjectRepository//projectconfig.properties");
				prop.load(file);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
	/****************** Open URL ***********************/
	
	public void openURL(String websiteURLKey) {
		driver.get(prop.getProperty(websiteURLKey));
		
		
	}/****************** Close Browser ***********************/

	public void teardown() {
		driver.close();
	}
	

	/****************** Quit Browser ***********************/

	public void quitbrowser() {
		driver.quit();
	}

	/*
	 * public void enterText(String xpathKey, String data) {
	 * driver.findElement(By.xpath(prop.getProperty(xpathKey))).sendKeys(data); }
	 * 
	 * public void elementclick(String xpathKey) {
	 * driver.findElement(By.xpath(prop.getProperty(xpathKey))).click();
	 * 
	 * }
	 */
	
	/****************** Enter Text ***********************/
	public void enterText(String xpathKey, String data) {
		try {
			getElement(xpathKey).sendKeys(data);
			reportPass(data + " - Entered successfully in locator Element : " + xpathKey);
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}

	/****************** Click Element ***********************/
	public void elementClick(String xpathKey) {
		try {
			getElement(xpathKey).click();
			reportPass(xpathKey + " : Element Clicked Successfully");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	
	/****************** Select List Drop Down ******************/
	public void SelectElementInList(String locatorXpath, String Value){
		try{
			List<WebElement> listElement = driver.findElements(By.xpath(locatorXpath));
			for (WebElement listItem : listElement) {
				String prefix = listItem.getText();
				//System.out.println(prefix);
				if(prefix.contains(Value)){
					//System.out.println("Inside if statenment");
					waitForPageLoad();
					listItem.click();
				}	
			}
			logger.log(Status.INFO, "Selected the Defined Value : " +Value);
		}catch (Exception e){
			reportFail(e.getMessage());
		}
	}
	

	private void findElements(By id) {
		// TODO Auto-generated method stub
		
	}
	
	/****************** Identify Element ***********************/
	public WebElement getElement(String locatorKey) {

		WebElement element = null;

		try {
			if (locatorKey.endsWith("_Id")) {
				element = driver.findElement(By.id(prop.getProperty(locatorKey)));
			} else if (locatorKey.endsWith("_Xpath")) {
				element = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
			} else if (locatorKey.endsWith("_CSS")) {
				element = driver.findElement(By.cssSelector(prop.getProperty(locatorKey)));
			} else if (locatorKey.endsWith("_LinkText")) {
				element = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
			} else if (locatorKey.endsWith("_PartialLinkText")) {
				element = driver.findElement(By.partialLinkText(prop.getProperty(locatorKey)));
			} else if (locatorKey.endsWith("_Name")) {
				element = driver.findElement(By.name(prop.getProperty(locatorKey)));
			} else {
				reportFail("Failing the testcase, invalid locator" + locatorKey);
				Assert.fail("Failing the testcase, invalid locator" + locatorKey);
			}

		} catch (Exception e) {
			reportFail(e.getMessage());
			e.printStackTrace();

			Assert.fail("Failing the Testcase :" + e.getMessage());
		}

		return element;
	}
	
	/****************** Handle Frames **********************/
	public void switchToFrame(String frameLocator){
		try {
			logger.log(Status.INFO, "Switching Frame : " + frameLocator);
			driver.switchTo().frame(frameLocator);
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	

	public void switchToFrameByIndex(int frameNumner){
		try {
			logger.log(Status.INFO, "Switching Frame : " + frameNumner);
			driver.switchTo().frame(frameNumner);
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	public void switchToDefaultFrame(){
		try {
			logger.log(Status.INFO, "Switching to Main Windpw");
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	

	/****************** Verify Element ***********************/
	public boolean isElementPresent(String locatorKey) {
		try {
			if (getElement(locatorKey).isDisplayed()) {
				reportPass(locatorKey + " : Element is Displayed");
				return true;
			}
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		return false;
	}

	public boolean isElementSelected(String locatorKey) {
		try {
			if (getElement(locatorKey).isSelected()) {
				reportPass(locatorKey + " : Element is Selected");
				return true;
			}
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		return false;
	}

	public boolean isElementEnabled(String locatorKey) {
		try {
			if (getElement(locatorKey).isEnabled()) {
				reportPass(locatorKey + " : Element is Enabled");
				return true;
			}
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		return false;
	}

	public void verifyPageTitle(String pageTitle) {
		try {
			String actualTite = driver.getTitle();
			logger.log(Status.INFO, "Actual Title is : " + actualTite);
			logger.log(Status.INFO, "Expected Title is : " + pageTitle);
			Assert.assertEquals(actualTite, pageTitle);
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}


	
	/****************** Assertion Functions ***********************/
	public void assertTrue(boolean flag) {
		softAssert.assertTrue(flag);
	}

	public void assertfalse(boolean flag) {
		softAssert.assertFalse(flag);
	}

	public void assertequals(String actual, String expected) {
		try{
			logger.log(Status.INFO, "Assertion : Actual is -" + actual + " And Expacted is - " + expected);
			softAssert.assertEquals(actual, expected);
		}catch(Exception e){
			reportFail(e.getMessage());
		}
		
	}
/*************Reporting function*****************/
	public void reportFail(String reportString) {
		logger.log(Status.FAIL, reportString);
		takeScreenShotOnFailure();
		Assert.fail(reportString);
	}

	public void reportPass(String reportString) {
		logger.log(Status.PASS, reportString);
	}

	@AfterMethod
	public void afterTest() {
		softAssert.assertAll();
		driver.quit();
	}


/****************** Capture Screen Shot ***********************/
public void takeScreenShotOnFailure() {
	TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
	File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

	File destFile = new File(System.getProperty("user.dir") + "/ScreenShots/" + DateUtils.gettimeStamp() + ".png");
	try {
		FileUtils.copyFile(sourceFile, destFile);
		logger.addScreenCaptureFromPath(
				System.getProperty("user.dir") + "/ScreenShots/" + DateUtils.gettimeStamp() + ".png");

	} catch (IOException e) {
		e.printStackTrace();
	}

}

/***************** Wait Functions in Framework *****************/
public void waitForPageLoad() {
	JavascriptExecutor js = (JavascriptExecutor) driver;

	int i = 0;
	while (i != 180) {
		String pageState = (String) js.executeScript("return document.readyState;");
		if (pageState.equals("complete")) {
			break;
		} else {
			waitLoad(1);
		}
	}

	waitLoad(2);

	i = 0;
	while (i != 180) {
		Boolean jsState = (Boolean) js.executeScript("return window.jQuery != undefined && jQuery.active == 0;");
		if (jsState) {
			break;
		} else {
			waitLoad(1);
		}
	}
}

public void waitLoad(int i) {
	try {
		Thread.sleep(i * 1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

/**************** Core Application Functions ******************/
public void doLogin(){
	logger.log(Status.INFO, "Logging the Application");
	invokeBrowser("Chrome");
	openURL("websiteURL");
	elementClick("zohoLoginTextBox_ClassName");
	enterText("zohoUserNameTextBox_Id", "anshulc55@gmail.com");
	enterText("zhPasswordTB_Id", "Test@12345");
	elementClick("zhSignBtn_Id");
	waitForPageLoad();
	verifyPageTitle("Zoho Home");
}

@AfterTest
public void endReport() {
report.flush();

}
}
