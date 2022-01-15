package Encapsulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class TestBrowser {
//encapsulation
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bw= new Browser();
		bw.launchBrowser();
		
		Browser bw1= new Browser();
		bw1.setName("Peter");
		bw1.setAge(25);
		bw1.setCity("Pune");
		System.out.println("**************");
		System.out.println(bw1.getName()+" "+bw1.getAge()+" "+bw1.getCity());

	}

}
