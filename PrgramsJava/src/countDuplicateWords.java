import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicateWords("java is java is goog than python python");
	}

	public static void findDuplicateWords(String input) {

		String[] words = input.split(" ");

		Map<String, Integer> mp = new HashMap<String, Integer>();

		for (String word : words) {
			if (mp.containsKey(word)) {
				mp.put(word.toLowerCase(), mp.get(word) + 1);
			} else {
				mp.put(word, 1);
			}
		}
		System.out.println(mp);

		Set<String> wordInString = mp.keySet();
		for (String word : wordInString) {
			if (mp.get(word) > 1) {
				System.out.println(word + ":" + mp.get(word));
			}
		}
		System.out.println(wordInString);

	}

}
