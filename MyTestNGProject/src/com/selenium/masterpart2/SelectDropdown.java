package com.selenium.masterpart2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDropdown {
WebDriver driver =  null;
	
	@BeforeMethod
	public  void openBrowser(){
		System.setProperty("webdriver.chrome.driver", 
				"D:/Development Avecto/Selenium_browser_drivers/chromedriver_win32 (1)/chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	}
@AfterMethod
public void closeBrowser() {
	driver.quit();
}

@Test
public void handleFacebook() {
	
	WebElement monthDrpdwn= driver.findElement(By.name("birthday_month"));
	
	Select select= new Select(monthDrpdwn);
	select.selectByIndex(5);
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	select.selectByValue("11");
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//Please discover all the options on selecting select.Alt+space
	
	List<WebElement> monthvalues= select.getOptions();
	for (WebElement allvalues : monthvalues) {
		
		System.out.println(allvalues.getText());
		
	}
	}
	

}
