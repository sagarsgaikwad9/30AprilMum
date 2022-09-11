package countof_EvenOddNum;

public class example4 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6,7,8};
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
