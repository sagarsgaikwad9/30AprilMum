package Display_EvenBetween_1_100;

public class example2 
{
	public static void main(String[] args) 
	{
		int num = 50;
		System.out.println("List of Even Number from 1 to "+ num+":");
		
		for(int i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
