
 
public class PowerCalculator {

    // Method to calculate X raised to the power Y
    public static int power(int base, int exponent) {
        int result = 1; // Initialize result to 1

        // Loop to calculate power
        for (int i = 0; i < exponent; i++) {
            result *= base; // Multiply result by base for each exponent
        } 

        return result; // Return the result
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        
        // Calculate base^exponent
        int result = power(base, exponent);
        
        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
