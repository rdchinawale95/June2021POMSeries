package String;

public class StringMethodPart1 {
//different type of string methods
	public static void main(String[] args) {
		String text = "Learning is the Key";
		String text3 = "Hi we are learning from easybix.com";
		
		char ch = text.charAt(12);
		
		System.out.println(text.charAt(5));
		System.out.println(ch);
		
		System.out.println(text.charAt(5));
		
		String text2 = text.concat(" to success").concat(" and we are learning Java");
		System.out.println(text2);
	
		System.out.println(text.contains("Key"));
	
		System.out.println("Message ending with .com: "+text3.endsWith(".com"));
	}

}
/*

i
t
i
Learning is the Key to success and we are learning Java
true
Message ending with .com: true


*/