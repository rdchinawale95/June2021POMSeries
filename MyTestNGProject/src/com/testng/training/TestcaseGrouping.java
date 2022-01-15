package com.testng.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcaseGrouping {
	
	
	@Test(groups = "Regression")
	public void Test1() {
		System.out.println("Test 1");
		
	}
	
	@Test(groups = "Regression")
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups= "Smoke Test")
	public void Test3() {
		System.out.println("Test 3");
		
	}
	
	@Test(groups= {"Regression", "Sanity"})
	public void Test4() {
		System.out.println("Test 4");
			}
	
}
