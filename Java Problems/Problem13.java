//Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;
public class Problem13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input width of rectangle : ");
        double width=sc.nextDouble();
        System.out.print("Input height of rectangle : ");
        double height=sc.nextDouble();
        sc.close();
        System.out.println("The area of rectangle is "+(width*height));
        System.out.println("The perimeter of rectangle is "+2*(width+height));
    
    } 
}