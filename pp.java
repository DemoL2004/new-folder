import java.util.Scanner;
class Pointer{
	double x;
	double y;
	
	Pointer(){
	x=0;
	y=0;
		}
	Pointer(int s,int s10){
	x=s;
	y=s10;}
	
	void getData(){
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter X");
	int a=s1.nextInt();
	System.out.println("Enter Y");
	int b=s1.nextInt();
	x=a;
	y=b;}
	
	void n(){
	return x,y;}
	void distance(n){
		System.out.println(n);}
}	
public class pp{
	public static void main (String args[]){
		Pointer n1=new Pointer();
		Pointer n2=new Pointer();
		n1.getData();
		n1.distance(nn(n2));
		}
}