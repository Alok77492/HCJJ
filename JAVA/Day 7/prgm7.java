class Prgm7
{

    public static void main(String[] args)
	{
		System.out.println("main method of Program7 starts");
		int x=15;
		getSquare(x);
		System.out.println("Main method ends");
	}
	public static void getSquare(int x)
	{
		int square=x*x;
		System.out.println("Square of "+x+" is: "+square);
	}
}
