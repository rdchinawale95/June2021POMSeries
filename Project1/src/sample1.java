
public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3,6,9 foo
//5,10,15 bar
//15,30 foo_bar
//or else number
		
		int a= 0;
		System.out.println(a);
		for (int i = 1; i <=100; i++) {
			if (i%15==0) {
				System.out.println("foo_bar");
			}
			else if(i%5==0) {
				System.out.println("bar");
			}
			else if (i%3==0) {
				System.out.println("foo");
			}else {
				System.out.println(i);
			}
		}
		
	}
//To verify creating 
//verify 
//
}
