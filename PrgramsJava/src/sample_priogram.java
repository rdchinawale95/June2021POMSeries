import java.util.Scanner;

public class sample_priogram {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		
		if (a%3==0) {
			System.out.println("Hello");
		}
		else if (a%5==0) {
			System.out.println("world");
		}
		else if(a%15==0) {
			System.out.println("Hello world");
		}
	}

}
