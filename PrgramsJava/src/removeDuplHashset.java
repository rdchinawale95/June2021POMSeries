 import java.util.HashSet;

public class removeDuplHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","cpp","python","python"};
		boolean flag = false;
		HashSet<String>langs= new HashSet<String>();
		
		for (int i = 0; i < arr.length; i++) {
			if((langs.add(arr[i]))==false) {
				System.out.println("Found duplicate element:" +arr[i]);
				flag=true;
			}
			
		}
			
			if (flag==false) {
				System.out.println("found no duplicates");
			}
		}
}

