package overloading_Static;

public class Overloading_1 {

	public static void payment(char g) {
		System.out.println("static method 1");
	}
	
	public static void payment(String ok,String lk,String pl) {
		System.out.println("static method 2");
	}
	
	public void payment(long debit) {
		System.out.println("payment through Debit");
	}
	
	public void payment(int account) {
		System.out.println("payment through bank account");
	}
	
	public void payment(String UPI) {
		System.out.println("payment through UPI");
	}
	
	public void payment() {
		System.out.println("free");
	}
	
	public void payment(int a,int b,int c) {
		System.out.println("threee types of data");
	}
	
	public void payment(int a,int b) {
		System.out.println("two types of data");
	}
	
	public void payment(String a,String b) {
		System.out.println("two types of data");
	}
	
	
	
//	public static void main(String[] args) {
//		
//		
//		
//		
//	}

}
