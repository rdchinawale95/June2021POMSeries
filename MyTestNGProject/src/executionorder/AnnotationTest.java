package executionorder;

import org.testng.annotations.*;

public class AnnotationTest {
	@Test
	public void first() {
		System.out.println("first");
		
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
		
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeCLass");
		
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
		
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Aftrtest");
		
	}
	
	
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Beforetest");
		
	}
	
	
	
	
	
	
	
}
