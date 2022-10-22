//sample program to add some numbers

//needed in order to use the Scanner class
import java.util.Scanner;

public class pgm1_3addition {

	public static void main(String[] args) {
		//declare some variables
		int number1, number2, sum;

		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);

		//prompt the user to enter the first number
		System.out.print("Enter the first number: ");

		//enter the first number
		number1 = keyboard.nextInt();

		//prompt the user to enter the second number
		System.out.print("Enter the second number: ");

		//enter the second number
		number2 = keyboard.nextInt();

		//compute the sum
		sum = number1 + number2 + 10;

		//print the sum
		System.out.println("The final sum is " + sum);

		//close the keyboard
		keyboard.close();
	}

}