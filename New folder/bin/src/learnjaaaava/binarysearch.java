package learnjaaaava;
import java.util.Scanner;
public class binarysearch {
			public static int bs(int a[],int h,int l,int key){
				int mid;
				if (h>=l){
					mid=(h+l)/2;
					if (key>a[mid])
						return bs(a, h ,  mid+1,key);
					else if (key<a[mid])
						return bs( a, mid-1 ,l,key);
					else if (a[mid]==key)
						return mid+1;
					else
						return -1;
				}return -2;
				
			}
			public static void main(String args[]){
				Scanner ss=new Scanner(System.in);
				int i=0;
				int arr[]={ };
				
				while (1!=0){
				System.out.println("Enter elements for array");
				int a=ss.nextInt();
				if (a==101010){
					break;
				}
				arr[i]=a;
				i=i+1;
				}
				System.out.println("Enter element to search for");
				int key=ss.nextInt();

				int h=arr.length;
				int l=0;
				if (bs(arr,h,l,key)==-1)
					System.out.println("key not in list");
				else
					System.out.println(bs(arr,h,l,key));
			}
}
