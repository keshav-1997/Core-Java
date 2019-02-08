package SwichCase;
import java.util.Scanner;

public class Area 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char flag = 'Y';
		while(flag=='Y')
		{
			System.out.println("Enter 1 for Circle, 2 for Triangle, 3 for Rectangle, 4 for Square or 5 for exit.");	
			char st= sc.next().charAt(0);
			
			switch(st)
			{
			case '1':
				System.out.println("Enter a radius of circle.");
				float r = sc.nextFloat();
				System.out.println("Area of circle is : "+((22/7)*r*r));
				break;
			
			case '2':
				System.out.println("Enter a height.");
				float h = sc.nextFloat();
				System.out.println("Enter a base.");
				float b = sc.nextFloat();
				System.out.println("Area of Triangle : "+(0.5*b*h));
				break;
				
			case '3':
				System.out.println("Enter a length.");
				int x = sc.nextInt();
				System.out.println("Enter a breath.");
				int y = sc.nextInt();
				System.out.println("Area of rectangle : "+(x*y));
				break;
	
			case '4':
				System.out.println("Enter a length.");
				int a = sc.nextInt();
				System.out.println("Area of square : "+(a*a));
				break;
				
			default:
				System.out.println("You enter a wrong value.");
				break;
			
			case '5':
				flag = '5';
				System.out.println("Thank you for using this system.");
					break;
			}
		}
	}

}