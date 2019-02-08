package MathematicalFunction;
import java.util.Scanner;

public class FabonacciSeries 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("Enter the number : ");
		size = sc.nextInt();

		int t1=0,t2=1;
		
		System.out.println(t1);
		System.out.println(t2);
		
		for(int a=0; a<(size-2); a++)
		{
			t1=t1+t2;
			System.out.println(t1);	
			t1=t1+t2;
			t2=t1-t2;
			t1=t1-t2;
		}
	}
}
