package com.qa.democart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.democart.utils.Constants;
import com.qa.democart.utils.Errors;

public class LoginPageTest extends BaseTest {

	@Test(priority=1)
	public void loginPageTitletest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("lp title is: " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE, Errors.TITLE_ERROR_MESSAGE);
	}

	@Test(priority=2)
	public void loginPageHeaderTest(){
		String header = loginPage.getPageHeaderText();
		System.out.println("Header is: "+header);
		Assert.assertEquals(header, Constants.lOGIN_PAGE_HEADER, Errors.HEADER_ERROR_MESSAGE);
	}
	
	@Test(priority=3)
	public void forgotPwdLink() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
	
	@Test(priority=4)
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
}
