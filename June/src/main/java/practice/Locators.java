package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	private WebDriver driver;

	public Locators(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetAttribut(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean isElementEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public List<String> getTotalLinks(By locator) {
		List<String> eleTextList = new ArrayList<String>();

		List<WebElement> eleList = getElements(locator);
		System.out.println("element count: " + eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	public void clickLanguage(By locator, String value) {
		List<WebElement> lngList = getElements(locator);
		lngList.size();

		for (WebElement l : lngList) {
			String s = l.getText();
			System.out.println(s);

			if (s.contains(value)) {
				l.click();
				break;
			}

		}

	}

	public List<String> getLinksTestString(By locator) {
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
	
	public void doSelectDropdownValueByIndex(By locator,int i) {
		Select a= new Select(getElement(locator));
		a.selectByIndex(i);
	}
	
	public void doSelectDropdownValueByValue(By locator,String value) {
		Select a= new Select(getElement(locator));
		a.selectByValue(value);
	}
	
	public void doSelectDropdownValueByVisibleText(By locator,String text) {
		Select a= new Select(getElement(locator));
		a.selectByVisibleText(text);
	}
	
	public String waitForTitleContains(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleContains(titleValue))) {
			return driver.getTitle();
		}
		return null;
	}
	
	public  String waitForTitleIs(String fullTitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleIs(fullTitle))) {
			return driver.getTitle();
		}
		return null;
	}

	public  Alert waitForalert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public  String getAlertText(int timeout) {

		String text = waitForalert(timeout).getText();
		acceptAlert(5);
		return text;
	}

	public  void acceptAlert(int timeout) {
		waitForalert(timeout).accept();
	}

	public  void dismissAlert(int timeout) {
		waitForalert(timeout).dismiss();
	}

	public  void sendKeysAlert(int timeout, String value) {
		waitForalert(timeout).sendKeys(value);
	}
}



