/* Rectangle Stat
 * Accept 2 inputs for width and length and calculate the area and perimeter of the rectangle.
 * The output message should print the message When one side is ____ and the
 * other side is _____, the area is _____ and the perimeter is
 */

/* Pseudo code
 * Input variables: width, length
 * we will ask the user for the values of these variables using a system scanner
 * output value: perimeter
 * formula for the perimeter = 2(width + length)
 * formula for the area = width * length
 * display the calculated values with a message 
 */
import java.util.Scanner;

public class Rectangle_Stat {

	public static void main(String[] args) {
		
		//declaring input variables
		double width, length;
		//declaring output variables
		double perimeter, area;
		
		//setting up a scanner 
		Scanner intake = new Scanner(System.in);
		
		//ask the user for the values of the width and length
		System.out.println("Enter the value of the Width in cm:");
		width = intake.nextDouble();
		
		System.out.println("Enter the value of the length in cm:");
		length = intake.nextDouble();
		
		//formula for calculating the perimeter
		perimeter = 2*(length + width);
		//formula for the area 
		area = width * length;
		
		//display the result with the message
		System.out.println("\nWhen one of the width sides is = " + width + " cm");
		System.out.println("\nand one of the length sides is = " + length + " cm");
		System.out.println("\nthe area is = " + area + " cm");
		System.out.println("\nand the perimeter is = " + perimeter + " cm");
		
		//Print out a Thank you message for using the calculator
		System.out.println("\nThank you!");

	}

}
