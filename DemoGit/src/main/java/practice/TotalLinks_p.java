package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks_p {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");

//		By totalLinks= By.tagName("a");
//		
//		//System.out.println(driver.findElements(totalLinks));
//	
//		List<WebElement> list= driver.findElements(totalLinks);
//		System.out.println(list.size());
//		
//		for (int i=0;i<list.size();i++) {
//			String s =list.get(i).getText();
//			
//			if (!s.isEmpty()) {
//				System.out.println(i+":= "+ s);
//			}
//		}

		List<WebElement> footer = driver.findElements(By.xpath("/html/body/footer/div/div"));

		for (int i = 0; i < footer.size(); i++) {

			String f = footer.get(i).getText();
			System.out.println(f);
			boolean b = f.contains("Contact Us");
			System.out.println(b);
		}

	}

}
