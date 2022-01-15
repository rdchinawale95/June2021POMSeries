package com.testng.training;

import static org.testng.Assert.assertFalse;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SkippingExample {
	
	@Test
	public void Test1() {
		SoftAssert SoftAssert = new SoftAssert(); //this did not fail as asssert all was not used...softassertion is not capable without assert all to fail
		System.out.println("Test 1");
		SoftAssert.assertEquals(5, 5, "1st hard assert failed");
		System.out.println("hard assert success...");
		SoftAssert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
		System.out.println("*****test case one executed  successfully");
		SoftAssert.assertAll();
	}
	
	@Test
	public void Test2() {
		SoftAssert SoftAssert = new SoftAssert(); //though it is failing but will execute the whole tc i.e steps afetr the failed also
		System.out.println("Test 2");
		SoftAssert.assertEquals("Hello", "Hello", "1st hard assert failed");
		System.out.println("hard assert success...");
		SoftAssert.assertTrue(false, "Second hard assert failed");
		
		System.out.println("*****test case two executed  successfully");
		SoftAssert.assertAll();
	}
	
	@Test
	public void Test3() {
		SoftAssert SoftAssert = new SoftAssert();
		System.out.println("Test 3");
		SoftAssert.assertEquals(5, 5, "1st hard assert failed");
		System.out.println("hard assert success...");
		SoftAssert.assertTrue("Hello".equals("Hello"), "Second hard assert failed");
		System.out.println("*****test case three executed  successfully");
	}
	
	
	
}
