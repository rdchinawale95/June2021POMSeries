package ExceptionHandling;

public class Multicatch {

	public static void main(String[] args) {
		try {
			int value = 100;
			int result = value/0;
			
			String text= null;
			int length = text.length();
		}catch (ArithmeticException e) {    //the exception sequence should be specific to general means arithmetic first and exception after
			System.out.println("declared specific exception");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Generate catch block");
			e.printStackTrace();
		}

	}}
