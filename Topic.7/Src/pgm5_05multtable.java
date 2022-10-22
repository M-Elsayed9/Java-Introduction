// multiplication table for the integers 1 to 10

public class pgm5_05multtable
{
	public static void main(String[] args)
	{
		//call method to print the multiplication table headings
		printHeadings();
	    
		//call method to print each row of the multiplication table
		for (int m1 = 1; m1 <= 10; m1++)
			printRow(m1);                   //m1 = multiplicand
	}
	
	/* Method printHeadings()
	 * Input:
	 *  none
	 * Process:
	 *  prints headings for a multiplication table
	 * Output:
	 *  prints the table headings
	 */
	//method to find the sum of the squares
	public static void printHeadings()
	{
		//print the table heading
		System.out.println("\tThis is a Multiplication Table from 1 to 10");
		System.out.println();

		System.out.printf("%5s", "X");

		// loop to print the heading of multipliers
		for (int m2 = 1; m2 <= 10; m2++)
			System.out.printf("%5d", m2);
		System.out.println();
	}

	/* Method printRow()
	 * Input:
	 *  m1 - the current multiplicand
	 * Process:
	 *  prints a row of a multiplication table by calculating the
	 *  first 10 multiples of the multiplicand.
	 * Output:
	 *  prints a row of the table
	 */
	public static void printRow(int m1)
	{
		//print the multiplicand
		System.out.printf("%5d", m1);
		//print a row of products
		for (int m2 = 1; m2 <= 10; m2++)
		{
			System.out.printf("%5d", m1 * m2);
		}
		System.out.println();
	}

}