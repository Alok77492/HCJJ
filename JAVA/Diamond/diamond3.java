import java.util.Scanner;

class diamond3
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
		int s_star=1;	int e_star=n;	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
                if(j<=s_star||j>=e_star)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
			if(i<n/2+1){
				s_star++;
				e_star--;
			}
			else{
                s_star--;
				e_star++;  
			}
		System.out.println();
		}
	}	
}
