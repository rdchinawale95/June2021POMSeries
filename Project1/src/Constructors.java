
public class Constructors {
	//constructor declaration. constructor is similar to method
	//default constructor
	
	public Constructors() {   
	
		System.out.println("i am inside constructor");
		
		System.out.println("i am second method");
	}
	
	
	//parameterised constructor
	int roll;
	String name;
	
	public Constructors(int a, String b) {
		
		roll = a;
		name = b;
		}
	
	// contructor overloading-we have two constr with same names but one is parametrised and other is not
	
	//Constructor overriding can be done
	public void display() {
		System.out.println("roll no is"+roll+ "and Name is"+name);
	}
	
	public static void main(String[] args) {
		 //when object is created for class the default constructor is called even though we have not called it in main
		//it is called as default constructor
		Constructors std = new Constructors(); 
		
		Constructors std1 = new Constructors(1, "james");
		Constructors std2= new Constructors(10, "thames");
		
	std1.display();
	std2.display();
	}

}
