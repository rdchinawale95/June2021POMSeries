import java.awt.List;
import java.util.ArrayList;

public class duplicate_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String arr[]= {"java","c++","js","python","java","python","c++"};
		
		ArrayList<String> org=new ArrayList<String>();
		
		for (int i = 0; i < arr.length; i++) {
			org.add(arr[i]);
		}
		System.out.println("original list: "+org);
		
		
		ArrayList<String> dup=new ArrayList<String>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					//String a= ;
					dup.add(arr[i]);
					
				}
			}
		}
		System.out.println("Duplicate elements are: "+dup);
		
	}

}*/
		
int arr[]= {11,12,13,14,15,11,12,14};
		
		ArrayList<Integer> org=new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			org.add(arr[i]);
		}
		System.out.println("original list: "+org);
		
		
		ArrayList<Integer> dup=new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					//String a= ;
					dup.add(arr[i]);
					
				}
			}
		}
		System.out.println("Duplicate elements are: "+dup);
		
	}

}

