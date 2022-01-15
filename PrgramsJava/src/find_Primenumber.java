import java.util.Scanner;

public class find_Primenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int m=23;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int m= sc.nextInt();
	
	int count=0;
	
if (m==0||m==1) {
	System.out.println("number is not prime: "+m);
}	
else {
	for (int i = 1; i <=m ; i++) {
		if (m%i==0) {
			count++;
		}
			
		}
	
	if (count==2) {
		System.out.println("number is prime: "+m);
	}
	else {
		System.out.println("number is not prime: "+m);
		}
	}
	}
	
	
	
	
	
	
	
/*
	
		
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter an int value : ");
			int input = scan.nextInt();
			if (checkPrime(input)) {
				System.out.println("Input value " + input + " is a prime number.");
			} else {
				System.out.println("Input value " + input
						+ " is not a prime number.");
			}
		}

		public static boolean checkPrime(int n) {
			if (n <= 1) {
				return false;
			}
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			
			return true;
			
		}*/
	
	
	
	
	}