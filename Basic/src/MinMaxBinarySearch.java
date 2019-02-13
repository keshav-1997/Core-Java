import java.util.Scanner;

public class MinMaxBinarySearch 
{
	static public void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] array=new int[size];
		
		for(int n=0; n<size; n++)
		{
			array[n]=n;
		}
		
		for(int n=0; n<size; n++)
		{
			System.out.println("Enter the "+n+" element");
			array[n]=sc.nextInt();
		}
		
		if(size==1)
		{
			System.out.println("Minimum is "+array[0]);
			System.out.println("Maximum is"+array[0]);
		}
		else if(size==2)
		{
			if(array[0]<array[1])
			{
				System.out.println("Minimum is "+array[0]);
				System.out.println("Maximum is "+array[1]);
			}
			else
			{
				System.out.println("Minimum is "+array[1]);
				System.out.println("Maximum is "+array[0]);
			}
		}
		
	}

}
