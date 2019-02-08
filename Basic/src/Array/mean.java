package Array;
import java.util.Scanner;
public class mean 
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
	
		for ( i = 0; i < (n.length/2); i++) 
		{
			
		}
		System.out.println("Maximum value is : "+n[i]);
	}
}