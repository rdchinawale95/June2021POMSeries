package Oops;
//inheritance
public class BMW extends Car{
	

	 //when the object is created of child class the constructor of parent class is automatically called
	 BMW(){
		 super();
		 System.out.println("callig constructor of BMW");
	 }
	 
	/* public  void setWheels() {     //final method use from Car
			System.out.println("only 4 wheels are allowed");	
				
			}*/
	 static String name = "BMW";  //for car object 
	 //String name = "BMW"; 
	 
/*	 public void getName() {
		  System.out.println(name);
		  System.out.println(super.name);  //name in car method i.e parent class
	 }*/
	 
	 public void run() {
		 System.out.println("BMW is running");
		 super.run();  //method in parent class
	 }
	public static void main(String[] agrs) {

	/*BMW bmw = new BMW();
	bmw.run();        */      //to run method in parent class using super
		
	/*BMW bmw1 = new BMW();
	bmw1.getName();   */      //to run variable in parent class using super
		
		
		Car car = new Car();	
		 //commented to write super keyword program  ,use static to name for running
	System.out.print(name);
	car.run();
	
	}
	
	}


//Output-
/*
 * creating constructor of car class
callig constructor of BMW
BMW is running
Car is running
 * 
 */

/*
 * creating constructor of car class
callig constructor of BMW
BMW
Car Segment
*/

/*creating constructor of car class
BMWCar is running*/
 