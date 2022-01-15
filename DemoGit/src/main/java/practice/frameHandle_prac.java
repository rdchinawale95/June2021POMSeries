package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameHandle_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);
		List<WebElement> e=driver.findElements(By.tagName("frame"));
		System.out.println(e.size());
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header= driver.findElement(By.xpath("/html/body/h2")).getText();
		
		System.out.println(header);
		
	}

}
