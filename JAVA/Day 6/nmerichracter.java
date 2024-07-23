import java.util.Scanner;
class NumericCharacter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char k=sc.next().charAt(0);
		
		checkCharacter(k);
		sc.close();
	}
	public static void checkCharacter(char c)
	{
		String result=(c>=48 && c<=57)?"It is a Numeric Character" : "It is NOT a Numeric Character";
		System.out.println(result);
	}


}
