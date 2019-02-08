package TwoDArray;
import java.util.Scanner;
public class SumOfMatrix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of matrix");
		int n = sc.nextInt(); 
		int i,j;
		
		System.out.println("Enter the elements of A matrix : ");
		int [][] a = new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter the "+i+""+j+" element.   ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of B matrix : ");
		int [][] b = new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter the "+i+""+j+" element.   ");
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Addition of A and B Matrix is : ");
		int [][] c = new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(+c[i][j]+" ");
			}
			System.out.println("");
		}
	}
}