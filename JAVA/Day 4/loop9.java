//divided by 4 or ends with 4
class loop9
{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=100)
		{
			if(i%4==0 || i%10==4)
				System.out.print(i+" ");
		i++;	
		}
	}		
}
