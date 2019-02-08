import java.util.Scanner;

public class practic 
{
	public static void main(String[] args)
	{
	Scanner in= new Scanner(System.in);
	int[] arr = new int[5];
	int i,j;
	for(i=0;i<5;i++)
	{
		arr[i]=in.nextInt();
	}
	
	int total=arr[0]; 
	int min=arr[0]; 
	int max=arr[0];
    for (i=1; i<arr.length; i++) 
    {
        total = total+arr[i];
        if (min>arr[i]) {
            min=arr[i];
        }
        if (max<arr[i]) {
            max=arr[i];
        }
    }
	System.out.println("" + (total-max) + " " + (total-min));
	}
}
