package com.selenium.masterpart2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleDragandDrop {
	
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
	public void performDrag() {
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.linkText("Draggable")).click();
		
		driver.switchTo().frame(0);
		
		WebElement dragAble= driver.findElement(By.id("draggable"));
		
		Actions action= new Actions(driver);
		action.dragAndDropBy(dragAble, 110, 120).build().perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
		//@Test
		public void dragDrop(){
			driver.get("https://jqueryui.com/");
			
			driver.findElement(By.linkText("Droppable")).click();
			
			driver.switchTo().frame(0);
			WebElement src= driver.findElement(By.id("draggable"));
			WebElement dst= driver.findElement(By.id("droppable"));
			
			
			Actions action= new Actions(driver);
			action.dragAndDrop(src, dst).build().perform();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		@Test
		public void dragDrop1(){
			driver.get("https://jqueryui.com/");
			
			driver.findElement(By.linkText("Droppable")).click();
			
			driver.switchTo().frame(0);
			WebElement src= driver.findElement(By.id("draggable"));
			WebElement dst= driver.findElement(By.id("droppable"));
			
			
			Actions action= new Actions(driver);
			action.clickAndHold(src).moveToElement(dst).release(dst).build().perform();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		}
}
