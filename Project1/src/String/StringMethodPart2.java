package String;

public class StringMethodPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1= "TechTraining";
		
		String text2= "TechTraining";
		
		String text3= "techtraining";
		
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text1.equalsIgnoreCase(text3));
		
		System.out.println(text1.indexOf("h"));
		
		System.out.println(text1.lastIndexOf("i"));
		System.out.println(text1.length());
		
		
		
		

	}

}
/*

true
false
true
3
9
12

*/