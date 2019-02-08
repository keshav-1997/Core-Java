import java.util.Scanner;
public class traingle 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=sc.nextInt();
		
	    int i,j,k,l;		
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
			    for(l=0; l<i; l++)
				{
			    	System.out.print("*");
				}
			   	System.out.println("");
		}	
	}
}