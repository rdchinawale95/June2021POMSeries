package code;

public class MyApplication {
	String name;
	int age;

	public static void main(String[] args) {

		MyApplication obj = new MyApplication();
		obj.name = "Tom";
		obj.age = 25;
		
		MyApplication.test(obj);    //call by reference
		//here we are passing object reference obj to p1 in test method
		
		//obj.test(obj);    //when test is non static
		
		
	}
	
	public static void test(MyApplication p1) {//try mmaking it normal method
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p1.app();
		
		MyApplication p2 = p1;   //passing reference to p2
		p2.app();
		System.out.println(p2.name + ":" +p2.age);
	}
	
	
	public void app() {
		System.out.println("this is my app....");
	}
	
	
	
	

}
