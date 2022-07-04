import java.util.Scanner;
class addmatrice{
	public static void main (String args[]){
	Scanner s=new Scanner(System.in);
	int i,j;
	System.out.println("Enter number of rows: ");
	int a=s.nextInt();
	System.out.println("Enter number of columns: ");
	int b=s.nextInt();
	int mat1[][]=new int[a][b];
	int mat2[][]=new int[a][b];
	int ans[][]=new int[a][b];
	for (i=0;i<a;i++){
		for (j=0;j<b;j++){
			int m=i+1;
			int n=j+1;
			System.out.println("Enter element for 1st Matrix row "+m+" column "+n);
			int an=s.nextInt();
			mat1[i][j]=an;
			}
		}
	for (i=0;i<a;i++){
		for (j=0;j<b;j++){
			int m=i+1;
			int n=j+1;
			System.out.println("Enter element for 2nd Matrix row "+m+" column "+n);
			int an=s.nextInt();
			mat2[i][j]=an;
			}
		}
	System.out.println("First Matrix");
	for (i=0;i<a;i++){
		for (j=0;j<b;j++){
			System.out.print(mat1[i][j]+" ");
			}
		System.out.println("");
		}
	
	System.out.println("Second Matrix");
	for (i=0;i<a;i++){
		for (j=0;j<b;j++){
			System.out.print(mat2[i][j]+" ");
			}
		System.out.println("");
		}
	System.out.println("The answer matrix is");
	for (i=0;i<a;i++){
		for (j=0;j<b;j++){
			ans[i][j]=mat1[i][j]+mat2[i][j];
			System.out.print(ans[i][j]+" ");
			}
		System.out.println("");
		}
	
	}
}