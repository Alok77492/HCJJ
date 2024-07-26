import java.util.Scanner;

class diamond1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
        sc.close();
		printDiamond(n);
	}
	public static void printDiamond(int n){
		int space=n/2;	int star=1;	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
					System.out.print("  ");
			for(int j=1;j<=star;j++){
					System.out.print("*   ");
			}
			if(i<n/2+1){
				space--;
				star++;
			}
			else{
				space++;
				star--;
			}
		System.out.println();
		}
	}	
}
