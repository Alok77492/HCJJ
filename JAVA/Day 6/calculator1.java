
import java.util.Scanner;
class Calculator1
{
	public static void add(int a, int b)
	{
		System.out.println("This is add method");
		int sum=a+b;
		System.out.println(a+"+"+b+"= "+sum);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number: ");
		int num1=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int num2=sc.nextInt();
		add(num1, num2);
		System.out.println("=============");
		subtract(num1, num2);
		System.out.println("=============");
		multiply(num1, num2);
		System.out.println("=============");
		div(num1,num2);
		System.out.println("Main Ends!!");
	}

	public static void subtract(int a, int b)
	{
		System.out.println("This is subtract method");
		int diff=a-b;
		System.out.println(a+"-"+b+"= "+diff);
	}
	public static void multiply(int a, int b)
	{
		System.out.println("This is multiply method");
		int mul=a*b;
		System.out.println(a+"*"+b+"= "+mul);
	}
	public static void div(int a, int b)
	{
		System.out.println("This is divide method");
		int quot=a/b;
		System.out.println(a+"/"+b+"= "+quot);
	}



}


