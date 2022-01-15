package com.qa.democart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.democart.utils.ElementUtil;


public class AccountsPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	private By accSections = By.cssSelector("div#content h2");
	private By header = By.cssSelector("div#logo h1 a");
	private By logoutLink = By.linkText("Logout");
	private By searchField = By.name("search");
	private By searchButton = By.cssSelector("div#search button");
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		elementUtil=new ElementUtil(driver);
	}
	
	public String verifyHeader() {
		return elementUtil.doGetText(header);
	}
	
	public List<String> accountsections() {
		List<String> a= new ArrayList<String>();
		List<WebElement> list=elementUtil.getElements(accSections);
		for (WebElement e : list) {
			String r=e.getText();
			a.add(r);
		
		}
		return 	a;
	}
	
	public ResultsPage doSearch(String productName) {
		System.out.println("searching the product: " + productName);
		elementUtil.doSendKeys(searchField, productName);
		elementUtil.doClick(searchButton);
		return new ResultsPage(driver);
	}
	
}
