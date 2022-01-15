package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.get("https://www.google.co.in/");
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement destination= driver.findElement(By.id("droppable"));
		
		
		Actions act= new Actions(driver);
		//act.clickAndHold(source).moveToElement(destination).release().build().perform();
		act.dragAndDrop(source, destination).perform();
		
	}

}
