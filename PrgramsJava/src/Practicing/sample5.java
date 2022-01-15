package Practicing;

import java.util.HashMap;
import java.util.Map;

public class sample5 {

	public static void main(String[] args) {

		String s = "Rooppesh";

		char arr[] = s.toCharArray();

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
		
		Map<Character, Integer> mp= new HashMap<Character, Integer>();
		int count1=1;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					count++;
					mp.put(arr[i], count);
				}else {
					mp.put(arr[i], count1);
				}
			}
		}
		System.out.println(mp);
		
	}

}
