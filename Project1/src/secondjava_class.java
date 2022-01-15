
public class secondjava_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "hello";
		String str2= "world";
		
		int a = 200;
		int b = 300;
		/*
		System.out.println(str1+ " "+ str2);   //hello world
		System.out.println(a+b);   //500
		 	
		System.out.println(a+b+str1+str2);  //500helloworld
		System.out.println(str1+str2+a+b);   //helloworld200300 it assumes that the entire string is string as it is starting from a string
		*/
		
	/*
		if (a>1000) {
			System.out.println("a is more than 1000");
		}
		
			else {
				System.out.println("a is less than 1000");
		
			}
		*/
		
		//nested if else
	/*	if (a==100) {
			System.out.println("a is 100");
		} else if(a==200) {
			System.out.println("a is 200");
		}
		else if(a==300) {
			System.out.println("a is 300");
		}
		else {
			System.out.println("nothing");
		}*/
		
		int day= 6;
		
		switch (day) {
		case 1:
			System.out.println("Today is monday");
			break;

		case 2:
			System.out.println("today is tuesday");
			break;		//it will print if break is present and is not matching case
			
		case 3: 
			System.out.println("today is wednesday");
			break; 
		default:
			System.out.println("its weekend");
			break;   
		}
	
	}

}
