package Overriding;

public class Car extends Vehicle {

	public Car() {
		System.out.println("Constructor Car");
	}

	public Car(int a) {
		System.out.println("Constructor Car with integrr" + a);
	}

	public void one() {
		System.out.println("I am in Car-one");
	}

	public void two() {
		System.out.println("I am in Car-two");
	}

	public void three() {
		System.out.println("I am in Car-three");
	}

	public final void US4() {
		System.out.println("something");
	}
}
