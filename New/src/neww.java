import java.util.Scanner;
class Person{
		String name;
		int aadhar;
		
		void setdata(){
			Scanner n=new Scanner(System.in);
			System.out.println("enter Name");
			String b=n.nextLine();
			System.out.println("enter aadhar");
			int a=n.nextInt();

			aadhar=a;
			name=b;
		}}
class Student extends Person{
		int sem;
		int rollno;
		
		void setdatas(){
			Scanner n=new Scanner(System.in);
			System.out.println("Enter sem");
			int c=n.nextInt();
			System.out.println("Enter rollno");
			int d=n.nextInt();
			sem=c;
			rollno=d;
			
			
		}
}
class Result extends Student{
		int tm;
		Scanner n=new Scanner(System.in);
		void settm(){
			System.out.println("Enter total marks");
			int t=n.nextInt();
			tm=t;}
		void display(){
			System.out.println( "NAME ="+name);
			System.out.println("AADHAR ="+aadhar);
			System.out.println("SEM ="+sem);
			System.out.println("ROLLNO ="+rollno);
			System.out.println("TOTAL MARKS ="+tm);
		}
		}
class neww{
	public static void main(String args[]){
		Result r1=new Result();
		r1.setdata();
		r1.setdatas();
		r1.settm();
		r1.display();
	}
}
