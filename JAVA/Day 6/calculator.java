
class Calculator
{
	public static void add()
	{
		System.out.println("This is add method");
		int a=30;
		int b=40;
		int sum=a+b;
		System.out.println(a+"+"+b+"= "+sum);
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
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
		int a=90;
		int b=40;
		int diff=a-b;
		System.out.println(a+"-"+b+"= "+diff);
	}
	public static void multiply()
	{
		System.out.println("This is multiply method");
		int a=90;
		int b=40;
		int mul=a*b;
		System.out.println(a+"*"+b+"= "+mul);
	}
	public static void div()
	{
		System.out.println("This is divide method");
		int a=90;
		int b=40;
		int quot=a/b;
		System.out.println(a+"/"+b+"= "+quot);
	}



}


