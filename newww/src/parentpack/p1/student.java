package parentpack.p1;

public class student {
	int rollno;
	String name;
	public student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		
	}
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}

}
