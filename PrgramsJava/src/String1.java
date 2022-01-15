
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "Virat Kohli has won us the match";
		
		System.out.println(s);
		s.toCharArray();
		String[] r= s.split(" ");
		String reverse= "";
		System.out.println(r);
	
	/*	for (String w : r) {
			System.out.println(w);*/
			
			for (int i=r.length-1; i >= 0; i--) {
				
				reverse= reverse+" ";
			}
			
		
	System.out.println(reverse);
			
			
	}
	}


