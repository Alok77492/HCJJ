
class discount3
{
	public static void main(String[] args)
	{
		System.out.println("40% discount if total >=10000");
		System.out.println("30% discount if total is between 7000-9999");
		System.out.println("20% discount if total is between 4000-6999");
		System.out.println("8% discount if total is < 4000");
		System.out.println("=================================");
		double total=1200;
		System.out.println("Total amount Purchased is: "+total);
		
		if(total>=10000)
		{
			System.out.println("You got discount of 40%");
			total=total*0.6;
		}
		else if(total>=7000)
		{
			System.out.println("You got discount of 30%");
			total=total*0.70;
		}
		else if(total>=4000)
		{
			System.out.println("You got discount of 20%");
			total=total*0.80;
		}
		else
		{
			System.out.println("You got discount of 8%");
			total=total*0.92;
		}
		System.out.println("Total To be Paid is: "+total+" price");
		
	}		
}
