import java.util.Scanner;
class Smallest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int num2=sc.nextInt();
		System.out.println("Enter the 3rd Number: ");
		int num3=sc.nextInt();
		getSmallest(num1, num2, num3);
		sc.close();
	}
	public static void getSmallest(int a, int b, int c)
	{
		int x=a<b?a:b;
		int smallest=x<c?x:c;
		System.out.println("Smallest valus is: "+smallest);
	}


}
