package Array;

import java.util.Scanner;

public class PrintScanValue 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.println("enter the size");
		size=sc.nextInt();
		
		int[] numarray=new int[size];
		
		for (int i = 0; i <size; i++) 
		{
			System.out.println("enter the number");
			numarray[i]=sc.nextInt();
		}
		
		for (int i = 0; i < numarray.length; i++) 
		{
			System.out.println(numarray[i]);
		}
	}
}