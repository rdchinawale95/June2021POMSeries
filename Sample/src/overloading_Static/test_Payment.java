package overloading_Static;

public class test_Payment {

	public static void main(String[] args) {
		
		Overloading_1.payment("sdf", "asdf","edcv");
		Overloading_1.payment('c');
		
	Overloading_1 obj= new Overloading_1();
	
	
	
	obj.payment();
	obj.payment(136988520);
	obj.payment(1329789525);
	obj.payment("asdfg@ghjk.com");
	obj.payment(12, 20);
	obj.payment("asd", "ghjk");
	obj.payment(23, 56,85);
	obj.payment(63);
	obj.payment(563);
	
	
	
	}

}
