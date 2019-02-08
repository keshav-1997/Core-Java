package SwichCase;

public class FindDays extends calculator 
{
	public static void main(String[] args) 
	{
		int day=4;
		switch(day)
		{
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tueday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thrusday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		case 7:
			System.out.print("Sunday");
			break;
		default:
			System.out.print("Error");
			break;
		}
	}
}