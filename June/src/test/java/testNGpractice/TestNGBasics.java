package testNGpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
Before Suirte
Before Test
Before classs

Before method
atest
AM -- logout

Before method
btest
AM -- logout

Before method
ctest
AM -- logout

AC -- close browser
AT -- delete user

PASSED: atest
PASSED: btest
PASSED: ctest

*/

public class TestNGBasics {

	
	@BeforeSuite
	public void methodbeforesuite() {
		System.out.println("Before Suirte");
	}
	
	@BeforeTest
	public void methodbeforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void methodbeforeclass() {
		System.out.println("Before classs");
	}
	
	@BeforeMethod
	public void methodbeforemethod() {
		System.out.println("Before method");
	}
	
	@Test
	public void btest() {
		System.out.println("btest");
	}
	
	@Test
	public void ctest() {
		System.out.println("ctest");
	}
	
	@Test
	public void atest() {
		System.out.println("atest");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("AC -- close browser");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("AT -- delete user");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("AS -- disconnectDB");
	}
	
}
