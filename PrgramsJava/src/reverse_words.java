import java.util.Scanner;

public class reverse_words {

	public static void main(String[] args) {
		
		
		String arr[]="My name is rupesh".split(" ");
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the srting");
		String s=sc.nextLine();
		
		String arr[]=s.split(" ");
		
		//System.out.println(arr);
		 * 
		 */
		
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev+=arr[i]+" ";
	}
System.out.println(rev);
	}

}
