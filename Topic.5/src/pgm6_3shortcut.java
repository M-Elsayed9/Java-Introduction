/* program to classify month-day combinations in terms of season and weeks
 * illustrate short-cut
 */

//needed in order to use the Scanner class
import java.util.Scanner;

public class pgm6_3shortcut {

	public static void main(String[] args) {
		//variable declarations 
		int month,day;
		String myline;
		char answer;

		//Create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		do {
			// prompt for the month and day
			System.out.print("\nType in the number of a month (1-January ... 12-December): ");
			month = keyboard.nextInt();
			System.out.print("Type in a date within the month (1-31): ");
			day = keyboard.nextInt();

			//print the month and day entered
			System.out.println();
			System.out.println("month = " + month + " day = " + day);
		    
			// call a method to classify the month-day combination
			classify (month,day);

			// prompt whether or not to continue
			System.out.print("\nType Y to continue; N to stop: ");

			//read the response using method next()
			myline = keyboard.next();
			//extract the character
			answer = myline.charAt(0);

			//alternate procedure: read the response and extract the character in one step
			//answer = keyboard.next().charAt(0);
		    
		} while (answer == 'Y');
	    
		//close the keyboard
		keyboard.close();

		System.out.println();
		System.out.print("The program has terminated normally");
	}

	/* Method classify()
	 * Input:
	 *  month - a number specifying a month in the year
	 *  day - a number specifying a day within a month
	 * Process:
	 *  calls a method translate the month into a string
	 *  calls a method to determine which season month is in
	 *  calls a method to determine which week of the month  day is in.
	 *  Illegal entries for month and day will be caught
	 * Output:
	 *  prints the results of the classification
	 */
	public static void classify(int month, int day)
	{
		// test for valid month
		if (month < 1 || month > 12)
			// invalid month detected
			System.out.println(month + " is not a valid value for the month");
		else
		{
			// valid month entered
			translate(month);  			//translate integer to string
			whcihSeason(month);			//classify the month 
		}

		// test for valid day
		if (day < 1 || day > 31)
			// invalid day entered
			System.out.println(day + " is not a valid value for the day");
		else
			// valid day entered
			whcihWeek(day);				//classify the day
	}

	/* Method translate()
	 * Input:
	 *  month - a number specifying a month in the year
	 * Process:
	 *  translates the month into a string
	 * Output:
	 *  prints the name associated with month
	 */
	public static void translate(int month)
	{
		System.out.print("month " + month + " is ");
		if (month == 1) System.out.print("January");
		else if (month == 2) System.out.print("February");
		else if (month == 3) System.out.print("March");
		else if (month == 4) System.out.print("April");
		else if (month == 5) System.out.print("May");
		else if (month == 6) System.out.print("June");
		else if (month == 7) System.out.print("July");
		else if (month == 8) System.out.print("August");
		else if (month == 9) System.out.print("September");
		else if (month == 10) System.out.print("October");
		else if (month == 11) System.out.print("November");
		else System.out.print("December");
		System.out.println();
	}

	/* Method whcihSeason()
	 * Input:
	 *  month - a number specifying a month in the year
	 * Process:
	 *  determines which season month is in
	 * Output:
	 *  prints the name of the season
	 */
	public static void whcihSeason(int month)
	{
		if (month == 12 || month == 1 || month == 2)
			System.out.print("Winter is the season");
		else if (month == 3 || month == 4 || month == 5)
			System.out.print("Spring is the season");
		else if (month == 6 || month == 7 || month == 8)
			System.out.print("Summer is the season");
		else //if (month == 9 || month == 10 || month == 11)
			System.out.print("Fall is the season");
		System.out.println();
	}

	/* Method whcihWeek()
	 * Input:
	 *  day - a number specifying a day within a month
	 * Process:
	 *  determines which week of the month day is in.
	 *  assumes each week has 7 days.
	 * Output:
	 *  prints the week within the month
	 */
	public static void whcihWeek(int day)
	{
		System.out.println((day+6)/7 + " is the week number for day " + day);
	}
}