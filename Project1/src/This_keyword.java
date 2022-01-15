
public class This_keyword {

	int rollnumber;
	String name;
	String standard;
	
	public This_keyword(int rollnumber, String name, String standard) {
		
		this.rollnumber= rollnumber; //here this.rollnumber is class variable
		this.name = name;      // //here this.name is class variable
		this.standard = standard;    // //here this.standard is class variable
		
	}
	
	public void display() {
		System.out.println("Rollnumber= "+rollnumber+ " and name is "+name+ " and standard is "+standard);
	}
	public static void main(String[] args) {
		
		This_keyword obj = new This_keyword(24, "rupesh", "second");

		This_keyword obj1 = new This_keyword(4, "rup", "fifth");

		obj.display();

		obj1.display();
	}
/*
  output:
	Rollnumber= 24 and name is rupesh and standard is second
	Rollnumber= 4 and name is rup and standard is fifth
			*/
}
