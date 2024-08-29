import java.util.Scanner;
class count01bits0
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		String bitcount=getBitsCount(n);
		System.out.println(bitcount);
	}
	public static String getBitsCount(int n){
		int bit0=0;	int bit1=0;
		while(n>0){
			int bit=n%2;
			if(bit==1){
				bit1++;
			}
			else{
				bit0++;
			}
		n=n/2;
		}
	return "0 bits are: "+bit0+" 1 bits are: "+bit1;
	}	
}
