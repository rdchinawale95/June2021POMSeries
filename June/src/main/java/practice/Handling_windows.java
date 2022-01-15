package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_windows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		//
		//driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		//String ParentWindow=driver.getWindowHandle();
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parent=it.next();
		System.out.println("parent window: "+parent);
		
		String child1= it.next();
		System.out.println("child1 window: "+child1);

		
		driver.switchTo().window(child1);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		//Set<String> windows1= driver.getWindowHandles();
		windows= driver.getWindowHandles();
/*
		 it= windows.iterator();
			parent=it.next();
		String child2=it.next();
		System.out.println("child2 window: "+child2);
		
		driver.switchTo().window(child2);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		*/
		
		
		List<String> windowsArray= new ArrayList<String>(windows);
		
		String parent3= windowsArray.get(0);
		String child3=windowsArray.get(1);
		
		driver.switchTo().window(parent3);
		System.out.println("parent"+parent3);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child3);
		System.out.println("child3"+child3);
		System.out.println(driver.getTitle());
		
		
	}

}
