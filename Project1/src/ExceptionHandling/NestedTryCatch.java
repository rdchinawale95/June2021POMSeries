package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println("First Try block");
			
			//String text= null;   //if you go on resolving the exceptions the next try will be executed
			String text= "Rupesh";
			System.out.println(text.length());
			
		try {
			System.out.println("Second try block");
			int value= 100/0;
			
			try {
				System.out.println("Third try block");
				int[] array = new int [3];
				array[5] = 100;
				
			} catch (Exception e) {
				System.out.println("end of Third try block");
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			System.out.println("end of second try block");
			e.printStackTrace();
		}
			
			
		} catch (Exception e) {
			System.out.println("end of first try block");
			e.printStackTrace();
		}
	}

}

/*First Try block
6
Second try block
end of second try block
java.lang.ArithmeticException: / by zero
	at ExceptionHandling.NestedTryCatch.main(NestedTryCatch.java:16)*/
