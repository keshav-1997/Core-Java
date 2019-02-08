package TwoDArray;
import java.util.Scanner;
public class TransposeMatrix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row of matrix");
		int row = sc.nextInt(); 
		System.out.println("Enter the col of matrix");
		int col = sc.nextInt(); 
		int i,j;
		
		System.out.println("Enter the elements of A matrix : ");
		int [][] a = new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("Enter the "+i+""+j+" element.   ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Entered matrix is : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Transpose of matrix is : ");
		int [][] b = new int[col][row];
		for(i=0;i<col;i++)
		{
			for(j=0;j<row;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
