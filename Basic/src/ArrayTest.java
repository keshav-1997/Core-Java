
public class ArrayTest {

	public static void main(String[] args) {

		int[] array = new int[10];
		
	//	boolean[] bool= new boolean[5];

		int len = array.length;

		for (int i = 0; i < len; i++) {
			array[i] = i;
		}

		for (int i = 0; i < len; i++) {
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
