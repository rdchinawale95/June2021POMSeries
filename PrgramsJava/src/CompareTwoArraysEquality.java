import java.util.Arrays;

public class CompareTwoArraysEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=true;
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,4,4,5};
		
		/*Arrays.equals(arr1, arr2);
		System.out.println("Two arrays are equal");*/
		
		if(arr1.length==arr2.length) {
			
			for (int i = 0; i < arr1.length; i++) 
			{
				if (arr1[i]!=arr2[i])
				{
					a=false;
				}
			}
		}
			
		else 
		{
			a=false;
		}
			
		if (a==true) {
			System.out.println("Two arrays are same");
		}
		else {
			System.out.println("Two arrays aer not equal");
		}
	

}
}

