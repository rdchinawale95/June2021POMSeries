package Practicing;

public class Test1_userClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t1= new Test1();
		t1.name="rupesh";
		Test1.stat="static1";
		t1.setSurname("Chinawale");
		System.out.println(t1.name+" "+Test1.stat+" "+t1.getSurname());
		
		t1.method1();
		t1.method2("method2");
		String m3=t1.method3("method3");
		int m5=Test1.method5(50, "sample");
		
		System.out.println(m3+" /returned values by m3 and m5/ "+m5);
	
		
		t1.Test2method2();
		t1.Test2method1();
		t1.method3("asdfgh3");
		String y=t1.abs1(10);
		System.out.println(y);
		System.out.println("***************");
		t1.testIntMethod3();
		t1.testIntMethod2();
		t1.getTitle();
		t1.testIntMethod4();
		System.out.println("***************");
	

	}

}
