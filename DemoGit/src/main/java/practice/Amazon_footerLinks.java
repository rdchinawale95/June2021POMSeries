package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_footerLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtilpractice b = new BrowserUtilpractice();
		driver = b.Browserlaunch("chrome");

		b.launchURL("https://www.amazon.in/");

		By footer = By.xpath("//div[@class=\"navFooterVerticalColumn navAccessibility\"]//a");

		Locators l = new Locators(driver);
//		List<WebElement>  e=l.getElements(footer);
//		System.out.println(e.size());
//		
//		for (WebElement a : e) {
//			System.out.println(a.getText());
//		}
//		l.clickLanguage(footer, "Careers");
//	
		List<String> footerLinks = getLinksTestString(footer);

		if (footerLinks.size() == 22) {
			System.out.println("footer out is correct");
		}

		if (footerLinks.contains("Careers")) {
			System.out.println("List contains 'Careers'");
		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getLinksTestString(By locator) {
		List<String> eTextList = new ArrayList<String>();

		List<WebElement> elist = getElements(locator);
		System.out.println("Element count:" + elist.size());

		for (WebElement w : elist) {
			String s = w.getText();
			if (!s.isEmpty()) {
				eTextList.add(s);
			}
		}
		return eTextList;
	}

}
