package com.live.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginRediff {
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
	public void redifflog() {
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		
		driver.findElement(By.id("useremail")).sendKeys("anshulc55@rediffmail.com");
		
		driver.findElement(By.id("useremail")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("userpass")).sendKeys("Test@1234");
		
		driver.findElement(By.id("userpass")).sendKeys(Keys.ENTER);
		
		
		
	}
}