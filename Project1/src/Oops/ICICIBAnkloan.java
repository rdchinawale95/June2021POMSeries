package Oops;

public class ICICIBAnkloan {
//encapsulation
	public static void main(String[] args) {
		Bank_loan loan = new Bank_loan();
		
		loan.setage(20);
		loan.setName("MIchael john");
		loan.setamount(1000000);
		
		System.out.println("age is:"+loan.getage());

		System.out.println("name is:"+loan.getname());

		System.out.println("amount is:"+loan.getamount());
	}

}
