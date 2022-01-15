import java.util.Scanner;

public class try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("i love India");
		try {
			int div=12/0;
			System.out.println("Answer is infinity");
			
			try {
				System.out.println("second"+10/0);
			} catch (Exception e) {
			int	second=10/2;
			e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("Instead divide 10 by 2: "+(10/2));
			e.printStackTrace();
		}
		finally {
			System.out.println("Finaly is compulsory to execute");
		}

	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbr");
		
	int w=sc.nextInt();
		try {
			
			int a =w/0;
		} 	catch (Exception e) {
			System.out.println("E2 numbr");
			catch (NullPointerException e) {
			System.out.println("E1 numbr");
		}
		 
		 catch (ArithmeticException e) {
				System.out.println("E3 numbr");
		}
		
		
		//if exception is written first then it handles all types of exceptions
	
	}*/
		
	}

}
