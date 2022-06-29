import java.util.Scanner;
public class switchj 
{
	public static void main(String args[]){
	Scanner a=new Scanner(System.in);
	String capital;
	System.out.print("Enter your Country : ");
	String Country= a.nextLine();
	switch(Country){
		case "India":capital="Delhi";
			System.out.println("Your capital is "+capital);
			break;
		case "England":capital="london";
			System.out.println("Your capital is "+capital);
			break;
		case "Pakistan":capital="Karachi";
			System.out.println("Your capital is "+capital);
			break;
		default : System.out.println("The capital for that country is not in database");
			}
		}}