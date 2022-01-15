package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		// driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight
		// ui-state-active']")).click();

		// span[text()='Next']
		
		futureDate("August 2022", "30");

	}

	public static void futureDate(String month_Year, String date) {
		
		if(Integer.parseInt(date)>31) {
			System.out.println("wrong date passed...please pass the correct date...");
			return;
		}
		
		String actualDY = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actualDY);
		
		while (!actualDY.equalsIgnoreCase(month_Year)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actualDY = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
	}

}
