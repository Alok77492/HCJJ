import java.util.Scanner;
class CountBits3
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int bitcount=getBitsCount(n);
		System.out.println("Total Bits in "+n+" are: "+bitcount);
	}
	public static int getBitsCount(int n){
		int count=0;
		while(n>0)
		{
			count++;
		n=n/2;
		}
	return count;
	}	
}
