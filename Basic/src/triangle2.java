import java.util.Scanner;

public class triangle2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=sc.nextInt();
		    int i,k,l,m;		
		    for(i=0; i<n; i++)
			{
		    	for(l=0; l<(i+1); l++)
			    {
			    	System.out.print("*");
			    }
		    	for(m=0; m<(2*(n-i)-1); m++)
		    	{
		    		System.out.print(" ");
				}
			    for(k=(i+1); k>0;k--)
				{
			    	System.out.print("*");
				}  
			   	System.out.println("");
			}	
		    for(int z=0; z<(2*n+1); z++)
		    {
		    	System.out.print("*");
		    }
			System.out.println("");
		    for(i=0; i<n; i++)
			{
		    	  for(k=(n-i); k>0;k--)
					{
				    	System.out.print("*");
					}  
		    	  for(m=0; m<(2*(i+1)-1); m++)
			    	{
			    		System.out.print(" ");
					}
		   	  for(l=0; l<(n-i); l++)
		   	  {
		   		  System.out.print("*");
		   	  }
		   	System.out.println("");
			}	
	}
}
