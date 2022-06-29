public class testls {
	public static int ls(int a[],int key){
	int i;
	int len=a.length;
	for(i=0;i<=len;i++){
		if ( a[i]==key)
			return i+1;
	}
	return -1;
}
	public static void main(String args[]){
	int abc[]={2,3,4,5,6,7};
	int key=3;
	if ( ls(abc,key)==-1)
		System.out.println("Key not present in list"+key);
	else
		System.out.println("Key "+key+" is present at "+ls(abc,key));
	
		
	}
}