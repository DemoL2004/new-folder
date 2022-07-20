package items;

import java.io.IOException;

public class counts
{
 public static void main(String[]args)
 {
	 try
	 {
		 Runtime.getRuntime().exec("wscript D:/anu/count.vbs");
	 }
	 catch(IOException e)
	 {
		 System.exit(0);
	 }
	 
 }
}
