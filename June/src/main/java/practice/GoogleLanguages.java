package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguages {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		By langs = By.xpath("//*[@id=\"SIvCob\"]/a");
		
		clickLanguage(langs, "मराठी");
		
	}

	/// *[@id="SIvCob"]

	/*
	 * List<WebElement> lngList = driver.findElements(langs); lngList.size();
	 * 
	 * for (WebElement l : lngList) { String s = l.getText(); System.out.println(s);
	 * 
	 * if (s.contains("मराठी")) { l.click(); break; }
	 * 
	 * }
	 * 
	 * }
	 */

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void clickLanguage(By locator, String value) {
		List<WebElement> lngList = getElements(locator);
		lngList.size();

		for (WebElement l : lngList) {
			String s = l.getText();
			System.out.println(s);

			if (s.contains("मराठी")) {
				l.click();
				break;
			}

		}
System.out.println("***************");
	}
}
