import java.util.Scanner;
public class ValidatePassword {
  public static void main(String[] args) {
  /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the password string: ");
    String s1 = sc.nextLine();

        int n = UserMainCode.display(s1);
        if(n==1){
         System.out.println("Valid password");
        }else{
         System.out.println("Invalid password");
        }
  }
}
class UserMainCode {
   
    
    public static int display(String password){
if(password.matches(".*[0-9]{1,}.*") 
		&& password.matches(".*[`~!@#$%^&*()-=_+{}|\',./<>?].*") 
		&& password.length()>=6 
		&& password.length()<=20)
                    {
                                    return 1;
                    }
                    else
                    {
                                    return -1;
                    }*/
	  
	  
	  Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the password string: ");
	    String password = sc.nextLine();
	    
	    
	    
	    if (password.matches(".*[0-9]{1,}.*")
	    		&& password.matches(".*[!@#$%^&*()_+-=:,]{1,}.*")
	    		&& password.length()>=6
	    		&& password.length()<=20)
	    {
		System.out.println("Password is valid");	
		}
	    else {
			System.out.println("Password is invalid");
		}
	  
       }
    }