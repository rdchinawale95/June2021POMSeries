
public class sample2 {

	public static void main(String[] args) {

		String s = "learning java";

		String[] a = s.split(" ");

		String rev = "";

		for (String str : a) {
			{
				for (int j = str.length() - 1; j >= 0; j--) {
					rev = rev + str.charAt(j);
					
				}
				rev=rev+" ";
			}
			
		}
		System.out.println(rev.trim());
	}

}
