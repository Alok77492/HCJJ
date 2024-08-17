import java.util.Scanner;
class Reverse
{
	static int rev=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
        sc.close();
		calculateReverse(n);	
		System.out.println("Reverse of "+n+" is: "+rev);
	}
	public static void calculateReverse(int n){
		
		if(n>0){
			rev=10*rev+n%10;
			calculateReverse(n/10);
		}
	}	
}
