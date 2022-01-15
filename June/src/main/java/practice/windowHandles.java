package practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		

		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='realme C20 (Cool Blue, 32 GB)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='realme C20 (Cool Grey, 32 GB)']")).click();
		Thread.sleep(3000);

		
		String s=driver.getWindowHandle();
		System.out.println("Parent window"+s);
		System.out.println(s.length());
		
		Set<String> t=driver.getWindowHandles();
		System.out.println(t.size());
		
		for (String child : t) {
			if (!s.equalsIgnoreCase(child)) {
				String win=driver.switchTo().window(child).getTitle();
				
				
				//sSystem.out.println("child window is"+driver.getTitle());
//				Thread.sleep(2000);
//				driver.close();
			}
		}
		//driver.switchTo().window(s);
		
		
		ArrayList<String> u= new ArrayList<String>(t);
		Thread.sleep(6000);
	driver.switchTo().window(u.get(2));
	Thread.sleep(6000);
	//driver.close();
	
	System.out.println("closed 2");
	

	driver.switchTo().window(u.get(0));
	Thread.sleep(3000);
	driver.switchTo().window(u.get(1));
	Thread.sleep(3000);
	//driver.close();
	System.out.println("closed 1");
	
	
	
	driver.switchTo().window(u.get(0));
	Thread.sleep(3000);
	
	driver.switchTo().window(u.get(1));
	Thread.sleep(3000);

	//driver.close();
	Thread.sleep(3000);
	System.out.println("closed 0");
	System.out.println("************");
	
	
		
	}

}
