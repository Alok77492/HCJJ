//Write a Java program to add two binary numbers.

import java.util.Scanner;
public class Problem17
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first binary number : ");
       int num1 = sc.nextInt();
       System.out.print("Enter the second binary number : ");
       int num2 = sc.nextInt();
       sc.close();
       String str;
       int sum2=0;
       if(num1!=0&&num2!=0)
       {
        int rem3=0;
        int rem1 = num1%10;
        int rem2 = num2%10;
        int sum1=rem1+rem2+rem3;
        if(sum1==2)
        {
            sum1=10;
            rem3=sum1/10;
            sum1=sum1%10;
        }
        sum2=sum2+sum1;
        
       }
       str=Integer.toString(sum2);
        System.out.println(str);
       //String str1=Integer.toString(num1);
       //String str2=Integer.toString(num2);
       //System.out.println(str1+str2);
    }
}