package com.selenium.masterpart2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleMultileWindows {
	
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

//@Test
public void handleFacebook() {
	driver.get("https://www.facebook.com/");
	String mainPageWindow= driver.getWindowHandle();
	System.out.println(mainPageWindow);
	
	driver.findElement(By.linkText("Forgotten account?"));	
	String forgotAccountPage= driver.getWindowHandle();
	System.out.println("Forgot Account Page id: "+ forgotAccountPage);
	
}
@Test
public void handleMultiTabsd() {
	driver.get("https://www.jobserve.com");
	String mainPageWindow= driver.getWindowHandle();
	System.out.println(mainPageWindow); 	
	System.out.println("Main page id of jobserve: "+mainPageWindow);
	
	driver.findElement(By.id("SPTPosTitleLink")).click();
	//String currentwindow= driver.getWindowHandle();
	//System.out.println("Forgot Account Page id: "+ currentwindow);
	
	Set<String> windowIDs = driver.getWindowHandles();
	Iterator<String> itr= windowIDs.iterator();
	
	String mainPageID= itr.next();
	String jobPageid= itr.next();
	
	driver.switchTo().window(jobPageid);
	
	String jobheading= driver.findElement(By.id("md_skills")).getText();
	System.out.println(jobheading);
	
	driver.close();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	driver.switchTo().window(mainPageID);
	
	driver.findElement(By.id("txtKey")).sendKeys("selenium webdriver");

	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
