/* Grade Calculator
 * This program take in the following inputs and returns the sum of inputs: Homework, Codelab,
 * Midterm1,Midterm2 and Final.
 * The output prints out the message : The total score is ______
 */

/* Pseudo code
 * Input variables: Homework grade, Codelab grade, Midterm1 grade, Midterm2 grade, Final grade.
 * we will scan the inputs for the above variables using a system scanner
 * arithmetic operation: Homework grade + Codelab grade + midterm1 + midterm2, + final = total score
 * Output variable: Total Score 
 * display the calculated value of the total score
 */
import java.util.Scanner;

public class Grade_Calculator {

	public static void main(String[] args) {
		
		//Declaring input variables
		double Homework, Codelab, Midterm1, Midterm2, Final;
		
		//declaring output variables
		double Total_Score;
		
		//setting up the scanner
		Scanner grade = new Scanner(System.in);
		
		//ask the user for the grades 
		System.out.println("Enter Homework Grade out of 20: ");
		Homework = grade.nextDouble();
		
		System.out.println("Enter Codelab Grade out of 20: ");
		Codelab = grade.nextDouble();
		
		System.out.println("Enter Midterm1 Grade out of 20: ");
		Midterm1 = grade.nextDouble();
		
		System.out.println("Enter Midterm2 Grade out of 20: ");
		Midterm2 = grade.nextDouble();
		
		System.out.println("Enter Final Grade out of 20: ");
		Final = grade.nextDouble();
		
		//formula for calculating final grade 
		Total_Score = Homework + Codelab + Midterm1 + Midterm2 + Final;
		
		//Printing out the final score
		System.out.println("\nThe Total Score is: " + Total_Score + "/100" + "\n");
		
		//Print out a Thank you message for using the calculator
		System.out.println("Thank You!");
	}

}
