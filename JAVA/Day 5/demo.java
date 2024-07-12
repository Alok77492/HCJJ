class demo
{
	public static void test()
	{
		System.out.println("This is test method");
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
		demo();
		test();
		demo();
		System.out.println("Main method ends");
	}

	public static void demo()
	{
		System.out.println("This is demo method");
	}
}
