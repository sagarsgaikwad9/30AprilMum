package countof_EvenOddNum;

public class example6 
{
	public static void main(String[] args) 
	{
		int []a = {2,1,5,89,2,8,6,7,91,4};
		int even=0;
		int odd=0;
		
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
