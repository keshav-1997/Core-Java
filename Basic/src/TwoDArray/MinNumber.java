package TwoDArray;
import java.util.Scanner;
public class MinNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int row = 0;
		System.out.println("Enter the rows");
		row = sc.nextInt();
		int col = 0;
		System.out.println("Enter the cols");
		col = sc.nextInt();
		
		int[][] array = new int[row][col];
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the "+i+ ""+ j+" value");
				array[i][j] = sc.nextInt();
			}
		}
		int min =array[0][0];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(min>array[i][j])
				{
					min=array[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
