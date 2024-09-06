//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;
public class Problem6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first number : ");
        int a=sc.nextInt();
        System.out.print("Input second number : ");
        int b=sc.nextInt();
        sc.close();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" mod "+b+" = "+(a%b));
    } 
}