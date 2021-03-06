package code;

public class Employee {
	//Object Concept
	
	
	// class vars: global vars
	String name; //null
	int age; //0
	String dob; //null
	char gender; // 
	double salary; //0.0
	

	public static void main(String[] args) {

		// String name; //local var
		
		Employee e1 = new Employee();
		
		e1.name = "Tom";
		e1.age = 25;
		e1.dob = "01-01-1990";
		e1.gender = 'm';
		e1.salary = 12.33;
		
		System.out.println(e1.name + " " + e1.age) ;
		
		Employee e2 = new Employee();
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		Employee e3 = new Employee();
		e3.name = "Nancy";
		e3.age = 40;
		
		System.out.println(e3.name + " " + e3.age + " " + e3.dob + " " + e3.gender + " " + e3.salary);

		//System.out.println(new Employee().name = "Dev");		//tried printing it
		new Employee().name = "Dev";
		new Employee().age = 25;   //object without reference name can be created
		new Employee().dob = "01-01-1990";

		System.gc();//for garbage  collector , but no gurantee that it will delete the object without reference
	
		
		//my code practice	
		Employee rupesh= new Employee();
		rupesh.name="Rupesh Chinawale";
		rupesh.age=26;
		rupesh.dob="20feb1995";
		rupesh.gender='M';
		rupesh.salary=32547;
		
		System.out.println(rupesh.name+" "+rupesh.age+" "+rupesh.dob+" "+rupesh.gender+" "+rupesh.salary);
		
	}

}
