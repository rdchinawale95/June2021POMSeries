package com.testng.testparameter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testparameterexample {
	
	@Test(dataProvider = "DoubleSet")
	public void testaddition(int actual, int expected) {
		int actualValue= actual+ 20;
		Assert.assertEquals(actualValue, expected);
		
	}
	@DataProvider
	public Object[][] getdata() {
		return new Object[][] {
			{100,120},
			{200,220},
			{300,320},
			{400,420},
			{500,520},
		};
	}
		
		@DataProvider(name= "DoubleSet")
		public Object[][] getdataSet2() {
			return new Object[][] {
				{10,30},
				{20,40},
			};
	}	

}
