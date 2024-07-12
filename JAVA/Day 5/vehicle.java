class Vehicle
{
	public static void test()
	{
		System.out.println("This is test method of vehicle");
	}
	public static void main(String[] args)
	{
		System.out.println("main method of vehicle starts");
		test();
		Vehicle.test();
		System.out.println("Main method ends");
	}
}
