
public class oddEvenInString {
	int arr[]= {2,3,4,5,6};
	
	public void OE() {
	System.out.println("Even number in array are:");
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==0) {
			System.out.println(arr[i]);
	}
	}
	
	System.out.println("Odd number in array are:");
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddEvenInString prg= new oddEvenInString();
		prg.OE();
		
}
}
