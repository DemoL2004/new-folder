import java.util.Scanner;
public class mn{
	public static void main(String args[]){
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the first number");	
	int m=a.nextInt();
	System.out.println("Enter the second number");
	int n=a.nextInt();	
	while (m!=n){
		if (m>n)
			m=m-n;
		else
			n=n-m;	
		}
	System.out.println("The gcd is "+m);
	}
}