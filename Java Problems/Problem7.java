//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;
public class Problem7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the number : ");
        int a=sc.nextInt();
        sc.close();

        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" * "+i+" = "+(a*i));
        }      
    } 
}