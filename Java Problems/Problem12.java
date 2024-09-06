//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;
public class Problem12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the 1st number : ");
        double a=sc.nextDouble();
        System.out.print("Input the 2nd number : ");
        double b=sc.nextDouble();
        System.out.print("Input the 3rd number : ");
        double c=sc.nextDouble();
        sc.close();
        System.out.println("The average of the numbers is "+(a+b+c)/3);
    
    } 
}