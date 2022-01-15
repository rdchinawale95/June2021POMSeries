
public class Dog {

		String name= "jacky";
		String breed="bulldog";
		int height=4;
		
		public void barking(){
			System.out.println(name +"is barking");
	}
		public void eating(){
			System.out.println(name +"is eating");
		}
		

		public static void main(String[] args) {
			
			Dog dogclass = new Dog();
			
	System.out.println(dogclass.name);
	dogclass.barking();
	
	Dog obj= new Dog();
	obj.eating();
	}

}
