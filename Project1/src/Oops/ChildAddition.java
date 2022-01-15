package Oops;


//Method overloading
public class ChildAddition extends Addition{

	public static void main(String[] args) {
		
		Addition add= new Addition();
		
		add.addValues(4, 5);
		add.addValues(5, 5, 5);
		//add.addValues(4.552, 8.22);     had used to run the third method of doule in addition.java with print statement
		
		add.addValues(5, 6);
		
		double d= add.addValues(4.53, 6.33);   //as the third method of double is returning c we need to store the output of it first iN A VARIABLE AND THEN NEED TO Print it
		System.out.println(d);
		
	}

}
/*
Addition is 9
Addition is 15
Addition is 12.772

*/
/* including return method for double
Addition is 9
Addition is 15
Addition is 11
10.86
*/