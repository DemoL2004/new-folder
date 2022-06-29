import java.lang.Math;
public class bitode{
	public static void main (String args[]){
	int arr[]={1,1,1,1,1,1,1,1,1,1,1};
	int bi=0;
	int aa,i;
	int c=0;
	for (i=arr.length-1;i>0;i--){
		aa=arr[c]*(int)Math.pow(2,i);
		c++;
		bi=bi+aa;	
	}
	System.out.println(bi);}}