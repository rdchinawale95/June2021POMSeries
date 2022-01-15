package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By Industry = By.id("Form_submitForm_Industry");
		By Country = By.name("Country");
//
//		WebElement Ind = getElement(Industry);
//		WebElement Cntry = getElement(Country);
		
		List<String> s= getDDOptions(Industry);
		
		if (s.size()==21) {
			System.out.println("TC001_DDcount: PASS");
		}
		
		if (s.contains("Education")) {
			System.out.println("TC002_'Education' option exists in DD: PASS");
		}
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getDDOptions(By locator) {

		List<String> DropDwnList = new ArrayList<String>();
		Select a = new Select(getElement(locator));
		List<WebElement> optionsDD = a.getOptions();

		for (WebElement e : optionsDD) {
			String op = e.getText();
			DropDwnList.add(op);
		}
		return DropDwnList;
	}

	public static void doClickDDOption(By locator, String value) {

		Select a = new Select(getElement(locator));
		List<WebElement> optionsDD = a.getOptions();

		for (WebElement e : optionsDD) {
			String op = e.getText();

			if (optionsDD.equals(value)) {
				e.click();
				break;
			}
		}

	}
}
