import java.util.Scanner;
class DigitSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int sum=getDigitSum(n);
		System.out.println("Total digit Sum: "+sum);
	}
	public static int getDigitSum(int n)
	{
		int digit1=n%10;
		n=n/10;
		int digit2=n%10;
		n=n/10;
	return digit1+digit2+n;
	}
}
