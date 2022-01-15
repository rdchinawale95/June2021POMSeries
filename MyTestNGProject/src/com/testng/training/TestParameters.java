package com.testng.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TestParameters {
	@Test
	@Parameters("browser")
	public void tc1(String browser) {
		System.out.println("browser passed as :" + browser);
		
	}
	@Test
	@Parameters({"username", "password"})
	public void Sampleclass1Meth2(String username, String password) {
		System.out.println("Parameter for user name passed as passed as :" +username);
		System.out.println("Parameter for password passed as passed as :" +password);
		}

}
