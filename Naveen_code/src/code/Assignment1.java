package code;


import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=1;
		while (i<=10) {
			if (!(i%7==0)) {
				System.out.println(i);
				
			} 
			i++;
		}
		
		System.out.println("**********************");
		
		
		System.out.println("Hello\nNaveen K");
		
		System.out.println("*********");
		byte b3 = 065; 

		System.out.println(b3);
		
		
		System.out.println("------------------");
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int s= sc.nextInt();
		
		if (s>0) {
			System.out.println("Positive number");
		}else {
			System.out.println("Negative number");
		}
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1= sc1.nextInt();
		System.out.println("Enter number 2");
		int n2=sc1.nextInt();
		System.out.println("Enter number 3");
		int n3=sc1.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("Largest number is:"+n1);	
		}
		if (n2>n1 && n2>n3) {
			System.out.println("Largest number is:"+n2);
		}
		if (n3>n1 && n3>n2) {
			System.out.println("Largest number is:"+n3);
			
		}
		
		
		System.out.println("------");
		System.out.println(-5 + 8 * 6);//(55+9) % 9
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		*/
		
		for (int j = 10; j >0; j--) {
			System.out.println(j);
		}
		
		System.out.println("------");
		int r=10;
		while (r>0) {
			System.out.println(r);
			r--;
		}
		
		System.out.println("------");
		int t=10;
		do {
			System.out.println(t);
			t--;
		} while (t>0);
		
	}

}
