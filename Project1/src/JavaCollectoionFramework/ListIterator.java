package JavaCollectoionFramework;

import java.util.ArrayList;

public class ListIterator {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		for (int i = 0; i < 10; i++)
			a.add(i);
			
	System.out.println("Elements of ArreayList"+a);
	
	java.util.ListIterator ltr = a.listIterator();
	
	while(ltr.hasNext()) {
		
		int i = (int) ltr.next();
		
		System.out.println(i+ "");
		
		if (i%2==0) {
			
			i++;
			ltr.set(i);   //to change value
			ltr.add(i);  //to add value
		}
		
	}
	System.out.println();
	System.out.println("Ele after modification: "+a );
	
	}

}
