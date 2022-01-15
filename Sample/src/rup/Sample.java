package rup;

import java.util.Iterator;
import java.util.Scanner;

public class Sample {
//	The Tribonacci Sequence:
//		0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136,
	public static void main(String[] args) {
		
		int n1=0;
		int n2=0;
		int n3=1;
		int sum=0;
		System.out.print(n1+" "+n2+" "+n3+" ");
		
		for (int i=1;i<=50;i++) {
			sum=n1+n2+n3;
			System.out.print(sum+" ");
			n1=n2;
			n2=n3;
			n3=sum;
		
		}
		
	/*	   Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number till u want Tribonacci series: ");
		        int n=sc.nextInt();

		        int a = 0,b = 0,c = 1;
		        int d = a+b+c;

		        System.out.println("\nTribonacci Series: ");
		        System.out.print(a+"\t"+b+"\t"+c);

		        for(int i=4;i<=n;i++)
		        {
		            System.out.print("\t"+d);
		            a=b;
		            b=c;
		            c=d;
		            d=a+b+c;
		        }

		        System.out.println();

		*/

	}

}
