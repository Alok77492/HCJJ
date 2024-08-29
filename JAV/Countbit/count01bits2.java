import java.util.Scanner;
class Count01Bit2
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		getBitsCount(n);
	}
	public static void getBitsCount(int n){
		int bit0=0;	int bit1=0;
		while(n>0){
			int bit=n%2;
			if(bit==1)
			{
				bit1++;
			}
			else{
				bit0++;
			}
		n=n/2;
		}
		System.out.println("0 bits are: "+bit0);
		System.out.println("1 bits are: "+bit1);

	}	
}
