
public class qwe_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem
		
		String one= new String("JOHN PARKER");
		one = one.toLowerCase();
		//System.out.println(one.toLowerCase());
		System.out.println(one);
		//2
		String text= "to lower case";
		text= text.replace(" ", "_");
		System.out.println(text);
		
		
		//3
		
		String letter="Dear name, thanks alot";
		letter= letter.replace("name", "Harry");
		System.out.println(letter);
		
		//4
		String myString= "This string contain  spaces";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		
		//
		String letter2= "Dear HArry,\n\tthis course is nice \n\tThakns";
		System.out.println(letter2);
	
	}

}
/*output
john parker
to_lower_case
Dear Harry, thanks alot
19
-1
Dear HArry,
	this course is nice 
	Thakns
*/