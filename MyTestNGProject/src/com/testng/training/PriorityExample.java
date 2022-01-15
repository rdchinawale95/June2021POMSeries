package com.testng.training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityExample {

	@Test			//this will execute first as it has zeero priority
	public void Test1() {
		System.out.println("Test 1");
		
	}
	
	@Test(priority = 1)
	public void Test2() {
		System.out.println("Test 2");
		
	}
	
	@Test(priority = 3)
	public void Test3() {
		System.out.println("Test 3");
		
	}
	
	@Test(priority = 2)
	public void Test4() {
		System.out.println("Test 4");
		
	}
	
	
	
}
