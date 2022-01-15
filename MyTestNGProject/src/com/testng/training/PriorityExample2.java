package com.testng.training;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityExample2 {

	@Test			//this will execute first as it has zero priority
	public void Test1() {
		System.out.println("Test 1");
		Assert.assertEquals("Facebook", "Facebook");
		
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(404, 200); //if this fails next steps will not execute
		System.out.println("Test 2");
		//Assert.assertEquals(404, 200);
	}
	
	@Test
	public void Test3() {
		System.out.println("Test 3");
		Assert.assertTrue(true);
	}
	
	@Test
	public void Test4() {
		System.out.println("Test 4");
		Assert.assertTrue(false, "Making test failure");
	}
	
	@Test
	public void Test5() {
		System.out.println("Test 5");
		
	}
	
	@Test
	public void Test6() {
		System.out.println("Test 6");
		
	}
	
	
	
}
