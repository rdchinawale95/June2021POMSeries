package com.datadriven.framework.test.LoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.datadriven.framework.base.BaseUI;
import com.datadriven.framework.utils.ExtentReportManager;

import net.bytebuddy.asm.Advice.Enter;

public class loginTest extends BaseUI{

	
	@Test
	public void testone() {
		
		
		logger = report.createTest("Login to Rediff mail");
		
		logger.log(Status.INFO, "Initializing");
		invokeBrowser("Chrome");
		logger.log(Status.INFO, "opening website");
		openURL("websiteURL");
		logger.log(Status.INFO, "sign in");
		elementClick("SigninBtn_Xpath");
		logger.log(Status.INFO, "entering email and pwd");
		enterText("usernameTextbox_Id","anshulc55");
		enterText("passwordTextbox_CSS","PasswordText");
		logger.log(Status.FAIL, "executed fail");
		
		takeScreenShotOnFailure();
		
		quitbrowser();

	}
	
	@AfterTest
	public void endReport() {
		report.flush();
	}
@Test(dependsOnMethods = "testone")
	public void testtwo(){
	logger = report.createTest("Login to Rediff mail");
	
	logger.log(Status.INFO, "Initializing");
	invokeBrowser("Chrome");
	logger.log(Status.INFO, "opening website");
	openURL("websiteURL");
	logger.log(Status.INFO, "sign in");
	elementClick("SigninBtn_Xpath");
	logger.log(Status.INFO, "entering email and pwd");
	enterText("usernameTextbox_Id","anshulc55");
	enterText("passwordTextbox_CSS","PasswordText");
	logger.log(Status.FAIL, "executed fail");
	
	takeScreenShotOnFailure();
	
	quitbrowser();
	}


	/*@Test(dependsOnMethods = "testtwo")
	public void testthree() {

		invokeBrowser("IE");
		
		openURL("websiteURL");
		elementClick("SigninBtn_xpath");
		enterText("userNamexpath","anshulc55");
		quitbrowser();
	}*/

}
