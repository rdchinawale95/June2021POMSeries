package Oops;


//Abstraction
//Abstract class
abstract public class Shape {
	
	//Abstract method
	
	//you cannot create any object for abstract class as it does not have any body
	abstract public void displayShape();
	
	public void displayname() {   //non abstract method
		System.out.println("from shape class");
	}
	

}
