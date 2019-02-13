import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		
	//	boolean[] bool= new boolean[5];

	//	int len = array.length;

		for (int i = 0; i < size; i++) {
			array[i] = i;
		}

		for (int i = 0; i < size; i++) {
			if (array[i] %2==0)
			{
				System.out.println("True.");
			}
			else
			{
				System.out.println("False.");

			}
		}
		
		
				
	}

}
