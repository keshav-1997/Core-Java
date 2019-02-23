package Recursion;

public class Factorial 
{
	public static void main(String[] args)
	{
		Factorial factorial = new Factorial();
		int a = factorial.fact(5);
		System.out.println("factorial of nunber is : "+a);
	}
	
	int result;	
	int fact(int n)
		{	
			if(n==1)
				return 1;
			else
				result=n*fact(n-1);
				return result;
		}
}
