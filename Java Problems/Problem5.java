//Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.Scanner;
public class Problem5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        sc.close();
        System.out.println("The product of "+a+" and "+b+" is "+a*b);
    } 
}