import java.util.Scanner;
class Student{
	int Rollno;
	String Name;
	int Sem;
	int Total_Marks;
	
	Student(){
	Rollno=0;
	Name="Null";
	Sem=0;
	Total_Marks=0;}
	
	Student(int a,String b,int c,int d){
	Rollno=a;
	Name=b;
	Sem=c;
	Total_Marks=d;}
	
	void display(){
	System.out.println("rollno is "+Rollno);
	System.out.println("Name is "+Name);
	System.out.println("Sem is "+Sem);
	System.out.println("Total_Marks is "+Total_Marks);}

	void getData(){
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Name");
	String f1=s1.nextLine();
	System.out.println("Enter Rollno");
	int f2=s1.nextInt();
	System.out.println("Enter Sem");
	int f3=s1.nextInt();
	System.out.println("Enter Total Marks");
	int f4=s1.nextInt();	
	Rollno=f2;
	Name=f1;
	Sem=f3;
	Total_Marks=f4;}
}
public class pppp{
	public static void main (String args[]){
		Student s1=new Student();
		Student s2=new Student(01,"Ananth",04,100);
		Student s3=new Student();
		s3.getData();
		s1.display();
		s2.display();
		s3.display();}
}
