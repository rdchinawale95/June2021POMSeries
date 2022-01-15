package practice;

import org.openqa.selenium.By;

public class LocatorList {

	By firstname= By.id("input-firstname");
	By lastname= By.id("input-lastname");
	By Continue= By.xpath("//input[@type='submit']");
	By email= By.id("input-email");
	By login= By.linkText("Login");
	By search= By.name("search");
	By searchButton= By.xpath("//*[@id=\"search\"]/span/button");
	By checkbox= By.xpath("//*[@id=\"description\"]");
	
}
