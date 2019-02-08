package SwichCase;

import java.util.Scanner;

public class MathFunction 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char flag = 'Y';
		while(flag=='Y')
		{
			System.out.println("Enter 1 for Even/Odd number, 2 for number is Positive/Negative and 3 for exit.");	
			char st= sc.next().charAt(0);
			
			switch(st)
			{
			case '1':
				System.out.println("Enter a number.");
				int a = sc.nextInt();
				if(a%2==0)
				{
					System.out.println("Number is even");
				}
				else
				{
					System.out.println("Number is odd");
				}	
				break;
				
			
			case '2':
				System.out.println("Enter a number.");
				int b = sc.nextInt();
				if(b>=0)
				{
					System.out.println("Number is positive.");
				}
				else
				{
					System.out.println("Number is negative.");
				}	
				break;
			

			default:
				System.out.println("You enter a wrong value.");
				break;
			
			case '3':
				flag = '3';
				System.out.println("Thank you for using this system.");
					break;
			}
		}
	}

}
