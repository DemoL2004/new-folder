import java.util.Scanner;
public class largestof3 {
	public static void main(String args[]){
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=S.nextInt();
		System.out.println("Enter the second number");
		int b=S.nextInt();
		System.out.println("Enter the third number");
		int c=S.nextInt();
		if (a > b){
			if( a > c)
				System.out.println("A is largest");
			else if(a<c)
				System.out.println("C is largest");
			else
				System.out.println("Both c and a are larger");}
		else if(b >c)
			System.out.println("B is largest");
		else
			System.out.println("c is largest");
		}
}