package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// String Browser= "chrome";
		BrowserUtilpractice bu = new BrowserUtilpractice();

		WebDriver driver = bu.Browserlaunch("chrome");

		bu.launchURL("https://demo.opencart.com/index.php?route=account/register");

		Locators lc = new Locators(driver);

		LocatorList ll = new LocatorList();

		// input-email
		lc.doSendKeys(ll.firstname, "Rupesh");
		lc.doSendKeys(ll.lastname, "chinawale");
		lc.doSendKeys(ll.email, "rchinawale");
		lc.doClick(ll.Continue);

		String attribute = lc.doGetAttribut(ll.login, "href");

		// get attribute is for getting the value/text of attribute in DOM like
		// href,placeholder,etc
		if (lc.doGetAttribut(ll.login, "href").contains("/login"))
			;
		{
			System.out.println(attribute + "----attribute value is correct");
		}

		String searchAttr = lc.doGetAttribut(ll.search, "placeholder");
		System.out.println(searchAttr);

		lc.isElementDisplayed(ll.search);
		lc.doSendKeys(ll.search, "Macbook");
		lc.doClick(ll.searchButton);
		//check
		System.out.println(lc.isElementEnabled(ll.checkbox));
		
		Thread.sleep(3000);
		driver.close();

	}

}
