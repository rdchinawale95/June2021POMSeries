package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();

		By multiSelect = By.cssSelector(".comboTreeItemTitle");
		//DoSelectMultiple(multiSelect, "choice 1");
		//DoSelectMultiple(multiSelect, "choice 3", "choice 4", "choice 5");
		DoSelectMultiple(multiSelect, "all");
		//DoSelectMultiple(multiSelect, "all");		//for deselecting values in dropdown running method again
		System.out.println("************");

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void DoSelectMultiple(By locator, String... value) {

		List<WebElement> MultiSelect = getElements(locator);
		if (!value[0].equals("all")) {

			for (WebElement e : MultiSelect) {
				String s = e.getText();

				if (!s.isEmpty()) {
					System.out.println(s);
				}

				for (int i = 0; i < value.length; i++) {
					if (s.equals(value[i])) {
						e.click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement a : MultiSelect) {
					a.click();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}
}