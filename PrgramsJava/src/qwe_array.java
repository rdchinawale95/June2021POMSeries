
public class qwe_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p1-sum
		float [] one= {41.2f, 8f,4f,6f,7f};	
		float sum=0;
		
	/*	
	 * for (int i = 0; i < one.length; i++) {
			sum= sum+one[i];
			
		}*/
		
		for (float f : one) {
			sum=sum+f;
		}
		System.out.println(sum);
		
		//p2-presence of number
		
		float[] two= {41.2f, 8f,4f,6f,7f,8f};
		float num= 8.1f;
		boolean present= false;
		
		for (float f : two) {
			if (num==f) {
				present=true;
				break;
			}
		}
		if (present) {
			System.out.println("number is present"+ num);
		}	
			
		else {
			System.out.println("number is not present");
		}
		
		
	
		//p3-average of number
	int [] marks= {10,20,30,40,50};
	int sum1= 0;
	 for (int i : marks) {
		sum1=sum1+i;
	}
	
	 System.out.println("The average of th marks is"+ sum1/marks.length);
	 
	 
	 //p4-adding of two matrices
	 
	 int [][]mat1= {{1, 2, 3},
	                 {4, 5, 6}};
	 
	 System.out.println(mat1);
	 System.out.println(mat1.length);	
	 
	 int [][]mat2= {{2, 6, 13},
             		{3, 7, 1}};
	 System.out.println(mat2);
	 
	 int [][]result= {{0, 0, 0},
             		  {0, 0, 0}};
	 System.out.println(result);
	 
	 for (int i = 0; i < mat1.length; i++) {
		 for (int j = 0; j < mat1[i].length; j++) {
			 
			 System.out.format("Setting value for i=%d and j=%d\n", i, j);
			result[i][j]= mat1[i][j]+mat2[i][j];
			
			 
		}
		
	}
	 
	 for (int i = 0; i < mat1.length; i++) {
		 for (int j = 0; j < mat1[i].length; j++) {
			 
			 System.out.print(result[i][j]+" ");
			result[i][j]= mat1[i][j]+mat2[i][j];
			 
		}
		 System.out.println("");
		
	}
	 //p5-max number
	 int [] arr= {10,5,6,7,8,9,2};
	 int l= arr.length;
	 int n= Math.floorDiv(l, 2);
	 int temp;
	 
	 
	for (int i = 0; i < n; i++) {
		 temp=arr[i];
		 arr[i]=arr[l-1-i];
		 arr[l-1-i]=temp;
	}
	
	for (int m : arr) {
		 System.out.print(m+" ");
		 
	}
System.out.println();
	//p6
	int [] six= {10,5,6,7,8,9,2};
	int max=0;
	
	
	for (int i : six) {
		if (i>max) {
			max=i;
		}
	} 
	System.out.println("max number is" +max);
	
	int [] a= {-1,100,5,6,7,8,9,2};
	int max1=a[0];
	for (int i=1;i<a.length;i++) {
		if (a[i]>max1) {
			max1=a[i];
		}
	}
	
	
	System.out.println("max number is" +max1);
	
	
		//p7-min number
	int [] seven= {-1,10,5,6,7,8,9,2};
	int min=seven[0];
	for (int i=1;i<seven.length;i++) {
		if (seven[i]<min) {
			min=seven[i];
		}
	}
	
	
	System.out.println("min number is" +min);
	
	}

	}

