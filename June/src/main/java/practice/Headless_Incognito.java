package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Incognito {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions co= new FirefoxOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver=new FirefoxDriver(co);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
