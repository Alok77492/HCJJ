//print and count all numbers upto 100 which are divided by 7 and also ends with 7
class loop10
{
	public static void main(String[] args)
	{
		int i=1;
		int count=0;
		while(i<=600)
		{
			if(i%7==0 && i%10==7){
				System.out.print(i+" ");
				count++;
			}
		i++;	
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}		
}

