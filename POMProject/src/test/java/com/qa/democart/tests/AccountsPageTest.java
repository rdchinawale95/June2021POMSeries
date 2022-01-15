package com.qa.democart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.democart.pages.ResultsPage;
import com.qa.democart.utils.Constants;

public class AccountsPageTest extends BaseTest{

	@BeforeClass
	public void accPageSetup() {
		accPage=loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
	
	
	@Test(priority=1)
	public void doverifyHeader() {
		String s=accPage.verifyHeader();
Assert.assertTrue(s.equals(Constants.lOGIN_PAGE_HEADER));
	}
	
	@Test(priority=2)
	public void doverifyaccountSec() {
		List<String> d=accPage.accountsections();
		Assert.assertEquals(d, Constants.EXPECTED_ACC_SEC_LIST);
	}
	
	@DataProvider
	public Object [][] getdata(){
		return new Object[][]{
			{"Macbook Air"},
			{"Macbook Pro"}, 
			{"Iphone"}
		};
	}
	
	@Test(priority=3,dataProvider = "getdata")
	public void doVerifysearch(String productName) {
		resultsPage = accPage.doSearch(productName);
		String resultHeader = resultsPage.getSearchPageHeader();
		System.out.println("result header is : " + resultHeader);
		Assert.assertTrue(resultHeader.contains(productName));
	}
	
	@DataProvider
	public Object[][] getProductSelectData(){
		return new Object[][] {
			{"Macbook", "MacBook Air"},
			{"Macbook", "MacBook Pro"},
			{"Apple", "Apple Cinema 30\""}
		};
	}
	
	@Test(priority=4, dataProvider="getProductSelectData")
	public void selectProduct(String productName,String mainProductName) {
		resultsPage=accPage.doSearch(productName);
		productInfoPage=resultsPage.selectProduct(mainProductName);
		String header=productInfoPage.getProductHeaderText();
		System.out.println("header");
		Assert.assertEquals(header, mainProductName);
	}
	/*
	@Test(priority = 1)
	public void accPageTitleTest() {
		String title = accPage.getAccountPageTitle();
		System.out.println("acc page title is: " + title);
		Assert.assertEquals(title, Constants.ACCOUNT_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void accPageHeaderTest() {
		String header = accPage.getAccPageHeader();
		System.out.println("acc page header is: " + header);
	//	Assert.assertEquals(header, Constants.PAGE_HEADER);
	}

	@Test(priority = 3)
	public void accSectionsListTest() {
		List<String> actAccSecList = accPage.getAccountSectionsList();
		System.out.println("actual sections: " + actAccSecList);
		//Assert.assertEquals(actAccSecList, Constants.EXPECTED_ACC_SEC_LIST);
	}
	
	@Test(priority = 4)
	public void logoutLinkExistTest() {
		Assert.assertTrue(accPage.isLogoutLinkExist());
	}
	
	/*
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] {
			{"Macbook Pro"}, 
			{"Macbook Air"}, 
			{"Apple"}
			};
	}
	
	@Test(priority = 5, dataProvider = "getSearchData")
	public void searchTest(String productName) {
		resultsPage = accPage.doSearch(productName);
		String resultHeader = resultsPage.getSearchPageHeader();
		System.out.println("result header is : " + resultHeader);
		Assert.assertTrue(resultHeader.contains(productName));
	}
	
	@DataProvider
	public Object[][] getProductSelectData(){
		return new Object[][] {
			{"Macbook", "MacBook Air"},
			{"Macbook", "MacBook Pro"},
			{"Apple", "Apple Cinema 30\""}
		};
	}
	
	@Test(priority = 6, dataProvider = "getProductSelectData")
	public void selectProductTest(String productName, String mainProductName) {
		resultsPage = accPage.doSearch(productName);
		productInfoPage = resultsPage.selectProduct(mainProductName);
		String header = productInfoPage.getProductHeaderText();
		System.out.println("product header : " + header);
		Assert.assertEquals(header, mainProductName);
	}
	*/
}
