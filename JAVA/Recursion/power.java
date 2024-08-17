import java.util.Scanner;
class Power
{
	static int pow=1;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
        sc.close();
		calculatePower(a,b);	
		System.out.println(a+" to power "+b+" is: "+pow);
	}
	public static void calculatePower(int a, int b){
		
		if(b>0){
			pow=pow*a;
			calculatePower(a,b-1);
		}
	}	
}

