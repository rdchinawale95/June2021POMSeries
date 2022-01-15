package String;

public class StringMethodPart4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "United States";
		
		System.out.println(text.substring(5));
		System.out.println(text.substring(5, 9));
		// 	System.out.println(text.substring(5, 20));//gives error
		
		char[] charArray= text.toCharArray();
		
		System.out.println("Main String is : "+text);
		
		System.out.println(charArray);
		  
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
			
		}
		
		/*output
		d States
		d St
		Main String is : United States
		United States
		U
		n
		i
		t
		e
		d
		 
		S
		t
		a
		t
		e
		s
	*/
		
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		
		String text1= "My name is        ";
		String text2= "   Anshul";
		
		System.out.println(text1+text2);
		System.out.println(text1.trim()+text2);
		System.out.println(text1.trim()+text2.trim());
		
}

}
/*
Main String is : United States
U
n
i
t
e
d
 
S
t
a
t
e
s
*/
