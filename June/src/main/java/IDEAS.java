import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDEAS {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://wanikirtesh.github.io/");

		By dropdown = By.cssSelector("select.form-control option");
		clickDropDownValue(dropdown, "Department");
		clickDropDownValue(dropdown, "Region");

		By marketing = By.xpath("//option[text()='Marketing']");
		By generate = By.id("btnGen");
		doActionsClick(marketing);
		By region = By.xpath("//option[text()='UAE']");
		doActionsClick(region);
		doClick(generate);

		driver.navigate().to(
				"https://wanikirtesh.github.io/report.html?fltlist=department,region,&department=Marketing&region=UAE&");

		Thread.sleep(3000);
		By records = By.xpath("//td[@class='sorting_1']");
		int rowCount = driver.findElements(records).size();
		System.out.println(rowCount);

		Assert.assertEquals(rowCount, 9);
		int count = 0;
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement e : checkbox) {
			if (e.isSelected()) {
				count++;
			}

		}
		System.out.println(count);

		By fourthrow = By.xpath("(//tr[@role='row'])[5]/td");
		List<WebElement> det = getElements(fourthrow);
		List<String> arr = new ArrayList<String>();
		String f = "";
		for (WebElement a : det) {
			f = a.getText();
			arr.add(f);
		}
		By fourthSel = By.xpath("(//input[@type='checkbox'])[4]");
		if (driver.findElement(fourthSel).isSelected()) {
			arr.add(6, "checked");
		}
		System.out.println(arr);

	}

	public static void clickDropDownValue(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		System.out.println(optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	
	}

	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
