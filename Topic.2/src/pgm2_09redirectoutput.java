//needed for File I/O
import java.io.*;

public class pgm2_09redirectoutput
{
	public static void main(String[] args) throws IOException	//added throws clause
	{
		//declare real number variables
		double gpa, result;

		//create an output file object using the PrintWriter class
		//also, create a PrintWriter reference variable to refer to and access the object
		//PrintWriter outputFile = new PrintWriter("c:\\BC\\CISC1115\\pgms\\Topic2\\myoutput.txt");
		//can use a forward slash in Java
		//PrintWriter outputFile = new PrintWriter("c:/BC/CISC1115/pgms/Topic2/myoutput.txt");
		PrintWriter outputFile = new PrintWriter("myoutput.txt");
		//PrintWriter outputFile = new PrintWriter(System.out);		//direct output to the console

		//for Mac users
		//PrintWriter outputFile = new PrintWriter("/BC/CISC1115/pgms/Topic2/myoutput.txt");
		//PrintWriter outputFile = new PrintWriter("myoutput.txt");
		
		//create an output file object using the PrintStream class
		//then create a PrintStream Reference Variable to refer to the object
		//PrintStream outputFile = new PrintStream("c:/BC/CISC1115/pgms/Topic2/myoutput.txt");
		//PrintStream outputFile = new PrintStream(System.out);

		//print the table headings
		//outputFile.print("\t\t\tTable of Function Values");
		outputFile.printf("%43s","Table of Function Values");
		outputFile.println();
		outputFile.println();
		//outputFile.print("Grade Point Average\tValue of Formula\tStatus");
		outputFile.printf("%19s%21s%14s","Grade Point Average","Value of Formula","Status");
		outputFile.println();

		//use for loop to iterate the process
		for (gpa = 0.00; gpa <= 4.00; gpa = gpa + 0.50)
		{
			//calculate the result
			result = (gpa*gpa*gpa+7*gpa-1)/(gpa*gpa-(gpa+5)/3);
	    	
			//print the results to a specified width and precision
			outputFile.printf("%11.1f%24.3f", gpa,result);

			//determine if to admit the student  
			if (result >= 0)  
				//outputFile.print("\t\tAdmit");
				outputFile.printf("%18s","Admit");

			//go to next line
			outputFile.println();
		}
		outputFile.println();
		outputFile.println("The table is finished");
	    
		//flush the output buffer
		outputFile.flush();
	    
		//show that the program has completed
		System.out.println();
		System.out.println("The program has completed");

		//close the file
		outputFile.close();
	}
}