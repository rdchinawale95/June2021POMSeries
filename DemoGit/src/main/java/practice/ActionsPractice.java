package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPractice {


		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			// driver.get("https://www.google.co.in/");
			driver.get("https://demo.opencart.com/index.php?route=account/register");
			Thread.sleep(2000);

			driver.manage().window().maximize();
			
			WebElement FN= driver.findElement(By.id("input-firstname"));
			WebElement LN= driver.findElement(By.id("input-lastname"));
			WebElement email= driver.findElement(By.id("input-email"));
			WebElement telephone= driver.findElement(By.id("input-telephone"));
			WebElement password= driver.findElement(By.id("input-password"));
			WebElement confirm= driver.findElement(By.id("input-confirm"));
			WebElement subscribe= driver.findElement(By.name("newsletter"));
			WebElement PrivacyPolicy= driver.findElement(By.name("agree"));
			WebElement continueButton= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
			
			
			Actions act= new Actions(driver);
			act.sendKeys(FN,"Rupesh").perform();
			act.sendKeys(LN,"Chinawale").perform();
			act.sendKeys(email,"rchinawale0007@gmail.com").perform();
			act.sendKeys(telephone,"8855067542").perform();
			act.sendKeys(password,"Televison1@2").perform();
			act.sendKeys(confirm,"Televison1@2").perform();
			act.click(subscribe).perform();
			act.click(PrivacyPolicy).perform();
			act.click(continueButton).perform();
			String s= driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
			System.out.println(s);
	}

}
