
import java.util.Scanner;
class Calculator4
{
	public static int add()
	{
		System.out.println("This is add method");
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int sum=a+b;
	return sum;
	
	}

	public static void main(String[] args)
	{
		System.out.println("main Starts");
		int sum=add();
		System.out.println("Sum is:"+sum);
		System.out.println("=============");
		int sub=subtract();
		System.out.println("Difference is:"+sub);
		System.out.println("=============");
		int mul=multiply();
		System.out.println("Product is:"+mul);
		System.out.println("=============");
		int qu=div();
		System.out.println("Quotient is:"+qu);
		System.out.println("Main Ends!!");
	}

	public static int subtract()
	{
		System.out.println("This is subtract method");
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int diff=a-b;
	return diff;
	}
	public static int multiply()
	{
		System.out.println("This is multiply method");
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int mul=a*b;
	return mul;
	}
	public static int div()
	{
		System.out.println("This is divide method");
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int quot=a/b;
	return quot;
	}



}

