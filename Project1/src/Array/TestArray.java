package Array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayOne[]= new int[6];
		
		arrayOne[0]= 12;
		arrayOne[1]= 13;
		arrayOne[2]= 15;
		
		arrayOne[3]= 16;
		arrayOne[4]= 19;
		arrayOne[5]= 23;
		System.out.println(arrayOne[4]);
		
		for (int i = 0; i < arrayOne.length; i++) {
		System.out.println(arrayOne[i]);	
		}
		
		int arrayTwo[]= {10,20,30,40,50,60};
		System.out.println("size of array is "+ arrayTwo.length);
	}

}

/*19
12
13
15
16
19
23
sieof array is 6
*/
