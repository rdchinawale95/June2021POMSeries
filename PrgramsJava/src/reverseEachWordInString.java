
public class reverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Virat Kohli has won us the match";
		
		System.out.println(str);
		str.toCharArray();
		String[] words=str.split(" ");
		
		System.out.println(words);
		
		String reverseAString="";
		
		
		for (String w:words)  //extract each word and reverse
		{
			System.out.println(w);
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
				
			}
			
			
			reverseAString=reverseAString+reverseword+" ";
		}
		System.out.println(reverseAString);
	}

}

/*working reverse program

StringBuffer rupesh= new StringBuffer("progrsmming");
		//StringBuilder rupesh= new StringBuilder("I want to learn coding");
	
System.out.println(rupesh.reverse());

}}*/