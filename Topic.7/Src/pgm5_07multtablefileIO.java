/* multiplication table for the integers 1 to 10
 * illustrates file I/O
 * Note: Non-primitive objects are passed by reference
 */

//needed for File I/O
import java.io.*;

public class pgm5_07multtablefileIO
{
	public static void main(String[] args) throws IOException
	{
		//create an output file object
		PrintWriter outputFile = new PrintWriter("myoutput.txt");
		//PrintWriter outputFile = new PrintWriter(System.out);

		//call method to print the multiplication table headings
		printHeadings(outputFile);
	    
		//call method to print each row of the multiplication table
		for (int m1 = 1; m1 <= 10; m1++)
			printRow(outputFile,m1);                   //m1 = multiplicand
	    
		//flush the outputFile buffer
		outputFile.flush();
	    
		//print to console to show program completion
		System.out.println();
		System.out.println("The progam is terminating");

		//close the file
		outputFile.close();
	}
	
	/* Method printHeadings()
	 * Input:
	 *  out1 - a reference to the output file
	 * Process:
	 *  prints headings for a multiplication table
	 * Output:
	 *  prints the table headings
	 */
	//method to find the sum of the squares
	public static void printHeadings(PrintWriter out1)
	{
		//print the table heading
		out1.println("\tThis is a Multiplication Table from 1 to 10");
		out1.println();

		out1.printf("%5s", "X");

		// loop to print the heading of multipliers
		for (int m2 = 1; m2 <= 10; m2++)
			out1.printf("%5d", m2);
		out1.println();
	}

	/* Method printRow()
	 * Input:
	 *  out2 - a reference to the output file
	 *  m1 - the current multiplicand
	 * Process:
	 *  prints a row of a multiplication table by calculating the
	 *  first 10 multiples of the multiplicand.
	 * Output:
	 *  prints a row of the table
	 */
	public static void printRow(PrintWriter out2, int m1)
	{
		//print the multiplicand
		out2.printf("%5d", m1);
		//print a row of products
		for (int m2 = 1; m2 <= 10; m2++)
		{
			out2.printf("%5d", m1 * m2);
		}
		out2.println();
	}
}