package Mission23;
import java.util.Scanner;

public class AverageNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size;
		float sum=0;
		float avg;
		System.out.println("Enter the size of array : ");
		size=sc.nextInt();
		
		int[] n=new int[size];
		int i;
		for (i = 0; i <size; i++) 
		{
			System.out.println("Enter the number : ");
			n[i]=sc.nextInt();
		}
		for ( i = 0; i < n.length; i++) 
		{
			sum=sum+n[i];
		}
		avg=sum/size;
		System.out.println(avg);
	}
}