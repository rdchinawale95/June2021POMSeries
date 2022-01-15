import org.testng.annotations.*;


public class SampleTest{
	@Test
	@BeforeSuite
	public void beforeSuitMethod() {
		System.out.println("Executing before test suite");
	}
	 
	@Test
	@AfterSuite
	public void aftersuiteMethod() {
		System.out.println("Executing after test suite");

	}
	}

