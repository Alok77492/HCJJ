import java.util.Scanner;

// Calculator class definition
class Calculator {
    // Variables to store operands and operator
    private int num1;
    private int num2;
    private char operator;

    // Method to input values from the user
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        scanner.close();
    }

    // Method to perform the calculation
    public double calculate() {
        double result = 0;
        switch (operator) {
            case '+':
                result = add();
                break;
            case '-':
                result = subtract();
                break;
            case '*':
                result = multiply();
                break;
            case '/':
                result = divide();
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        return result;
    }

    // Method to add two numbers
    private int add() {
        return num1 + num2;
    }

    // Method to subtract two numbers
    private int subtract() {
        return num1 - num2;
    }

    // Method to multiply two numbers
    private int multiply() {
        return num1 * num2;
    }

    // Method to divide two numbers
    private double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }

    // Method to display the result
    public void display(double result) {
        System.out.println("Result: " + result);
    }
}

// Main class to run the program
public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.input();
        double result = calc.calculate();
        calc.display(result);
    }
}
 
