package com.testng.training;

import static org.testng.Assert.assertFalse;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SOftAssertionexample {
	
	@Test
	public void Test1() {
		System.out.println("Test 1");
		
	}
	
	@Test(enabled = false)
	public void Test2() {
		System.out.println("Test 2");
		
	}
	
	@Test
	public void Test3() {
		System.out.println("Test 3");
		
	throw new SkipException("SKIPPING THE TEST DELIBERATELY");
	}
	
	@Test
	public void Test4() {
		System.out.println("Test 4");
		
	}
	
	
}
