package code;

public class Sample1 {

	public void mix(int a, long b)
	{
		System.out.println("First method");
	}
	
	public void mix(int a, int b)
	{
		System.out.println("Second Method");
	}
	
	public static void main(String[] args) {
		
		
		Sample1 s1= new Sample1();
		s1.mix(10, 52);
		
		
	}

}
