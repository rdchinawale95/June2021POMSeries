package Array;

public class PassArrayToMethod {
	
	public static void findMin(int arrayOne[]) {
		int min = arrayOne[0];
		
		for (int i = 1; i < arrayOne.length; i++) {
		if (min>arrayOne[i]) {
			min = arrayOne[i];
		}	
		}
System.out.println("Min elemet is: "+min);
	}
	
	public static int[] getArray() {
		return new int[] {12,13,41,52,16,26,24,23};
	}

	public static void main(String[] args) {
		PassArrayToMethod pass =new PassArrayToMethod();
		int arrayTest[] = {12,13,14,15,16,3};
		pass.findMin(arrayTest);
		
		int arrayThree[] = pass.getArray();
		System.out.println(arrayThree[2]);
		
	}

}
/*
Min elemet is: 3
41
*/