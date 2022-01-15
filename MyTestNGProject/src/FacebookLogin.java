import org.testng.annotations.Test;

public class FacebookLogin{

	@Test
	public void loginwithValidCrdentials() {
		System.out.println("Logged in with credentials");
		
	}
	@Test
	public void loginwithInvalidCrdentials() {
		System.out.println("Not able to Log in with credentials");
		
	}
}
