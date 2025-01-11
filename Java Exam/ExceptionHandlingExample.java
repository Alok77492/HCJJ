public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 1; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } finally {


try {
            @SuppressWarnings("unused")
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    } 
System.out.println("This block always executes.");
        }
    }