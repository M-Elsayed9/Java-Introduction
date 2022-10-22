// type in a number on the keyboard & echo it to the screen

//needed in order to use the Scanner class
import java.util.Scanner;

public class pgm1_1input_output {

	public static void main(String[] args) {
		//declare an integer variable
		int number;
				
		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);

		//prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		
		//enter the integer
		number = keyboard.nextInt();
		
		//print the integer entered
		System.out.println("The number entered was " + number);

		//close the keyboard
		keyboard.close();
	}

}