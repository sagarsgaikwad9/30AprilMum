package countof_EvenOddNum;

public class example3 
{
	public static void main(String[] args)
	{
		int a[] = {45,1,57,368,545,7,57,5,2,1,9,7,3,1,5};
		int even= 0;
		int odd= 0;
		
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
		
		System.out.println("Even Elements in Array: "+even);
		System.out.println("Odd Elements in Array: "+odd);
		
	}

}
