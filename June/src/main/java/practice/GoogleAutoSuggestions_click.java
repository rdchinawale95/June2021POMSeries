package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutoSuggestions_click {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// driver.get("https://www.google.co.in/");
		driver.get("http://automationpractice.com/index.php");

//		driver.findElement(By.name("q")).sendKeys("Naveen Automation labs");
//		Thread.sleep(3000);

		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(6000);

		// driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']//span"));

		//List<WebElement> autoSugg = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']//span"));

		List<WebElement> autoSugg = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		
		for (WebElement e : autoSugg) {
			String a = e.getText();
			System.out.println(a);

//			if (a.equals("naveen automation labs udemy")) {
//				e.click();
//				break;
//			}
			
			if (a.equals("Summer Dresses > Printed Chiffon Dress")) {
				e.click();
				break;
			}
		}

	}

}
