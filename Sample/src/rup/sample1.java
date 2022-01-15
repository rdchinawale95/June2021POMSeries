package rup;


public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s= "Lalit";
		String t="Barhate";
//		String rev="";
//		for (int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//			
//		}
//		System.out.println(rev);
		
		System.out.println(s+" "+t);
		
		String u="";
		s=s+t;
		t= s.substring(0, s.length()-t.length());
		s=s.substring(t.length());
		System.out.println("After:"+s+" "+t );
	}

}
