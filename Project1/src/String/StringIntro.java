package String;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Anshul chauhan";  //memory efficient way
		String name1= "Anshul chauhan";
		String name2= "anshul chauhan";
		
		String country = new String("United state");   //consumes more memory
		String country1 = new String("United state");
		String str1 ="";
		String str2= null;
		
		System.out.println(str1.isEmpty());
		/*System.out.println(name);

		System.out.println(country);*/
		
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(country.equalsIgnoreCase(country1));
		
		System.out.println(name==name1);
		System.out.println(country==country1);  //it is comparing reference instead of value becoz country and country 1 is object so they have referece memory in JVM
		
		String finalString = name+name1+name2;
		System.out.println(finalString);
		
		String secString= name.concat(name1).concat(name2);
		System.out.println(secString);
		
		
	}

}
/*true
false
true
true
true
false
Anshul chauhanAnshul chauhananshul chauhan
Anshul chauhanAnshul chauhananshul chauhan
*/