package Practicing;

public abstract class Test2 {
	
	private String ab="sdf";
	
	
	public Test2() {
		System.out.println("Constructor of parent Test2");
	}
	
	public void Test2method1() {
		System.out.println("I am in parent Test2 method1");
	}
	
	public void Test2method2() {
		System.out.println("I am in parent Test2 method2");
	}
	
	public void Test2method3() {
		System.out.println("I am in parent Test2 method3");
	}
	
	public abstract String  abs1(int z);
}