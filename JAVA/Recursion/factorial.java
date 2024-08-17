import java.util.Scanner;
class Factorial
{
	static int fact=1;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		calculateFactorial(n);	
		System.out.println(n+"!= "+fact);
        sc.close();
	}
	public static void calculateFactorial(int n){
		
		if(n>0){
			fact=fact*n;
			calculateFactorial(n-1);
		}
	}	
}
