class discount40
{
	public static void main(String[] args)
	{
		System.out.println("40% discount if total is more than equals to 10000");
		System.out.println("15% discount if total is less than 10000");
		double total=20000;
		System.out.println("Total amount Purchased is: "+total);
		
		if(total>=10000)
		{
			total=total*0.6;
		}
		else
		{
			total=total*0.85;
		}
		System.out.println("Total To be Paid is: "+total+" price");
		
	}		
}
