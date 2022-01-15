package code;

public class NullReferenceConcept {

	String name;
	int age;

	public static void main(String[] args) {

	/*s	NullReferenceConcept obj = new NullReferenceConcept();
		//System.out.println(obj.age);
		
		obj.name = "Sachin";
		obj.age = 20;

		obj = null;//null reference//no reference

		System.out.println(obj.name);// NPE
		
		*/
	
		
		//reverse words and count of chracters
		String s= "I am good";
		char[] t= s.toCharArray();
		
		int c1=0; 
		String rev1="";

		for (int i = t.length-1; i >= 0; i--) {
			if (s.charAt(i)!=' ') {
				c1++;
			}
			rev1= rev1+t[i];
			
		}
	
	 System.out.println(rev1);
	 System.out.println(c1);
	 
	 //reverse words and count of words
	 String r= "I am good java programmer for cognizant";
	 String [] arr= "I am good java programmer for cognizant".split(" ");
	 int c=0;
	 String rev=""; 
	 String rev2=""; 
	 for (int j = arr.length-1; j >=0; j--) {
		 c++;
		 rev= rev+arr[j];
	}
	System.out.println(rev+" "+c);
	
	
	//reverse
	int len=r.length();
	for (int  u=len-1 ;  u >=0;  u--) {
	rev2+=r.charAt(u);	
	}
	 System.out.println(rev2);
	 
	 
	 //longest word and its length
	 int count=0;
	 String longest="";
	 for (int i = 0; i <= arr.length-1; i++) {
		 System.out.println(arr[i]+" "+arr[i].length());
		 if (arr[i].length()>count) {
			 longest=arr[i];
			count=arr[i].length();
		}
	}
	 System.out.println("longest word is: "+longest+"\nlongest word count is: "+count);
	 
	 
}
}
