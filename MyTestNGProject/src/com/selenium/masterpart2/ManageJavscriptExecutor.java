package com.selenium.masterpart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManageJavscriptExecutor {

	WebDriver driver =  null;
	@BeforeMethod
	public  void openBrowser(){
		System.setProperty("webdriver.chrome.driver", 
				"D:/Development Avecto/Selenium_browser_drivers/chromedriver_win32 (1)/chromedriver.exe");
		 driver= new ChromeDriver();
		 
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void AutoSugg() {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.get("https://www.rediff.com/");
		js.executeScript("window.location='https://www.rediff.com/'");
		
		String pageTitle= (String) js.executeScript("return document.title");
		Assert.assertEquals(pageTitle, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		WebElement signinBTn= driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]"));
		js.executeScript("arguments[0].click();", signinBTn);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement username= driver.findElement(By.xpath("//*[@id=\"login1\"]"));
		js.executeScript("arguments[0].value='rchinawale007@gmail,com';", username);
		
		System.out.println("EOD");
	/*	js.executeScript("window.scrollBy(0,3000)");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement termslink= driver.findElement(By.xpath("/html/body/div[7]/a[11]"));
		js.executeScript("arguments[0].scrollIntoView(true);", termslink);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("EOD");
		
		*/
		
	}
		
}
