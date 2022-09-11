package countof_EvenOddNum;

public class example1 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5,6,7,8,9};
		int ctr_even= 0, ctr_odd=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				ctr_even++;
			}
			else
			{
				ctr_odd++;
			}
			
		}
			
			System.out.println("even Elements in Array "+ctr_even);
			System.out.println("Odd Elements in Array " +ctr_odd);
		
		
		
	}

}
