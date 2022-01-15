package com.selenium.masterpart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleMouseHover {

WebDriver driver =  null;
	
	
	@BeforeMethod
	public  void openBrowser(){
		System.setProperty("webdriver.chrome.driver", 
				"D:/Development Avecto/Selenium_browser_drivers/chromedriver_win32 (1)/chromedriver.exe");
		 driver= new ChromeDriver();
		 
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	@Test
	public void handleMOusehover() {
		driver.get("https://www.americangolf.co.uk/");
		
		WebElement clothlink= driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[1]/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(clothlink).build().perform();
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"CLOTHFOOTW_1\"]/ul/li[3]/ul/li[1]/a/span"))));
		
		WebElement trouserlink= driver.findElement(By.xpath("//*[@id=\"CLOTHFOOTW_1\"]/ul/li[3]/ul/li[1]/a/span"));
		trouserlink.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals("Golf Trousers | Ladies, Men's, Slim Fit Golf Trousers | American Golf", driver.getTitle());
		System.out.println(driver.getTitle());
	}
	
}
