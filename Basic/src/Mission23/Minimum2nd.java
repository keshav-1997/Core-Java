package Mission23;
import java.util.Scanner;

public class Minimum2nd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("Enter the size of array : ");
		size=sc.nextInt();
		
		int[] n=new int[size];
		int i,j,k;
		for (i = 0; i <size; i++) 
		{
			System.out.print("Enter the number : ");
			n[i]=sc.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(n[i]>n[j])
				{
					k=n[i];
					n[i]=n[j];
					n[j]=k;
				}
			}
		}
		System.out.println("2nd Minimum number is : "+n[1]);
	}
}