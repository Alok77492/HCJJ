import java.util.Scanner;
class pyramid10
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
		int star=1;	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++){
					System.out.print("* ");
			}
		if(i<n/2+1)
			star++;
		else
			star--;
		System.out.println();
		}
	}	
}
