/* payroll program with tax deductions
 * illustrate file I/O
 * tabular output
 */

//needed in order to use the Scanner class
import java.util.Scanner;

//needed for File I/O
import java.io.*;

public class pgm3_6payroll_table
{
	public static void main(String[] args) throws IOException	//added throws clause
	{
		//declare variables
		int id;                          			//employee id
		double hours,rate,pay,tax,netpay;			//payroll variables
		int numemp = 0;                  			//count the employees

		//open the input file
		//File myFile = new File("c:\\BC\\CISC1115\\pgms\\Topic3\\myinput.txt");
		//can use forward slash in Java		
		//File myFile = new File("c:/BC/CISC1115/pgms/Topic3/myinput.txt");
		File myFile = new File("payroll_input2.txt");		//myFile is a File reference variable

		//Create a Scanner object to read the input file
		Scanner inputFile = new Scanner(myFile);	//inputFile is a Scanner reference variable
		//Scanner inputFile = new Scanner(System.in);
		
		//create a PrintWriter reference variable to an output file PrintWriter object
		//PrintWriter outputFile = new PrintWriter("c:\\BC\\CISC1115\\pgms\\Topic3\\myoutput.txt");
		//can use forward slash in Java
		//PrintWriter outputFile = new PrintWriter("c:/BC/CISC1115/pgms/Topic3/myoutput.txt");
		PrintWriter outputFile = new PrintWriter("payroll_output2.txt");
		//PrintWriter outputFile = new PrintWriter(System.out);

		//print the table header
		//outputFile.println("\t\t\tPayroll Table");
		outputFile.printf("%51s","Payroll Table\n");
		outputFile.println();
		//outputFile.println("Employee ID\tHours Worked\tRate of Pay\tGross Pay\tTax\tNet Pay");
		outputFile.printf("Employee ID%17s%15s%14s%10s%12s",
			"Hours Worked","Rate of Pay","Gross Pay","Tax","Net Pay");
		outputFile.println();
		
		//prompt the user to enter an ID
		//System.out.print("Please enter an ID (enter -1 to stop): ");
		
		//read the id
		id = inputFile.nextInt();						
		  
		while (id != -1) {                			//check for fake ID
			//prompt for and read the hours worked
			//System.out.print("Please enter the hours worked: ");
			hours = inputFile.nextDouble();						

			//prompt for and read the rate of pay
			//System.out.print("Please enter rate of pay: ");
			rate = inputFile.nextDouble();						

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
			outputFile.printf("%8d%16.1f%16.2f%16.2f", id,hours,rate,pay);
			outputFile.printf("%12.2f%10.2f", tax,netpay);
			outputFile.println();
	        
			//flush the output buffer		//not wanted at this point when making a table
			//outputFile.flush();
		    
			//increment the employee counter
			numemp++;
	        
			//prompt for and enter the next ID
			//System.out.print("Please enter an ID (enter -1 to stop): ");
			id = inputFile.nextInt();						
		}
		outputFile.println();
		outputFile.println("We have processed " + numemp + " employees");
		
		//flush the output buffer
		outputFile.flush();
	    
		//show that the program has completed
		System.out.println("\nThe program has completed");

		//close the input file
		inputFile.close();
		
		//close the file
		outputFile.close();
	}
}