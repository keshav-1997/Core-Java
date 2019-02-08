import java.util.Scanner;
public class triangle1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=sc.nextInt();
		
		    int i,j,k;		
		    for(i=0; i<n; i++)
			{
				    for(j=(n-i-1); j>0; j--)
				    {
				    	System.out.print(" ");
				    }
				    for(k=(i+1); k>0; k--)
					{
				    	System.out.print("*");
					}
				   	System.out.println("");
			}	
			for(i=(n-1); i>0; i--)
			{
				 for(k=(n-i); k>0; k--)
					{
				    	System.out.print(" ");
					}    
				for(j=0; j<i; j++)
				    {
				    	System.out.print("*");
				    }
				   	System.out.println("");
			}	
	}
}