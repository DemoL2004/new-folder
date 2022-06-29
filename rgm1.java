class student{
	int rollno;
	int sem;
	String name;
	void getdata(int r, int s, String n){
		rollno=r;
		sem=s;
		name=n;
	}
	void display(){
	System.out.println("Roll no: "+ rollno);
	System.out.println("Sem is: "+sem);
	System.out.println("Name: "+name);
	}
}
public class rgm1{
	public static void main(String args[]){
	student s1= new student();
	student s2= new student();
	s1.getdata(1,2,"Anurag");
	s2.getdata(5,4,"Harsha");
	s1.display();
	s2.display();
	}
}