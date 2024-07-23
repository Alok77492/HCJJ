
class drive1
{
	public static void stop()
	{
		System.out.println("This is stop method");
		System.out.println("stop method Ends!!");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method of drive");
		start();
		System.out.println("========*************===========");
		Animal.main(null);
		System.out.println("========*************===========");
		System.out.println("=====Main method ends====");
		
	}
	public static void start()
	{
		System.out.println("This is start method");
		drive();
		System.out.println("start method Ends!!");
	}
	public static void drive()
	{
		System.out.println("This is drive method");
		stop();
		System.out.println("drive method Ends!!");
	}
}
