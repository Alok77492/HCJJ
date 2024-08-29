class Animal
{
	public void run()
	{
		System.out.println("This is run method of Animal");
	}
	public static void main(String[] args)
	{
		System.out.println("main method of Animal starts");
		Animal a1=new Animal();
		a1.run();
		System.out.println("Main method ends");
	}
}
