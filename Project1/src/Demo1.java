import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System. setProperty("webdriver.chrome.driver", "D://Development Avecto//Selenium_browser_drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}

}
