package com.testng.listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampleTestClass {
	

	@Test
	public void test1() {
		System.out.println("test 1");
		
	}
	@Test(dataProvider = "dataprovider")
	public void test2(String s) {
		System.out.println("test getdata method, input= " + s);
		
	}
	

	@DataProvider
	public Object[] dataprovider() {
		return new Object[] {"A", "B"};
		
	}
	@Test
	public void three() {
		Assert.assertEquals(5, 7);
	}

	@Test
	public void test4() {
		System.out.println("test 4");
		throw new SkipException(null);
		
	}
}
