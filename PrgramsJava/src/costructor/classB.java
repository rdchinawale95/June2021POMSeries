package costructor;

public class classB extends classA{

	public  classB() {
		super(10);
		System.out.println("in classB");
	}
	
	public classB(int a) {
		super(10,20);
		System.out.println("in classB with int value");
	}
	
	public static void main(String [] args) {
		classB cb= new classB();
		//classB cb1= new classB(10);
	}
}
