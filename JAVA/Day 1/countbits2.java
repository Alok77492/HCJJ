class CountBits2
{
	public static void main(String[] args)
	{
		int n=100;
		int bitcount=getBitsCount(n);
		System.out.println("Total Bits in "+n+" are: "+bitcount);
	}
	public static int getBitsCount(int n)
	{
		int count=0;
		while(n>0){
			count++;
		n=n/2;
		}
	return count;
	}	
}
