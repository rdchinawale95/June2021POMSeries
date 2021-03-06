package com.qa.democart.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductInfoTest extends BaseTest {

	@BeforeTest
	public void productInfoSetup() {
		accPage=loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void productImagesTest() {
		resultsPage = accPage.doSearch("iMac");
		productInfoPage = resultsPage.selectProduct("iMac");
		Assert.assertEquals(productInfoPage.getProductImagesCount(), 3);
	}
	
	@Test
	public void productInfotest() {
		resultsPage=accPage.doSearch("Macbook");
		productInfoPage=resultsPage.selectProduct("MacBook Pro");
		Map<String, String> actProductInfoMap=productInfoPage.productData();
		
		Assert.assertEquals(actProductInfoMap.get("name"), "MacBook Pro");
		Assert.assertEquals(actProductInfoMap.get("Brand"), "Apple");
		Assert.assertEquals(actProductInfoMap.get("Product Code"), "Product 18");
		Assert.assertEquals(actProductInfoMap.get("price"), "$2,000.00");
		
		/*
		resultsPage = accPage.doSearch("Macbook");
		productInfoPage = resultsPage.selectProduct("MacBook Pro");
		Map<String, String> actProductInfoMap = productInfoPage.productData();
		
		Assert.assertEquals(actProductInfoMap.get("name"), "MacBook Pro");
		Assert.assertEquals(actProductInfoMap.get("Brand"), "Apple");
		Assert.assertEquals(actProductInfoMap.get("Product Code"), "Product 18");
		Assert.assertEquals(actProductInfoMap.get("price"), "$2,000.00");
*/
	}
	
}
