class distance{
	int kms;
	int meters;
	void getdata(int k,int m){
	kms=k;
	meters=m;
	}
	void display(){
	System.out.println(kms);
	System.out.println(meters);
	}
}
public class prgm10{
	public static void main(String args[]){
	distance d1= new distance();
	distance d2= new distance();
	d1.getdata(10,700);
	d2.getdata(50,500);
	d1.display();
	d2.display();
}}