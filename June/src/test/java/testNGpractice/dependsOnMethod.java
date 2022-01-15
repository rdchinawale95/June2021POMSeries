package testNGpractice;

import org.testng.annotations.Test;

public class dependsOnMethod {

	
	@Test
	public  void login() {
		System.out.println("login");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods = {"login","searchTest"},priority=2)
	public  void homePageTest() {
		System.out.println("homePageTest");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "login",priority=1)
	public  void searchTest() {
		System.out.println("searchTest");
	}
	
	//never use dependency for test methods
	//test methods should be independent
	//CRUD - POST, GET, Update, Delete
	//get user id = 124
	//create the user -- 125
	//get the same user -- 125
	//AAA rule
}
