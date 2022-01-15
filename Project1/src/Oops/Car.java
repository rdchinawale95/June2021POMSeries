package Oops;
//inheritance
public class Car {
	
	String name= "Car Segment";

	
	
	Car(){
		System.out.println("creating constructor of car class");
	}
	
	public final void setWheels() {
	System.out.println("only 4 wheels are allowed");	
		
	}
	
	public void run() {
		System.out.println("Car is running");
	}
	
	/*public Car (int a) {
		System.out.println("rupesh"+a);    //chandan doubt
}*/
}