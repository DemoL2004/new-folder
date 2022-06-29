import java.util.Scanner;
class distance{
	int Kilometers;
	int Meters;
	
	distance(){
	Kilometers=10;
	Meters=100;}
	
	distance(int k, int m){
	Kilometers=k;
	Meters=m;}
	
	void getData(){
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter km");
	int a=s1.nextInt();
	System.out.println("Enter m");
	int b=s1.nextInt();
	Kilometers=a;
	Meters=b;}
	
	void display(){
	System.out.println("The kilometer is "+Kilometers);
	System.out.println("The Meter is "+Meters);}
	
	void setData(int f1, int f2){
	Kilometers=f1;
	Meters=f2;}}
public class ppp{
	public static void main (String args[]){
		distance d1=new distance();
		distance d2=new distance();
		distance d3=new distance(25,60);
		distance d4=new distance();
		d1.getData();
		d1.display();
		d2.display();
		d3.display();
		d4.setData(30,30);
		d4.display();  
	}}