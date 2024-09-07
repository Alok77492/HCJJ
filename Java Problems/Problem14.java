//Write a Java program to print an American flag on the screen.


public class Problem14
{
    public static void main(String args[])
    {
       for(int i=1;i<=18;i++)
       {
        for(int j=1;j<=46;j++)
            {
                if(i<=9&&i%2==0)
                System.out.print("  *");
                if(i<=9&&i%2!=0){
                    System.out.print("*  ");
                }           
                if(j>5)
                {
                    for(j=6;j<=49;j++)
                    {
                        System.out.print("=");
                        if(i>9)
                        {
                            for(j=6;j<=66;j++)
                            {
                            System.out.print("=");
                            }
                        }
                    }
                }
            }
            System.out.println("");
        }
    }
}