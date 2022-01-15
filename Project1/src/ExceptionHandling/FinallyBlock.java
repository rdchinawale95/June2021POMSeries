package ExceptionHandling;
//Finally block will be executed mandatory whether exception is present or not
public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
			String text= "Rupesh";
			System.out.println(text);
			
			String text1= null;
			System.out.println(text1.length());
		} finally {
			System.out.println("I am in the finally block");
		}
	}

}
