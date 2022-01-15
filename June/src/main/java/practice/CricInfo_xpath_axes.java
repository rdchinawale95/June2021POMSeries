package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfo_xpath_axes {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-tour-of-sri-lanka-2021-1262739/sri-lanka-vs-india-3rd-odi-1262757/full-scorecard");
	getWicketStats("Navdeep Saini");
	//getWicketStats("Praveen Jayawickrama");	
	}
	
	public static void getWicketStats(String name) {
		
		List<WebElement> bowlingStats=driver.findElements(By.xpath("//a[text()='"+name+"']//parent::td//following-sibling::td"));
		for (WebElement e : bowlingStats) {
			String s= e.getText();
			System.out.println(s);
		}
	}

}
