import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr1= new ArrayList<Integer>();
		arr1.add(43);
		arr1.add(13);
		arr1.add(23);
		arr1.add(83);
		arr1.add(13);
		//arr1.add(null);
		arr1.size();
		System.out.println("ArrayList: "+(arr1));
		System.out.println("ArrayList max: "+Collections.max(arr1));
		
		LinkedList<Integer> ll= new LinkedList<Integer>();
		
		ll.add(20);
		ll.add(28);
		ll.add(24);
		ll.add(25);
		ll.add(20);
		ll.add(null);
		
		System.out.println("LinkedList: "+ll);
		
		HashSet<Integer> hs=new HashSet<Integer>(ll);
		hs.addAll(ll);
		System.out.println("HashSet: "+hs);
		
		LinkedHashSet<Integer> lh= new LinkedHashSet<Integer>();	
		lh.add(76);
		lh.add(06);
		lh.add(46);
		lh.add(72);
		lh.add(69);
		lh.add(76);
		//lh.add(null);
		
		System.out.println("LinkedHashSet: "+lh);
		System.out.println("LinkedHashSet min : "+Collections.min(lh));
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		ts.add(76);
		ts.add(06);
		ts.add(46);
		ts.add(72);
		ts.add(69);
		ts.add(76);
		//ts.add(null);
		//nullvalue not allowed in treeset
		System.out.println("TreeSet: "+ts);
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "asd");
		hm.put(1, "asd");
		hm.put(3, "zxc");
		hm.put(2, "plm");
		hm.put(4, "ujn");
		hm.put(5, "asd");
		hm.put(6, null);
		hm.put(null, null);
		
		
		hm.entrySet();
		
		//sorted,no duplicates,duplicate values allowed
		
		
		System.out.println("HashMap: "+hm);
		
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(1, "asd");
		lhm.put(1, "asd");
		lhm.put(3, "zxc");
		lhm.put(2, "plm");
		lhm.put(4, "ujn");
		lhm.put(5, "asd");
		lhm.put(6, null);
		lhm.put(null, null);
		
		System.out.println("LinkedHashMap: "+lhm);
		//not sorted,insertion order is maintained,no duplicate key,duplicate values allowed	
	
		TreeMap<Integer, String> tsm = new TreeMap<Integer, String>();
		
		
		tsm.put(1, "asd");
		tsm.put(1, "asd");
		tsm.put(3, "zxc");
		tsm.put(2, "plm");
		tsm.put(4, "ujn");
		tsm.put(5, "asd");
		tsm.put(6, null);
		//tsm.put(null, null);
		System.out.println("TreeMap: "+tsm);
		//sorted,no duplicates,duplicate values allowed,no null key is allowed	
		
		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
		ht.put(1, "asd");
		ht.put(1, "asd");
		ht.put(3, "zxc");
		ht.put(2, "plm");
		ht.put(4, "ujn");
		ht.put(5, "asd");
		//ht.put(6, null);
		//ht.put(null, null);
		System.out.println("Hashtable: "+ht);
		Enumeration e= ht.keys();    //it is for vector and hashtables
		
		while (e.hasMoreElements()) {
			int  r = (Integer) e.nextElement();
			System.out.println(r+ "");
		}
		
		
		HashMap<String,String> h1=new HashMap<String,String>();
		h1.put("Tom", "asd");
		h1.put("Peter", "asd");
		h1.put("Alter", "zxc");
		h1.put("Zack", "plm");
		h1.put("Peter", "asd1");
		h1.put(null, "some");
		h1.put(null, "some1");
		System.out.println(h1);
		
		System.out.println(h1.get("Peter"));
		System.out.println(h1.get(null));			
		}
		
	}


