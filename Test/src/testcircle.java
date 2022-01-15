import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testcircle {

	public static void main(String[] args)  throws IOException {  {
		// TODO Auto-generated method stub
		

		      FileInputStream in = "Let's meet l8r 2nite?";
		      FileOutputStream out = null;

		      try {
		         in = new FileInputStream("input.txt");
		         out = new FileOutputStream("output.txt");
		         
		         int c;
		         while ((c = in.read()) != -1) {
		            out.write(c);
		         }
		      }finally {
		         if (in != null) {
		            in.close();
		         }
		         if (out != null) {
		            out.close();
		         }
		      }
	}
}}
