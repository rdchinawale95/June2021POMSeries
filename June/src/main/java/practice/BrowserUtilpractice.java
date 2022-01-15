package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtilpractice {

	public WebDriver driver;
	/**
	 *	Method to launch browsers
	 * @param Browser
	 * @return Webdriver driver
	 */
	public WebDriver Browserlaunch(String Browser) {
		
		switch (Browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Development Avecto\\chromedriver_win32 (3)\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Development Avecto\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			
		default:
			break;
		}
		
		return driver;
	}

	
	public void launchURL(String url) {
		if(url==null) {
			return;
		}
		if(url.isEmpty()) {
			return;
		}
		driver.get(url);
	}
	
	public String getTitle() {
		return	driver.getTitle();
	}
	
	
	public String getCurrentUrl() {
		return	driver.getCurrentUrl();
	}
	
	public String getPageSourch() {
		return	driver.getPageSource();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
		
	public void closeBrowser() {
		driver.close();
	}

	
	
	}
	

