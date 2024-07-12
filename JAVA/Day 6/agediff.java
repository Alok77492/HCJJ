import java.util.Scanner;
class Agedifference
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st age: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd age: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd age: ");
		int c=sc.nextInt();
		int diff=getAgeDifference(a,b,c);
		System.out.println("The age diffrence of youngest and oldest is: "+diff);

		
	}
	public static int getAgeDifference(int age1, int age2, int age3)
	{
		int big=(age1>age2)?(age1>age3?age1:age3):(age2>age3?age2:age3);
		int small=(age1<age2)?(age1<age3?age1:age3):(age2<age3?age2:age3);
		int diff=big-small;
	return diff;	
	}


}