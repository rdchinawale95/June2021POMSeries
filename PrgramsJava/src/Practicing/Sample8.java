package Practicing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) throws FileNotFoundException {
//		
//		FileInputStream sc= new FileInputStream("C://Users//Rupesh Chinawale//Desktop//sample.txt");
//		
//		String str=sc.toString();
//		System.out.println(str);

//		Map<Integer,String > hp= new HashMap<Integer, String>();
//		hp.put(1, "Tom");
//		hp.put(2,"Bob");
//		hp.put(3,"Aks");

		Scanner input = new Scanner(new File("C://Users//Rupesh Chinawale//Desktop//sample.txt"));
		String s = input.next();
		System.out.println(s);
		String st[] = s.split(",");

	}
}
