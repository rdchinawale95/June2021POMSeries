package overriding_and_inheritance;

public class BMW extends Car{
	
	
	int price = 500;
	
	//Method Overriding: when we have method in parent class as well as in child class
	//with the same name 
	//and same number of parameters
	//and same return type
	//Run Time/Dynamic Polymorphism
	
	//static method can not be overriden
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void stop() {
		System.out.println("BMW -- stop");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
	//Method Hiding
	public static void testing() {
		System.out.println("BMW -- testing");
	}
	
	@Override
	public void airBags() {
		System.out.println("BMW -- airBags");
	}
	
	private void fuel() {
		System.out.println("Car -- fuel");
	}
	

}
