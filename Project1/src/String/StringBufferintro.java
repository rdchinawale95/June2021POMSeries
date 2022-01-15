package String;

public class StringBufferintro {

	public static void main(String[] args) {

		//StringBuffer rupesh= new StringBuffer("I want to become perfect in coding");
		//StringBuilder rupesh= new StringBuilder("I want to learn coding");
		String name = "Anshul";        //Anshul
		name.concat("Chauhan");
		
		System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Anshul");
		
		name1.append("Chauhan");
		System.out.println(name1);      //AnshulChauhan
		name1.insert(4, "Chauhan");
		System.out.println(name1);      //AnshChauhanulChauhan
		name1.replace(1, 3, "chauhan");
		System.out.println(name1);      //AchauhanhChauhanulChauhan
		name1.delete(1, 10);
		System.out.println(name1);      //AhauhanulChauhan
		name1.reverse();
		System.out.println(name1);      //nahuahClunahuahA
		
		
		//System.out.println(rupesh.reverse());
	}

}


