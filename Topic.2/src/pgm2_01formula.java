//writing a formula as an expression and an if statment
public class pgm2_01formula
{
	public static void main(String[] args) {
		//declare real number variables
		double gpa, result;

		//use for loop to iterate the process
		for (gpa = 0.00; gpa <= 4.00; gpa = gpa + 0.50)
		{
			//calculate the result
			result = (gpa*gpa*gpa+7*gpa-1)/(gpa*gpa-(gpa+5)/3);

			//print the results
			System.out.println("gpa = " + gpa + " result = " + result);

			//determine if to admit the student
			if (result >= 0)
				System.out.println(" Admit");
		}
		System.out.println("The table is finished!");
	}
}