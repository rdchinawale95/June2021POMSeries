package constructor;

import java.util.Iterator;

public class TestConstructor {
	
	
public void m1() {
		m2();
	}


public void m2() {
	m1();
}

public static void t1() {
	t2();
	
}

public static void t2() {
t1();
TestConstructor tc= new TestConstructor();

tc.m1();
tc.m2();
}

	public static void main(String[] args) {
		
		String[] devicelist= {"Apple iphone", "Nokia", "Samsung"};
		
		Employee_devices ed= new Employee_devices("Tom", 30, devicelist);
	

		System.out.println(ed.name+" "+ed.age);
		
		for (String string : devicelist) {
			System.out.println(string);
		
		}
		
		
	
	}

}
