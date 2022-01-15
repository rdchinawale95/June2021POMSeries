package com.project.playzerpot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	static WebDriver driver;

	public static void logoutFromAccount() {
		driver.get("https://qcweb.playerzpot.com/menu");

		By logout = By.xpath("(//div[@class='more_page_icon'])[17]");
		doClick(logout);
		By logoutButton=By.xpath("(//div[@class='vertically-center'])[2]");
		doClick(logoutButton);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
