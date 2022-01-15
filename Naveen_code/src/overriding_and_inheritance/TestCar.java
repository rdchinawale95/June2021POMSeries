package overriding_and_inheritance;

public class TestCar {


	public static void main(String[] args) {
		
		final int i = 10;//constant variable
		
		final int days = 7;
		System.out.println(days * 100);

		BMW b = new BMW();
		b.start();//overriden
		b.stop();//inherited from P
		b.refuel();//inherited
		b.autoParking();//Individual
		b.engine();//inherited from GP
		b.airBags();
		b.stop();
		
		System.out.println(b.price);
		
		BMW.testing();
		Car.testing();
		
		System.out.println("*************");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.airBags();
		Car.testing();

		System.out.println("*************");
		//top/up casting:
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//all car methods will run 
		//if method is overrided in BMW, BMW's method will run
		//grandparent method will run
		
		System.out.println("*************");
		//c1.autoParking();//-->ref type check
		
		//child class object can be referred by grant parent class ref variable
		Vehicle v1 = new BMW();
		v1.airBags();
		v1.engine();
	
		

		//down casting: parent class object can be referred by child class ref varibale
		//BMW b1 = (BMW)new Car();//ClassCastException at run time
		
		//BMW b2 = (BMW)new Vehicle();
		
	}

}
