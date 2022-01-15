
public class CounterClass_static {

	int i= 0;		//vairable wo static belongs to object as while creating object all the properties of class are acquired by object in declaration
	static int j= 0;     //static variable. it is initialized once only and belongs to class
	
	
	
	public CounterClass_static() {
		
		i++;
		j++;
		
		System.out.println("value of i is "+i);

		System.out.println("value of j is "+j);
	}
	
	public static void main(String[] args) {
		
		
		CounterClass_static counter = new CounterClass_static();
		CounterClass_static counter1 = new CounterClass_static();
		CounterClass_static counter2 = new CounterClass_static();
		
		/*System.out.println(counter.i);
		System.out.println(counter1.i);
		System.out.println(counter2.i);
		System.out.println(CounterClass_static.j);*/
	}

}


/*
 Output:
 
 In output the value of i is same but j is increased ecoz i for object/instance variable and j is static/class variable
 
 value of i is 1
value of j is 1
value of i is 1
value of j is 2
value of i is 1
value of j is 3
*/
