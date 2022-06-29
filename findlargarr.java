class findlargarr{
	public static void main (String args[]){
	int arr[]={1,3,7,2,5,6};
	int big=0,i;
	for (i=0;i<arr.length;i++){
		if (arr[big]<arr[i]){
			big=i;}
		}
	System.out.println(arr[big]);
	}
}