package Oops;

public class CalculateInterest {
//Method over-riding  run time polymorphism or dynamic polymorphism
//java decides in runtime which method to run on the basis of object
	public static void main(String[] args) {
		American_express am = new American_express();
		BankofAmerica ba= new BankofAmerica();
		ICICI ic = new ICICI();

		
		System.out.println(am.getInterest());
		System.out.println(ba.getInterest());
		System.out.println(ic.getInterest());
	}

}
