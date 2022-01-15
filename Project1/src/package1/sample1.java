package package1;

public class sample1 {

	public static void main(String[] args) {
	
		
		int arr[]= {8,9,5,0,3,6,15,30};
int a=2;//foo...2 and 3 foobar
int b=3;//bar
int c=5;//buzz

//		int temp=0;
//		int temp1=0;
//		
//		temp=arr[4];
//		
//		temp1=arr[8];
//		arr[0]=temp;
//		arr[4]=temp1;
//		temp=arr[1];
//		temp1=arr[3];
//		
//		arr[3]=temp;
//		arr[1]=temp1;
//
//		int n=arr.length;
//		for (int i = 0; i < arr.length; i++) {
//			arr[0]=arr[n];
//			
//		}

int arr1[]= {2,3,5};
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr1.length; j++) {
		if ((arr[i]%arr1[i]==0) && (arr[i]%3==0)) {
			System.out.println("foobar");
		}
	}
	
	if ((arr[i]%5==0)) {
		System.out.println("buzz");
	}
	if ((arr[i]%3==0)) {
		System.out.println("bar");
	}
	if ((arr[i]%2==0)) {
		System.out.println("bar");
	}
}
	}}	
		
	


