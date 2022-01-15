package Practicing;

public class Test1 extends Test2 implements testInterface{

	public String name;
	private String surname;
	static String stat;
	final String fina="final";
	
	public Test1() {
		System.out.println("in the constructor");
	}
	
	@Override
	public void Test2method2() {
		System.out.println("I am in parent Test1 method overrided");
	}
	
	public  String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void method1() {
		System.out.println("i am in method one");
	}
	
	public void method2(String name) {
		System.out.println("i am in method two"+name);
	}
	
	public String method3(String name) {
		String my=name;
		System.out.println("i am in method three"+name);
		return my;
	}
	
	private String method4(String name1) {
		String my1=name1;
		System.out.println("i am in method four"+name1);
		return my1;
	}
	 public static Integer method5(int b ,String d) {
		 int a=b;
		 System.out.println(a+" "+b);
		 return a;
	 }

	@Override
	public String abs1(int z) {
		String s="return String for abstarct overrided method "+ z;
		int y= z;
		return s;
	}

	
	@Override
	public void testIntMethod2() {

		
	}

	@Override
	public void testIntMethod3() {

		
	}

	@Override
	public void testIntMethod4() {

		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

	
}
