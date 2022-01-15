package com.selenium.masterpart2;

import java.util.List;
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

public class Handlewebtable {

	
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
	public <E> void webtable() {
	driver.get("https://money.rediff.com/indices");
	
	driver.findElement(By.xpath("//*[@id='showMoreLess']")).click();
	
	List<WebElement> totalRows = driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr"));
			
	System.out.println("No. of rows= "+totalRows.size());
		
	List<WebElement> totalcol = driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr[5]/td"));
	
	System.out.println("No. of col= "+totalcol.size());
	
List<WebElement> columns = driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr[3]/td"));
	System.out.println("**************3rd row***********");
	for (WebElement column: columns) {           //imp get it understand
		System.out.println( column.getText());
	}
	
	List<WebElement> column = driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr[3]/td"));
	System.out.println("**************1st coloumn***********");
	for (WebElement col: column) {
		System.out.println( col.getText());
	}
	System.out.println("****************check*********");
	for (WebElement xyz : totalcol) {
		
		
		System.out.println(xyz.getText());
		
	}
	
	System.out.println("****************complete table data*********");
	for (WebElement xyz : totalRows) {
		
		
		System.out.println(xyz.getText());
	
	}
	}
	
}

