import java.util.Scanner;
class Discount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price: ");
		double price=sc.nextDouble();
		System.out.println("Enter the % discount: ");
		double perdisc=sc.nextDouble();

		double actual_price=getDiscountedPrice(price, perdisc);
		System.out.println("Price after discount is: "+actual_price);
		sc.close();
	}
	public static double getDiscountedPrice(double price, double perdis)
	{
	return (price*(100-perdis))/100;
	}
}
