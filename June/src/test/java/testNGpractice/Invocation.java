package testNGpractice;

import org.testng.annotations.Test;

public class Invocation {

	@Test(invocationCount = 10)
	public void homePageTest() {
		System.out.println("homePageTest");
	}

}
