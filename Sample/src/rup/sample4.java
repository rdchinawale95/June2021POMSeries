package rup;

public class sample4 {

	public static void main(String[] args) {
		String str= "ABCDE12345";
		char [] ch= str.toCharArray();
		
		for (int i=0;i<str.length();i++) {
			if (ch.equals(1)||ch.equals(2)||ch.equals(3)||ch.equals(4)||ch.equals(5)) {
				System.out.println(ch);
			}
			
		}
	}

}
