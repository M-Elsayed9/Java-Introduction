import java.util.Scanner;
import java.io.IOException;
/* Practice expressing control flow using conditionals. This program builds upon your work
from homework 1. Using standard stream input, prompt the user to choose an option for a shape. Then,
depending on the shape, ask for the relevant parameters (i.e. radius, width, length) and output the area and
either of circumference or perimeter for that shape.
*/
public class program2 {
	
	/*create a circleStat method with a void return type 
	 * that calculates the area and circumference of a circle based on the raidus
	 */
	public static void circleStat(double x) {
		
		//declare and initialize variables
		double radius = x;
				
		//formula for calculating the circumference
		double circumference = 2*(3.14)*(radius);
				
		//formula for calculating the area
		double area = 3.14*(radius*radius);
				
		//display the results with a message
		System.out.println("\nWhen the radius is = " + radius + " cm");
		System.out.printf("\nThe circumference is = %.2f",  circumference);
		System.out.print(" cm");
		System.out.printf("\nthe area is = %.2f", area);
		System.out.print(" cm");
	}

	/*create a rectangleStat method with a void return type that calculates the perimeter 
	 * and the area based on the width and length variables
	 */
	public static void rectangleStat(double y, double z) {
		
		double width,length,perimeter,area;
		
		width = y;
				
		length = z;
				
		//formula for calculating the perimeter
		perimeter = 2*(length + width);
		//formula for the area 
		area = width * length;
				
		//display the result with the message
		System.out.println("\nWhen the width is = " + width + " cm");
		System.out.println("\nand the length is = " + length + " cm");
		System.out.println("\nthe area is = " + area + " cm");
		System.out.println("\nthe perimeter is = " + perimeter + " cm");
	}


	public static void main(String[] args) throws IOException {
		
		
		double radius1,width1,length1;
		int shape;
		// create a scanner object to recieve input from user
		Scanner intake2 = new Scanner(System.in);

		
		//prompt the user to choose a shape 
		System.out.println("choose a shape by choosing a number \n\nEnter 1 for Circle \nEnter 2 for Rectangle"
				+ "\nEnter 0 to Exit ");
		
		//use a while loop to iterate the process
		while(intake2.hasNextInt()) {
			
			shape = intake2.nextInt();
			
			//using conditional statements to make a decision
			if(shape == 1) {
				//prompt the user for the radius 
				System.out.print("Enter the radius: ");
				radius1 = intake2.nextDouble();
				circleStat(radius1);
				System.out.println("\n\nEnter 1 for Circle \nEnter 2 for Rectangle"
						+ "\nEnter 0 to Exit ");
				
			}else if(shape == 2) {
				//prompt the user for the width and length
				System.out.println("Enter the width: ");
				width1 = intake2.nextDouble();
				
				System.out.println("Enter the Length: ");
				length1 = intake2.nextDouble();
				
				rectangleStat(width1,length1);
				
				System.out.println("\n\nEnter 1 for Circle \nEnter 2 for Rectangle"
						+ "\nEnter 0 to Exit ");
			}else if (shape == 0){
				System.out.println("Thank you!\nThe Program has terminated");
				break;
			}else {
				System.out.println("Wrong Entry \nEnter 1 for Circle, 2 for Rectangle or 0 to Exit");
			}
				
		}
							
		//close the intake scanner
		intake2.close();
	}

}
