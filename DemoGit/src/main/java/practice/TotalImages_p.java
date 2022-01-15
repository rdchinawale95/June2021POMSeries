package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages_p {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		By images = By.tagName("img");
		
		

		List<WebElement> imageList = getElements(images);

		System.out.println(imageList.size());
		/*
		 * for (int i = 0; i < imageList.size(); i++) { String
		 * im=imageList.get(i).getAttribute("alt"); System.out.println(i+":= "+im);
		 * 
		 * if (im.isEmpty()) { System.out.println("Blank alt attribute value"); }
		 */

		for (WebElement e : imageList) {
			String imge = e.getAttribute("alt");
			System.out.println(imge);

			try {
				if (imge.contains("Helmets")) {
					e.click();
					break;
				}
			} catch (Exception a) {
				
			}
		}
	
	}
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
}
		

	


