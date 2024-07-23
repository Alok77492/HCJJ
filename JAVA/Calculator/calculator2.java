
import java.util.Scanner;
class Calculator2
{
	public static void add()
	{
		System.out.println("This is add method");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println(a+"+"+b+"= "+sum);
		sc.close();
	}

	public static void main(String[] args)
	{
		System.out.println("main Starts");
		add();
		System.out.println("=============");
		subtract();
		System.out.println("=============");
		multiply();
		System.out.println("=============");
		div();
		System.out.println("Main Ends!!");
	}

	public static void subtract()
	{
		System.out.println("This is subtract method");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int diff=a-b;
		System.out.println(a+"-"+b+"= "+diff);
		sc.close();
	}
	public static void multiply()
	{
		System.out.println("This is multiply method");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int mul=a*b;
		System.out.println(a+"*"+b+"= "+mul);
		sc.close();
	}
	public static void div()
	{
		System.out.println("This is divide method");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number: ");
		int b=sc.nextInt();
		int quot=a/b;
		System.out.println(a+"/"+b+"= "+quot);
		sc.close();
	}



}


