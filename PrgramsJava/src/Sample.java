import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Sample {

	public static void main(String[] args) {
		
		String s="Java 100 Pune";
		
		String s1= "Mumbai 200";
		String s2= "100 Jalgaon";
		
		
//		if(s.contains("100")) {
//		System.out.println("Test case s is passed");
//		
//		}else {
//			System.out.println("s test case is failed");
//		}

		String []ar= s.split(" ");

		String r= "100";
		boolean b=false;
		
		for (int i = 0; i <= ar.length-1; i++) {
			if (ar[i]=="100") {
				b=true;
			}else {
				b=false;
			}
		}
		if (b=true) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
	}
}
		
		
		
		
		
//		static int isSubstring(
//		        String s1, String s2)
//		    {
//		        int M = s1.length();
//		        int N = s2.length();
//		 
//		        /* A loop to slide pat[] one by one */
//		        for (int i = 0; i <= N - M; i++) {
//		            int j;
//		 
//		            /* For current index i, check for
//		            pattern match */
//		            for (j = 0; j < M; j++)
//		                if (s2.charAt(i + j)
//		                    != s1.charAt(j))
//		                    break;
//		 
//		            if (j == M)
//		                return i;
//		        }
//		 
//		        return -1;
//		    }
//		 
//		    /* Driver code */
//		    public static void main(String args[])
//		    {
//		        String s1 = "100";
//		        String s2 = "Java 100 Pune";
//		 
//		        int res = isSubstring(s1, s2);
//		 
//		        if (res == -1)
//		            System.out.println("failed");
//		        else
//		            System.out.println(
//		                "Contains 100 testcase passed "
//		                + res);
//		    }
//		
		



