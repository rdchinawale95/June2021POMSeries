package JavaCollectoionFramework;
import java.util.Enumeration;
import java.util.Vector;

public class Iterator {
	//Enumeration iterator
 public static void main(String arg[]) {
	
	Vector v= new Vector();
	
	for (int i=0;i<10;i++) {
		v.addElement(i);
	}
	
	System.out.println(v);
	
	Enumeration e= v.elements();//it is for vector and hashtables
	
	while (e.hasMoreElements()) {
		int  i = (Integer) e.nextElement();
		System.out.println(i+ "");
	}
}
}
