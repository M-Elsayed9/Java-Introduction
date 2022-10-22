// a program to do some addition 

//needed in order to use the Scanner class
import java.util.Scanner;

public class pgm1_2addition {

	public static void main(String[] args) {
		//declare an integer variable
		int number;
				
		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);

		//prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		
		//enter the integer
		number = keyboard.nextInt();

		//do some addition
		number = number + 10;
		
		//print the new value of number
		System.out.println("The new value of number is " + number);

		//close the keyboard
		keyboard.close();
	}

}