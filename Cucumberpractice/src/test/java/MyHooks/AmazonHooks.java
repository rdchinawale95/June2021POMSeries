package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {

	@Before(order=1)
	public void setupapp() {
		System.out.println("launch amazon application");
	}
	
	@Before(order=2)
	public void setupurl() {
		System.out.println("launch amazon url");
	}
	
	@After(order=1)
	public void teardown() {
		System.out.println("close amazon application");
	}
	
	@After(order=2)
	public void teardownurl() {
		System.out.println("close amazon url");
	}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("launch amazon beforestep");
	}
	
	
	@AfterStep
	public void afterstep() {
		System.out.println("launch amazon beforestep");
	}
}
