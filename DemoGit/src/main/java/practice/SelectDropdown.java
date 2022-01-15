package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Industry= By.id("Form_submitForm_Industry");
		By Country= By.name("Country");
		
		
		
		WebElement Ind=getElement(Industry);
		WebElement Cntry= getElement(Country);
		
	/*	Select select= new Select(Ind);
		//select.selectByIndex(5);
		//select.selectByValue("Aerospace");
		select.selectByVisibleText("Computer / Technology - Reseller (inc VAR)");
		
		
		Select s= new Select(Cntry);
		//s.selectByIndex(7);
		//s.selectByValue("Australia");
		s.selectByVisibleText("Algeria");
	*
	*
	*/
	//	doSelectDropdownValueByIndex(Country, 12);
	//	doSelectDropdownValueByIndex(Industry, 4);
		
//		doSelectDropdownValueByValue(Country, "Australia");
//		doSelectDropdownValueByValue(Industry, "Aerospace");
		
		doSelectDropdownValueByVisibleText(Country, "India");
		doSelectDropdownValueByVisibleText(Industry, "Education");
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownValueByIndex(By locator,int i) {
		Select a= new Select(getElement(locator));
		a.selectByIndex(i);
	}
	
	public static void doSelectDropdownValueByValue(By locator,String value) {
		Select a= new Select(getElement(locator));
		a.selectByValue(value);
	}
	
	public static void doSelectDropdownValueByVisibleText(By locator,String text) {
		Select a= new Select(getElement(locator));
		a.selectByVisibleText(text);
	}
}

