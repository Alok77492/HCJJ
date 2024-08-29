import java.util.Scanner;
class pyramid9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
        sc.close();
		printPyramid(n);
	}
	public static void printPyramid(int n){
		int space=0;	int star=2*n-1;	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
					System.out.print("  ");
			for(int j=1;j<=star;j++){
					System.out.print("* ");
			}
		space++;
		star-=2;
		System.out.println();
		}
	}	
}
