package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 for(int i=0;i<=4;i++) { //System.out.println(i); for(int j=0;j<10;j++) {
		 * System.out.print(i+""+j+" "); } System.out.println("\n"); }
		 */

		/*
		 * 3 for (int i = 4; i >=0; i--) { System.out.println("n="+i); }
		 */

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Orange");
		arr.add("Yellow");
		arr.add("Red");
		arr.add("Blue");
		arr.add("Green");

		System.out.println(arr);

		arr.add(0, "first");
		arr.add(arr.size(), "last");

		System.out.println(arr);

		System.out.println(arr.get(3));

		// 4.replace or update

		arr.set(2, "replace/update");
		System.out.println(arr);

		arr.remove(3);
		System.out.println(arr);

		System.out.println(arr.contains("Blue"));

		Collections.reverse(arr); // 7
		System.out.println(arr);

		System.out.println(arr.subList(0, 3));

		// 9

		/*
		 * arr.removeAll(arr); System.out.println(arr);
		 */
		// 11
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println(arr.get(3));
		System.out.println(arr.get(4));
		System.out.println(arr.get(5));

		Object Rohit[] = new Object[7];
		Rohit[0] = "Rohit";
		Rohit[1] = 26;
		Rohit[2] = "India";
		Rohit[3] = "20-02-1995";
		Rohit[4] = 'M';
		Rohit[5] = 61.32;
		Rohit[6] = true;

		for (int i = 0; i < Rohit.length; i++) {
			System.out.println(Rohit[i]);
		}

		System.out.println("*************************");
		Object Kane[] = new Object[7];
		Kane[0] = "Kane";
		Kane[1] = 26;
		Kane[2] = "New Zealand";
		Kane[3] = "20-02-1995";
		Kane[4] = 'M';
		Kane[5] = 52.32;
		Kane[6] = true;

		for (int i = 0; i < Kane.length; i++) {
			System.out.println(Kane[i]);
		}

		System.out.println("*************************");

		Object Labuchagne[] = new Object[7];
		Labuchagne[0] = "Labuchagne";
		Labuchagne[1] = 26;
		Labuchagne[2] = "Australia";
		Labuchagne[3] = "20-02-1995";
		Labuchagne[4] = 'M';
		Labuchagne[5] = 58.55;
//		
		for (int i = 0; i < Labuchagne.length; i++) {
			System.out.println(Labuchagne[i]);
		}

		Collections.swap(arr, 1, 2);
		System.out.println(arr);

		arr.set(1, "update");
		System.out.println(arr);
	}

}
