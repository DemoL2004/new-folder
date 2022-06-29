import java.lang.String;
import java.util.Scanner;
public class g1{
	public static void main(String args[]){
	String a="piyush";
	String b=" PRAKASH";
	Scanner s=new Scanner(System.in);
	System.out.println("Guess my first name");
	String c=s.nextLine();
	if (a.compareTo(c)==0) {
		System.out.println("Correct");
		
		}
	else{
		System.out.println("Wrong "+a.compareTo(c.toLowerCase()));}
	System.out.println("My first name is "+a.toUpperCase()+" which has a length of  " +a.length());
	System.out.println("My full name is "+a.concat(b.toLowerCase()));
	}
}