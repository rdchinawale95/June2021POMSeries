
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	int a=12345;
	int rev=0;
	
	while (a!=0) {
		
		rev=rev*10+a%10;		//0+5 1234  50+4 123 540+3
		a=a/10;
		
	}
	*/
	//System.out.println(rev);
		
	//}

	
	
	String str= "This is beautiful world" ;
	
	int len= str.length();
	String rev="";
	
		for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	
	
	rev=rev.replaceAll(" ", "");
	System.out.println(rev);
	
	}

}
