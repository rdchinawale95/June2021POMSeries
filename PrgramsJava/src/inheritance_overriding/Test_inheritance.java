package inheritance_overriding;

import Overriding.Car;

public class Test_inheritance {

	public static void main(String[] args) {

		IIT_Mumbai im= new IIT_Mumbai();
		im.grantedUniversities();
		im.overrided_method();
		im.finalColleges();
		im.grantedColleges();
		im.appliedUniversities();
		im.appliedColleges();
		im.grantedScience();
		im.IIT_Accreditions();
		im.IIT_Canteen();
		im.IIT_Hostel();
		
		
		System.out.println("--------------------");
		
		College co=new IIT_Mumbai();
		co.grantedColleges();
		co.grantedScience();
		
		System.out.println("--------------------");

		University_PHD up= new IIT_Mumbai();
		up.finalColleges();
		up.finalUniversities();
		up.grantedColleges();
		up.grantedUniversities();
		up.overrided_method();
		up.appliedColleges();
		up.appliedUniversities();
		//downcasting
		//IIT_Mumbai  ii= new Car();
	}

}
