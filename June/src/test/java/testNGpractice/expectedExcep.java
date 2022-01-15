package testNGpractice;

import org.testng.annotations.Test;

import testngsessions.ExpectedExceptionConcept;

public class expectedExcep {

	String name = "testng";

	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	public void homePageTest() {

		System.out.println("homePageTest");
		// int i = 9/0;
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);
	}
}
