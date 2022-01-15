package Encapsulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Browser {

	private String name;
	private int age;
	private String city;
	
	
	public void launchBrowser() {
		System.out.println("Browser is launching");
		ramSpace();
		browsercompatibility();
		connectivity();
		System.out.println("Browser is launched");
	}
	
	private void ramSpace() {
		System.out.println("ramspace is enough");
	}
	
	private void browsercompatibility() {
		System.out.println("browserr is compatible");
	}
	
	private void connectivity() {
		System.out.println("browser id connected");
	}
}
