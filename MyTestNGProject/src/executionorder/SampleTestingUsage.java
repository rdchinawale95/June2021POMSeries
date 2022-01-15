package executionorder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTestingUsage {
	@BeforeTest
	public void Beforetest() {
		System.out.println("Beforetest");
		
	}
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Beforesuite");
		
	}
	
}
