package Practicing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arr1= new ArrayList<String>();
		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("d");
		arr1.add("e");
		List<String> arr2= new ArrayList<String>();
		arr2.add("c");
		arr2.add("a");
		arr2.add("b");
		arr2.add("d");
		
		if (arr1.size()==arr2.size()) {
			arr1.containsAll(arr2);
		}
		else {
			System.out.println("This is not equal");
		}
		
	}

}
