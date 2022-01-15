package Oops;
//Abstraction- Abstract means incomplete
public class Cirlce extends Shape{

	
	
	public void displayShape() {
		System.out.println("shape is cirlce");
		
	}
	
	public static void main(String[] args) {
		Shape s= new Cirlce();  //tried using circle instaed of shape still runs
	Shape s1 = new triangle();  //tried using circle instaed of shape still runs
	s.displayShape();
	s1.displayShape();
	
	//Shape s2= new Shape();   //"Cannot instantiate the type Shape" error message
	
	//as Shape is abstract class its object cannot be made
			
			
		}
	}
/*
 * output
shape is cirlce
shape is triangle
*/


