import java.util.Scanner;

public class loop 
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
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
