package com.selenium.masterpart2;

import java.awt.RenderingHints.Key;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Redbus {
	
	WebDriver driver =  null;
	@BeforeMethod
	public  void openBrowser(){
		System.setProperty("webdriver.chrome.driver", 
				"D:/Development Avecto/Selenium_browser_drivers/chromedriver_win32 (1)/chromedriver.exe");
		 driver= new ChromeDriver();
		 
		driver.get("https://www.airasia.com/flights/india");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void datepick() {
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[1]/div[1]/div/input")).sendKeys("Pune (PNQ)");
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[1]/div[1]/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[1]/div[2]/div/input")).sendKeys("New Delhi (DEL)");
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[1]/div[2]/div/input")).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[2]/div[1]/div/div/div")).click();
		
		
		select("15/06/2020");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[2]/div[2]/div/div/div")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		returnd("20/07/2020");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@class='SearchWidget__SearchBtn-y4671b-1 cAYekw']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());
		
////*[@id="gatsby-focus-wrapper"]/div[2]/div/div/div[2]/div[2]/div/span/div/div/div[1]/button[3]
		
		

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("EOD********************");
		////*[@id="gatsby-focus-wrapper"]/div[2]/div/div/a
	}
	
	public void select(String date)
	{
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date expectedDate = dateFormat.parse(date);

			String day = new SimpleDateFormat("dd").format(expectedDate);
			String month = new SimpleDateFormat("MMMM").format(expectedDate);
			String year = new SimpleDateFormat("yyyy").format(expectedDate);

			String expectedMonthYear = month + " " + year;

			while (true){
				String displayDate = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[2]/div[1]/div/span/div/div/div[1]/button[3]")).getText();
					
				if (expectedMonthYear.equals(displayDate)) {
					//System.out.println("Both dates are equal");
					//select the date	
					driver.findElement(By.xpath("//*[@aria-label='"+month+" "+day+", "+year+"']")).click();
					break;
				} else if(expectedDate.compareTo(currentDate)>0) {
					driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[2]/div[1]/div/span/div/div/div[1]/button[4]")).click();
				}else{
					System.out.println("Pritnt");
				}

			}
		}catch (ParseException e) {
			e.printStackTrace();
		}
		}
	


public void returnd(String date)
{
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	try {
		Date expectedDate = dateFormat.parse(date);

		String day = new SimpleDateFormat("dd").format(expectedDate);
		String month = new SimpleDateFormat("MMMM").format(expectedDate);
		String year = new SimpleDateFormat("yyyy").format(expectedDate);

		String expectedMonthYear = month + " " + year;

		while (true){
			String displayDate = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[2]/div[2]/div/span/div/div/div[1]/button[3]")).getText();
				
			if (expectedMonthYear.equals(displayDate)) {
				//System.out.println("Both dates are equal");
				//select the date	
				driver.findElement(By.xpath("//*[@aria-label='"+month+" "+day+", "+year+"']")).click();
				break;
			} else if(expectedDate.compareTo(currentDate)>0) {
				driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div[2]/div[2]/div/span/div/div/div[1]/button[4]")).click();
			}else{
				System.out.println("Pritnt");
			}

		}
	}catch (ParseException e) {
		e.printStackTrace();
	}
	}
}


		

	
	


