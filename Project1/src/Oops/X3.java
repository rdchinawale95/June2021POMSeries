package Oops;
//inheritance
public class X3 extends BMW{         //BMW exxtends Car and X3 extends BMW, called as Multilevel inheritance

	static String model= "X3";
	public static void main(String[] args) {
		BMW bmw = new BMW();
		//Addition add= new Addition();    just tried pulling from other class
		System.out.println("Model is "+ model);

		//System.out.println("Brand is "+ name);
		System.out.println("Behaviour is ");
		bmw.run();
	
		//add.addValues(4, 5);
	}

}
/*Output
Model is X3
Brand is BMW
Behaviour is 
Car is running
*/
