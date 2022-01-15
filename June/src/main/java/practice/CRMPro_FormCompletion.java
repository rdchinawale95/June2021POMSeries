package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMPro_FormCompletion {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("New Contact")).click();

		driver.findElement(By.name("title")).click();
		// driver.findElement(By.xpath( "//option[@value='Dr.']"));
		List<WebElement> li = driver.findElements(By.xpath("//select[@name='title']/option"));

		for (WebElement e : li) {
			String s = e.getText();
			if (s.equals("Dr.")) {
				e.click();

			}
		}
		driver.findElement(By.id("first_name")).sendKeys("naveen");
		driver.findElement(By.id("surname")).sendKeys("Khunteta");

		By suffix = By.name("suffix");
		driver.findElement(suffix).click();
		Thread.sleep(2000);
		By suffixDD = By.xpath("//select[@name='suffix']/option");
		DDSelect(suffixDD, "IV");
		driver.findElement(By.id("image_file")).sendKeys("D:\\Selenium JAVA notes\\public private protected.png");

		By nickName = By.name("nickname");
		By Company = By.name("client_lookup");
		By Positon = By.id("company_position");
		By Department = By.id("department");
		By supervisor = By.name("contact_lookup_sup");
		By assistant = By.name("contact_lookup_ass");
		By referredBy = By.name("contact_lookup_ref");
		By category = By.name("category");
		By categoryDD = By.xpath("//select[@name='category']/option");
		By status = By.name("status");
		By statusDD = By.xpath("//select[@name='status']/option");
		By phone = By.id("phone");
		By mobile = By.id("mobile");
		By homePhone = By.id("home_phone");
		By fax = By.id("fax");
		By email = By.id("email");
		By email_alt = By.id("email_alt");
		By messengerID = By.id("im_id");
		By messNet = By.name("im_netowrk");
		By DDmessNet = By.xpath("//select[@name='im_netowrk']/option");
		By skype_id = By.id("skype_id");
		By source = By.name("source");
		By DDsource = By.xpath("//select[@name='source']/option");
		By identifier = By.name("identifier");

		doSendKeys(nickName, "Test");
		doSendKeys(Company, "Cognizant");
		doSendKeys(Positon, "Programmer Analyst");
		doSendKeys(Department, "QA");
		doSendKeys(supervisor, "Raj Kumar");
		doSendKeys(assistant, "Raj ram");
		doSendKeys(referredBy, "Raj ram");
		clickElement(category);
		DDSelect(categoryDD, "Lead");
		clickElement(status);
		DDSelect(statusDD, "Active");
		doSendKeys(phone, "0257635241");
		doSendKeys(mobile, "9876543210");
		doSendKeys(homePhone, "4574571234");
		doSendKeys(fax, "523698");
		doSendKeys(email, "test34@gmail.com");
		doSendKeys(email_alt, "NA");
		doSendKeys(messengerID, "708305");
		clickElement(messNet);
		DDSelect(DDmessNet, "Google Talk");
		doSendKeys(skype_id, "wertyu");
		clickElement(source);
		DDSelect(DDsource, "Customer");
		doSendKeys(identifier, "asdfg");

		System.out.println("**********");

	}

	public static void DDSelect(By locator, String value) {
		List<WebElement> li = getElements(locator);

		for (WebElement e : li) {
			String s = e.getText();
			if (s.equals(value)) {
				e.click();

			}
		}
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void clickElement(By locator) {
		driver.findElement(locator).click();
	}

	public static void doSendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
}