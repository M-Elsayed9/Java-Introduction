/*Circle Stat
Accept 1 input for radius r and calculate the circumference and area of a circle. The output
message should print the message When the radius is ____ the circumference
is _____ and the area is ______.
*/

/* Pseudo code
 * input variables: Radius = r 
 * we will ask the user for the value of the radius using a system scanner
 * output variables: circumference, area.
 * formula for calculating the circumference = 2(3.14)(r) 
 * formula for calculating the area = 3.14(r*r)
 * display the calculated values with a message 
 */
import java.util.Scanner;

public class Circle_Stat {

	public static void main(String[] args) {
		
		//declaring input variable
		double radius;
		
		//declaring output variables
		double circumference, area;
		
		//set up a scanner
		Scanner intake = new Scanner(System.in);
		
		//ask the user for the radius
		System.out.println("Enter the value of the radius in cm: ");
		radius = intake.nextDouble();
		
		//formula for calculating the circumference
		circumference = 2*(3.14)*(radius);
		
		//formula for calculating the area
		area = 3.14*(radius*radius);
		
		//display the results with a message
		System.out.println("\nWhen the radius is = " + radius + " cm");
		System.out.println("\nThe circumference is = " + circumference + " cm" );
		System.out.println("\nand the area is = " + area + " cm");
		
		//Print out a Thank you message for using the calculator
		System.out.println("\nThank you!");

	}

}
