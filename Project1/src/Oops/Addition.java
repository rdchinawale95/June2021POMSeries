package Oops;
//addition extends to child addition

/*Method overloading- If a class has mulitple methods having same names but different parameters is called method overloading
By two types we can achieve method overloading
1. by changing the number of parameters/
2. by changing the return type
*/
//public class Addition extends FinalClass {   //he type Addition cannot subclass the final class FinalClass

	public class Addition{
	
	public void addValues(int a,int b) {
		
		int c= a+b;
		System.out.println("Addition is "+c);
	
	}
	
public void addValues(int a,int b, int c) {
		
		int d= a+b+c;
		System.out.println("Addition is "+d);
}

	//public void addValues(double a, double b) {
public double addValues(double a, double b) {  //here double is used to return value as double
		double c= a+b;
		//System.out.println("Addition is "+c);
		return c;   //it will return value of c
	}
}