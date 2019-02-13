package Mission23;
import java.util.Scanner;

public class MaxIn4Number 
{
	{
		Scanner sc = new Scanner(System.in);
		
		int[] n=new int[4];
		int i,j,k;
		for (i = 0; i <4; i++) 
		{
			System.out.print("Enter the "+i+" number : ");
			n[i]=sc.nextInt();
		}
		
		for(i=0;i<4;i++)
		{
			for(j=i+1;j<4;j++)
			{
				if(n[i]>n[j])
				{
					k=n[i];
					n[i]=n[j];
					n[j]=k;
				}
			}
		}
		System.out.print(n[i-1]);
	}
}