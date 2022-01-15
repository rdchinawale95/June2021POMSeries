

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//win;
		//System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		
		//mac:
		System.setProperty("webdriver.chrome.driver", "D:\\Development Avecto\\chromedriver_win32\\chromedriver.exe");
		
		//Automation Steps:
		//top casting: 
		WebDriver driver = new ChromeDriver();//launch browser
		
		//enter the url:
		driver.get("https://www.google.com");
		
		//get the title:
		String title = driver.getTitle();
		System.out.println("page title is: " + title);
		
		//validation point/checkpoint/act vs exp result
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		//automation steps + validation point--> automation testing
		
	//	driver.quit();//close the browser
		
	}

}
