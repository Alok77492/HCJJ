import java.util.Scanner;
class Sum
{
	static int sum=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
        sc.close();
		calculateSum(n);	
		System.out.println("Sum of "+n+" naturals numbers is: "+sum);
	}
	public static void calculateSum(int n){
		
		if(n>0){
			sum=sum+n;
			calculateSum(n-1);
		}
	}	
}
