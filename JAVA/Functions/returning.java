public class returning 
{
	public static void main(String[] args) {
		System.out.println("main method starts");
		int a = 50;
		int b = 120;
		int result = getSum(a, b);
		System.out.println("Sum from main method is: " + result);
	}

	public static int getSum(int x, int y) {
		System.out.println("This is sum method");
		System.out.println(x + "   " + y);
		int sum = x + y;
		System.out.println("SUm from getSum is: " + sum);
		return sum;
	}
}
