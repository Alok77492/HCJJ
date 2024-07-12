class discount20
{
	public static void main(String[] args)
	{
		System.out.println("If you purchase items worth 5000 or above then You will get 20% discount");
		double total=5000;
		System.out.println("Total Price of items Purchased is: "+total);
		
		if(total>=5000)
		{
			total=total*0.8;
		}
		System.out.println("Total To be Paid is: "+total+" price");
		
	}		
}

