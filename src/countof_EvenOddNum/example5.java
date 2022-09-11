package countof_EvenOddNum;

public class example5 
{

	public static void main(String[] args)
	{
		int []a = {25,248,78,154,87,21,587,455,44};
		int even=0, odd=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("Even Elements in Array "+even);
		System.out.println("Odd Elements in Array "+odd);
		
	}
}
