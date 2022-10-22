//needed in order to use the Scanner class
import java.util.Scanner;

//needed for File I/O
import java.io.*;

public class pgm3_4redirectoutput
{
	public static void main(String[] args) throws IOException	//added throws clause
	{
		//declare variables
		int id;                         			//employee id
		double hours,rate,pay,tax,netpay;			//payroll variables
		int numemp = 0;                  			//count the employees

		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);		//keyboard is a Scanner reference variable
		
		//create a PrintWriter reference variable to an output file PrintWriter object
		//PrintWriter outputFile = new PrintWriter("c:\\BC\\CISC1115\\pgms\\Topic3\\myoutput.txt");
		//can use forward slash in Java
		//PrintWriter outputFile = new PrintWriter("c:/BC/CISC1115/pgms/Topic3/myoutput.txt");
		PrintWriter outputFile = new PrintWriter("myoutput.txt");
		//PrintWriter outputFile = new PrintWriter(System.out);

		//prompt the user to enter an ID
		System.out.print("Please enter an ID (enter -1 to stop): ");
		
		//read the id
		id = keyboard.nextInt();						
		
		while (id != -1) {                			//check for fake ID
			//prompt for and read the hours worked
			System.out.print("Please enter the hours worked): ");
			hours = keyboard.nextDouble();						

			//prompt for and read the rate of pay
			System.out.print("Please enter rate of pay: ");
			rate = keyboard.nextDouble();						

			//calculate the gross pay
			pay = hours * rate;
			
			//calculate the tax
			if (pay < 300)
				tax = 0.15 * pay;
			else
				tax = 0.28 * pay;
			
			//calculate the net pay
			netpay = pay - tax;

			//print employee payroll information
			outputFile.printf("\nEmployee %d worked %.1f hours at a rate of pay of $%.2f"
				+ " earning $%.2f", id,hours,rate,pay);
			outputFile.println();
			outputFile.printf("tax withheld was $%.2f leaving net pay of $%.2f\n", tax,netpay);
			outputFile.println();
			outputFile.println();
	        
			//flush the output buffer
			outputFile.flush();
		    
			//increment the employee counter
			numemp++;
	        
			//prompt for and enter the next ID
			System.out.print("Please enter an ID (enter -1 to stop): ");
			id = keyboard.nextInt();						
		}
		outputFile.println("We have processed " + numemp + " employees");

		//flush the output buffer
		outputFile.flush();
		
		//show that the program has completed
		System.out.println("\nThe program has completed");

		//close the keyboard
		keyboard.close();
		
		//close the file
		outputFile.close();
	}
}