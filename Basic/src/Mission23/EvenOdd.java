package Mission23;
import java.util.Scanner;

public class EvenOdd 
{
	public static void main (String args[])
	{
		System.out.println("Enter any number");
		Scanner d= new Scanner(System.in);
		
		int n=d.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Number is even.");
		}
		else
		{
			System.out.println("Number is odd.");
		}
	}
}
