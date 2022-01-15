package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumsessions.JavaScriptUtil;

public class javaScriptExecutor {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		js.executeScript("window.scrollBy(0,800");
		String s=js.executeScript("return document.documentElement.innerText;").toString();
		//System.out.println(s);
		
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		WebElement emailid = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		
		JavaScriptUtil ju= new JavaScriptUtil(driver);
		ju.flash(emailid);
		emailid.sendKeys("naveen");
		ju.flash(password);
		password.sendKeys("automartion");
		ju.flash(loginBtn);
		Thread.sleep(2000);
		ju.scrollPageDown();
		Thread.sleep(2000);
		ju.scrollPageUp();
		Thread.sleep(2000);
		ju.scrollPageDown("800");
		Thread.sleep(2000);
		System.out.println("///////////");
		ju.scrollIntoView(emailid);
		ju.drawBorder(password);
		
		
		System.out.println("*****************");
	}

}
