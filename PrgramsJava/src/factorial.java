import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther number:");
		int num=sc.nextInt();
		int fact=1;
		
		for (int i = num; i>=1; i--) {
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	}

}
