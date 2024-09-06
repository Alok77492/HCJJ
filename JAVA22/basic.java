import java.util.Scanner;

class basic
{
	public static void main(String[] args)
	{
		//System.out.println("this is my first program");
		System.out.println("Enter the value of x:");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		System.out.println("Enter the value of y:");
		
		int y = sc.nextInt();
		int sum;
		sum=x/y;
		
		System.out.println("the value of x:" +sum);
		sc.close();
	}
}
