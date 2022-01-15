package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Spicejet {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.get("https://www.google.co.in/");
		driver.get("https://www.spicejet.com");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		WebElement spicemem = driver.findElement(By.xpath("//a[text()=\"SpiceClub Members\"]"));
		WebElement LoginSignup = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[18]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));

		Actions ac = new Actions(driver);
		ac.moveToElement(login).perform();

		ac.moveToElement(spicemem).perform();
		Thread.sleep(2000);
		ac.moveToElement(LoginSignup).perform();
		LoginSignup.click();
		Thread.sleep(2000);
		System.out.println("**************");

	}

}
