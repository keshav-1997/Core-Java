package Array;
import java.util.Scanner;

public class MaximumNumber 
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
		
		int max = n[0];
		for ( i = 1; i < n.length; i++) 
		{
			if(n[i]>max) 
			{
				max = n[i];
			}
		}
		System.out.println("Maximum value is : "+max);
	}
}