// program to illustrate return value of type boolean

//needed in order to use the Scanner class
import java.util.Scanner;

public class pgm5_08booleanreturn {

	public static void main(String[] args) {
		//variable declarations
		int x = 4, y = 0, z = 1;
		boolean cond;
		
		cond = y + z >= x;
		if (cond)
			System.out.println("cond is true");
		else
			System.out.println("cond is false");
		System.out.println("cond = " + cond);

		System.out.println();		//skip a line
		
		cond = (x != 0);
		if (cond)
			System.out.println("cond is true");
		else
			System.out.println("cond is false");		
		System.out.println("cond = " + cond);

		System.out.println();		//skip a line

		cond = false;
		System.out.println("cond = " + cond);

		cond = true;
		System.out.println("cond = " + cond);

		System.out.println();		//skip a line
		
/*****************************************************/

		//variable declaration
		int w;

		//Create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// prompt for an integer
		System.out.print("Please enter an integer: ");
		w = keyboard.nextInt();
		
		if (isNegative(w))
			System.out.println(w + " is negative");
		else
			System.out.println(w + " is not negative");

		if (isEven(w))
			System.out.println(w + " is even");
		else
			System.out.println(w + " is odd");

		//close the keyboard
		keyboard.close();
	}

	/* Method isNegative()
	 * Input:
	 *  num - the integer to be tested
	 * Process:
	 *  tests whether or not num < 0
	 * Output:
	 *  returns true if num < 0; otherwise returns false 
	 */
	public static boolean isNegative(int num)
	{
		return (num < 0);
	}

	/* Method isEven()
	 * Input:
	 *  num - the integer to be tested
	 * Process:
	 *  tests whether or not num is even
	 * Output:
	 *  returns true if num is even; otherwise returns false 
	 */
	public static boolean isEven(int num)
	{
		return ((num % 2) == 0);
	}

}