package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitUtilities {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.name("proceed")).click();

//		System.out.println(a.getText());
//		a.accept();

//		waitForalert(5);
//		String s = getAlertText(5);
//		System.out.println(s);
		// acceptAlert(5);

	//String s= waitForTitleContains("Rediff", 5);
	String s= waitForTitleIs("Rediffmail", 5);
	System.out.println(s);
	System.out.println("******");
	}

	public static String waitForTitleContains(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleContains(titleValue))) {
			return driver.getTitle();
		}
		return null;
	}
	
	public static String waitForTitleIs(String fullTitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleIs(fullTitle))) {
			return driver.getTitle();
		}
		return null;
	}

	public static Alert waitForalert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(int timeout) {

		String text = waitForalert(timeout).getText();
		acceptAlert(5);
		return text;
	}

	public static void acceptAlert(int timeout) {
		waitForalert(timeout).accept();
	}

	public static void dismissAlert(int timeout) {
		waitForalert(timeout).dismiss();
	}

	public static void sendKeysAlert(int timeout, String value) {
		waitForalert(timeout).sendKeys(value);
	}
}
