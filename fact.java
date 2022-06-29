import java.util.Scanner;
class fac{
	int j=1,n=0;
	void facto(int s){
		for(n=s;n>0;n=n-1){
		j=j*n;
		}
		System.out.println(j);}
}
public class fact{
	public static void main(String args[]){
	Scanner s1= new Scanner(System.in);
	fac f=new fac();
	System.out.println("Enter the number: ");
	int a=s1.nextInt();
	f.facto(a);
	
	
	}
}