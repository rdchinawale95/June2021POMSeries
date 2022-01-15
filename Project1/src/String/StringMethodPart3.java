package String;

public class StringMethodPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text= "Hello";
		String sample= "His name is john and he is a good man";
		
		String text1= text.replace("e", "a");
		String sample2= sample.replace("is", "was");
		
		System.out.println(text1);
		System.out.println(sample2);
		
		String[] sampletest = sample.split("is");
		
		System.out.println(sample);
		//System.out.println(sampletest);
		
		for (int i=0; i<sampletest.length; i++){
			
		System.out.println(sampletest[i]);
	}
		
	System.out.println(sample.startsWith("name"));
	
	}
}
/*
 * Hallo
Hwas name was john and he was a good man
His name is john and he is a good man
H
 name 
 john and he 
 a good man
false

*/

