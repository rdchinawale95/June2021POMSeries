
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java is language java is language rupesh rupesh not";
		/*
		 * String rev="";
		 * 
		 * for (int i = s.length()-1; i>=0;i--) { rev = rev+ s.charAt(i);
		 * 
		 * } System.out.println(rev);
		 */

		/*
		 * String as[]=s.split(" "); String revwords=""; for (int i = as.length-1; i
		 * >=0; i--) { revwords= revwords+as[i]+" "; } System.out.println(revwords);
		 */

		/*
		 * String duplicate=""; short count=0; boolean b; String as[]=s.split(" "); for
		 * (int i = 0; i <= as.length-1; i++) { for (int j = i+1; j <= as.length-1; j++)
		 * {
		 * 
		 * if (as[i].equals(as[j])) { //duplicate=duplicate.concat(as[i]+" ");
		 * System.out.println(as[i]); } }
		 * 
		 * }
		 * 
		 * 
		 * //System.out.println(duplicate);
		 */

		String s1 = "aassgghjkl";
		
		StringBuilder sbr = new StringBuilder();
		String s2;
		char[] ch1;
		char[] ch = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean b=false;

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {

					b = true;
					System.out.println(ch[i]);
					break;
				}
			}
			if (!b) {
				sbr.append(ch[i]);
			}
		}
		System.out.println(sbr);

	}

}
