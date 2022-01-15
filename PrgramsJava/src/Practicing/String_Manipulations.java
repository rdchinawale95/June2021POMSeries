package Practicing;

public class String_Manipulations {

	public static void main(String[] args) {
		
		
		String s= "100A";
		char [] ch= s.toCharArray();
		String t=s.substring(0, 3);
		int a= Integer.parseInt(t);
		System.out.println(a);
		
		
		Double d= Double.parseDouble(t);
		System.out.println(d);
		
		String u= String.valueOf(a);
		System.out.println(u);
		
		char o ='r';
		String v= String.valueOf(o);
		System.out.println(v);
		
		
		}
	}


