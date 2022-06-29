
import java.util.Scanner;
class prgm1
{
	public static void main(String args[]) 
	{float sum= 0.0f;
	Scanner a= new Scanner(System.in);
	System.out.println("Enter first number: ");
	float b=a.nextFloat();
	System.out.println("Enter second number: ");
	float c=a.nextFloat();
	sum=b+c;
	System.out.println("Result of addition is "+sum);
}
}