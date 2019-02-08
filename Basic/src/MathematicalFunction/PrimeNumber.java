package MathematicalFunction;

public class PrimeNumber 
{
	public static void main (String args[])
	{
	int n=113;
	int i;
	for(i=2;i<(n-1); i++)
		{
			if(n%i==0)
			{
				System.out.print("Number is not prime.");
				break;
			}
			else
			{
				System.out.print("Number is prime.");	
				break;
			}
		}
	}
}
