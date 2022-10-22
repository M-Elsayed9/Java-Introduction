//needed for File I/O
import java.io.*;

//this program really only needs the PrintWriter and IOException classes of the java.io package 
//import java.io.IOException;
//import java.io.PrintWriter;

public class pgm2_10redirectoutput_open
{
	public static void main(String[] args) throws IOException	//added throws clause
	{
		//declare real number variables
		double gpa, result;

		//create an uninitialized PrintWriter reference variable
		PrintWriter outputFile;

		//create a PrintWriter object and attach it to a file
		//assign the reference variable to refer to the object to enable file access  
		//outputFile = new PrintWriter("c:\\BC\\CISC1115\\pgms\\Topic2\\myoutput.txt");
		//can use a forward slash in Java
		//outputFile = new PrintWriter("c:/BC/CISC1115/pgms/Topic2/myoutput.txt");
		outputFile = new PrintWriter("myoutput.txt");
		//outputFile = new PrintWriter(System.out);		//direct output to the console
		
		//print the table headings
		outputFile.println("\t\t\tTable of Function Values");
		outputFile.println();
		outputFile.println("Grade Point Average\tValue of Formula\tStatus");

		//use for loop to iterate the process
		for (gpa = 0.00; gpa <= 4.00; gpa = gpa + 0.50)
		{
			//calculate the result
			result = (gpa*gpa*gpa+7*gpa-1)/(gpa*gpa-(gpa+5)/3);
	    	
			//print the results to a specified width and precision
			outputFile.printf("%11.1f%24.3f", gpa,result);

			//determine if to admit the student  
			if (result >= 0)  
				outputFile.print("\t\tAdmit");

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