package countof_EvenOddNum;

public class example2 
{
	public static void main(String[] args) 
	{
		int a[] = {1,5,8,4,6,2,7,9,10,45,12,78,45};
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
