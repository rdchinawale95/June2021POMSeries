
public class countOccurences_inString {

	public static void main(String[] args) {

		String s = "Java programming Java oops";

		int totallength = s.length();

		int tolength_afterremove = s.replace("a", "").length();

		int count = totallength - tolength_afterremove;

		System.out.println(count);
	}

}
