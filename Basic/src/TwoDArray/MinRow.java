package TwoDArray;

import java.util.Scanner;

public class MinRow 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int row = 0;
		System.out.print("Enter the rows : ");
		row = sc.nextInt();
		int col = 0;
		System.out.print("Enter the cols : ");
		col = sc.nextInt();
		
		int[][] array = new int[row][col];
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Enter the "+i+ ""+ j+" value : ");
				array[i][j] = sc.nextInt();
			}
		}
		int i,j;
		int min;
		for(i=0; i<row; i++)
		{
			min=array[i][0];
			for(j=0; j<col; j++)
			{
				if(min>array[i][j])
					{
						min=array[i][j];
					}
			}	
			System.out.print(min+", ");
			
		}
		System.out.println("");
		
	}
}
