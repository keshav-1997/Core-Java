package MathematicalFunction;

public class Max4 
{
	public static void main (String args[])
	{
		int a=14;
		int b=7;
		int c=6;
		int d=20;
		if((a>b)&&(a>c)&&(a>d))
		{
			System.out.println("A is the largest Number.");
		}
		else if((b>c)&&(b>d))
		{
			System.out.println("B is the largest Number.");
		}
		else if(c>d)
		{
			System.out.println("C is the largest Number.");
		}
		else
		{
			System.out.println("D is the largest Number.");
		}
	}

}
