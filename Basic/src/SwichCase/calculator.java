package SwichCase;
import java.util.Scanner;

public class calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char flag = 't';
		while(flag=='t')
		{
			System.out.println("Enter + for Addition, - for Subtraction, * for Multiplication, / for Division or % for Modulus of number.");
			
			
			char st= sc.next().charAt(0);
		
			switch(st)
			{
			case '+':
				System.out.println("Enter 1st number.");
				int a = sc.nextInt();
				System.out.println("Enter 2nd number.");
				int b = sc.nextInt();
				System.out.println("Addition of numbers are : "+(a+b));
				break;
				
			
			case '-':
				System.out.println("Enter 1st number.");
				int c = sc.nextInt();
				System.out.println("Enter 2nd number.");
				int d = sc.nextInt();
				System.out.println("Subtraction of numbers are : "+(c-d));
				break;
			
			case '*':
				System.out.println("Enter 1st number.");
				int e = sc.nextInt();
				System.out.println("Enter 2nd number.");
				int f = sc.nextInt();
				System.out.println("Multiplicaion of numbers are : "+(e*f));
				break;
			
			case '/':
				System.out.println("Enter 1st number.");
				float g = sc.nextInt();
				System.out.println("Enter 2nd number.");
				float h = sc.nextInt();
				System.out.println("Division of numbers are : "+(g/h));
				break;
			
			case '%':
				System.out.println("Enter 1st number.");
				int i = sc.nextInt();
				System.out.println("Enter 2nd number.");
				int j = sc.nextInt();
				System.out.println("Modulus of numbers are : "+(i%j));
				break;
			
			case 'f':
				flag = 'f';
				System.out.println("Thank you for using my calculator.");
				break;
			default:
				System.out.println("You enter a wrong value.");
				break;
			
			}
		}
	}
}
