package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandles1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		// driver.get("https://www.hyrtutorials.com/p/window...");
		driver.get("https://www.cowin.gov.in/");

		// Store the ID of the parent window
		String parentWindow = driver.getWindowHandle();

		// Click the link which opens in a new window

		WebDriverWait wait = new WebDriverWait(driver, 5000);

		WebElement sample = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Book Your Slot ']")));
		sample.click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()=' Book Your Slot ']")).click();

		// Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
			if (!parentWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				Thread.sleep(2000);
				System.out.println("window switched"+driver.getTitle());
				driver.findElement(By.id("mat-input-0")).sendKeys("8855067542");
				Thread.sleep(2000);
				driver.close();
				System.out.println("details entered");
				break;
			}
		}

		// ==== Closing a window or tab ====
		// When you are finished with a window or tab and it is not the last window or
		// tab open in your browser, you should close it and switch back to the window
		// you were using previously. Assuming you followed the code sample in the above
		// section you will have the previous window handle stored in a variable. Put
		// this together and you will get:

		// Close the tab or window
		// driver.close();

		// Switch back to the old tab or window
		driver.switchTo().window(parentWindow);
		System.out.println("switched to parent");
		driver.close();
		System.out.println("************");

	}

}
