public class pgm2_08centered
{
	public static void main(String[] args)
	{
		//declare real number variables
		double gpa, result;

		//print the table headings
		System.out.println("\t\t\tTable of Function Values");
		System.out.println();
		System.out.println("Grade Point Average\tValue of Formula\tStatus");

		//use for loop to iterate the process
		for (gpa = 0.00; gpa <= 4.00; gpa = gpa + 0.50)
		{
			//calculate the result
			result = (gpa*gpa*gpa+7*gpa-1)/(gpa*gpa-(gpa+5)/3);
	    	
			//print the results to a specified width and precision
			System.out.printf("%11.1f%24.3f", gpa,result);

			//determine if to admit the student
			if (result >= 0)
				System.out.print("\t\tAdmit");

			//go to next line
			System.out.println();
		}
		System.out.println("\nThe table is finished!");
	}
}