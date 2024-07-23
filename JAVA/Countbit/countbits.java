class countbits
{
	public static void main(String[] args)
	{
		int n=43;
		int count=0;
		while(n>0){
			count++;
		n=n/2;
		}
		System.out.println("Total Bits are: "+count);
	}	
}