import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double num, num1;
		char operator;
		double result = 0;
		
		//create a scanner object and attatch it to system.in
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter the operator
		System.out.print("Enter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
		
		do {
			
			//consume the operator and extract the first charachter only
			operator = input.next().charAt(0);
					
			//use a switch statemnet to operate on and validate the input
			//use try and catch to validate input and throw the appropriate exception
			switch(operator) {
		
			case '+' : 
				try {
					System.out.print("Enter the first addend: ");
					num = input.nextDouble();
					System.out.print("Enter the second addend: ");
					num1 = input.nextDouble();
					result = sum(num,num1);
					System.out.println("The Sum of " + num + " + " + num1 + " = " + result);
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}catch (InputMismatchException err) {
					String error = input.nextLine();
					System.out.println("(" + error + ") invalid input");
					System.out.println("Enter digits only");
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}
			case '-' : 
				try {
					System.out.print("Enter the minuend: ");
					num = input.nextDouble();
					System.out.print("Enter the subtrahend: ");
					num1 = input.nextDouble();
					result = difference(num,num1);
					System.out.println("The difference between " + num + " - " + num1 + " = " + result);
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}catch (InputMismatchException err) {
					String error = input.nextLine();
					System.out.println("(" + error + ") invalid input");
					System.out.println("Enter digits only");
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}
				
			case '*' : 
				try {
					System.out.print("Enter the multiplier: ");
					num = input.nextDouble();
					System.out.print("Enter the multiplicand: ");
					num1 = input.nextDouble();
					result = product(num,num1);
					System.out.println("The product of " + num + " * " + num1 + " = " + result);
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}catch (InputMismatchException err) {
					String error = input.nextLine();
					System.out.println("(" + error + ") invalid input");
					System.out.println("Enter digits only");
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}
				
			case '/' : 
				try {
					System.out.print("Enter the dividend: ");
					num = input.nextDouble();
					System.out.print("Enter the divisor: ");
					num1 = input.nextDouble();
					result = divison(num,num1);
					System.out.println("The quotient of " + num + " / " + num1 + " = " + result);
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}catch (InputMismatchException err) {
					String error = input.nextLine();
					System.out.println("(" + error + ") invalid input");
					System.out.println("Enter digits only");
					System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
					break;
				}
			case '0' :
				System.out.println("Exiting...\nProgram Terminated");
				break;
				
			default : 
				System.out.println("(Invalid operator)");
				System.out.print("\nEnter the operator (+) (-) (*) (/) \nor Enter (0) to exit: ");
			}
			
		}while (operator != '0');

		input.close();
	}
	
	//sum method 
	public static double sum(double num, double num1) {
		double result;
		return result = num + num1;
	}
	
	//subtraction method
	public static double difference(double num, double num1) {
		double result;
		return result = num - num1;
	}
	
	//multiplication method
	public static double product(double num, double num1) {
		double result;
		return result = num * num1;
	}
	
	//division method
	public static double divison(double num, double num1) {
		double result;
		return result = num / num1;
	}
}
