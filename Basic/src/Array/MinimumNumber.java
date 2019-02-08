package Array;
import java.util.Scanner;

public class MinimumNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("Enter the size of array : ");
		size=sc.nextInt();
		
		int[] n=new int[size];
		int i;
		for (i = 0; i <size; i++) 
		{
			System.out.print("Enter the number : ");
			n[i]=sc.nextInt();
		}
		
		int min = n[0];
		for ( i = 1; i < n.length; i++) 
		{
			if(n[i]<min) 
			{
				min = n[i];
			}
		}
		System.out.println("Minimum value is :"+min);
	}
}