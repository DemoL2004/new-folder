import java.util.Scanner;
public class circ{
	public static void main(String args[]){
	Scanner a= new Scanner(System.in);
	double pi=3.14,area=0.00;
	System.out.println("Enter the radius");
	double r=a.nextDouble();
	area=pi*r*r;
	System.out.println("The area is: "+area);
	}

}