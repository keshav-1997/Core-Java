package MathematicalFunction;

import java.util.Scanner;

public class EnterPrimeNumber 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number : " );
		n = sc.nextInt();
		
		for(int a=2; a<n; a++)
		{
			if(n%a!=0)
			{
				System.out.println("Number is prime.");
				break;
			}
			else
			{
				System.out.println("Number is not prime.");
				break;
			}
		}
	}
}
