class leapyear
{
	public static void main(String[] args)
	{
		int year=2000;
		System.out.println("The year is: "+year);
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("It is a leap Year");
			}
			else
			{
				System.out.println("It is NOT a leap Year");
			}
		}
		else
		{
			if(year%4==0)
			{
				System.out.println("It is a leap Year");
			}
			else
			{
				System.out.println("It is NOT a leap Year");
			}
		}		
	}		
}


