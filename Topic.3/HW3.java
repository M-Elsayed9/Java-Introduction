/*MohamedElsayed
 * HW-3
 */


//needed in order to use the Scanner class
import java.util.Scanner;

//needed for File I/O
import java.io.*;

public class HW3
{
	public static void main(String[] args) throws IOException	//added throws clause
	{
		//declare variables
		int id;                          			//student id
		double right,wrong,omitted,totalAnswered,grade,right_prc;			//Exam statistics variables
		int numstu = 0;                 			//count the students

		//open the input file
		File myFile = new File("HW3inputFile.txt");		//myFile is a File reference variable

		//Create a Scanner object to read the input file
		Scanner inputFile = new Scanner(myFile);	//inputFile is a Scanner reference variable
		//Scanner inputFile = new Scanner(System.in);
		
		//create a PrintWriter reference variable to an output file PrintWriter object
		PrintWriter outputFile = new PrintWriter("HW3output.txt");
		//PrintWriter outputFile = new PrintWriter(System.out);

		//print the table header
		outputFile.printf("%50s","Exam Statistics\n");
		outputFile.println();
		outputFile.printf("Student ID%16s%15s%16s%10s%9s%11s",
			"Right Answers","Wrong Answers","Total Answered","Omitted","Grade","right_prc");
		outputFile.println();
		
		//prompt the user to enter an ID
		//System.out.print("Please enter Student ID (enter -1 to stop): ");
		
		//read the id
		id = inputFile.nextInt();						
		  
		while (id != -1) {                			//check for fake ID
			//prompt for and read the number of right answers
			//System.out.print("Please enter the number of right answers: ");
			right = inputFile.nextDouble();						

			//prompt for and read the number of wrong answers
			//System.out.print("Please enter the number of wrong answers: ");
			wrong = inputFile.nextDouble();	
			
			//calculate total numbers answers and omitted
			totalAnswered = right + wrong;
			omitted = 50 - totalAnswered;
						
			//calculate the student grade
			grade = right * 2;
			

			//calculate the student right answer percentage
			right_prc = right / totalAnswered;


			//print student statistics information
			outputFile.printf("%6d%14.0f%15.0f%16.0f%13.0f%10.0f%11.3f", id,right,wrong,totalAnswered,omitted,grade,right_prc);
			outputFile.println();
			
			//determine if more answers are wrong or right
			if (right < wrong)
				outputFile.println("\n*More wrong answers than right answers\n");
			else
				outputFile.println("\n*More right answers than wrong answers\n");
			
			//determine if 10 or more questions are omitted
			if (omitted >= 10)
				outputFile.println("*10 or more questions omitted\n\n\n");
			else 
				outputFile.println("*less than 10 questions omitted\n\n\n");
	        
			//flush the output buffer		
			outputFile.flush();
		    
			//increment the student counter
			numstu++;
	        
			//prompt for and enter the next ID
			//System.out.print("Please enter an ID (enter -1 to stop): ");
			id = inputFile.nextInt();						
		}
		outputFile.println();
		outputFile.println("We have processed " + numstu + " students");
		
		//flush the output buffer
		outputFile.flush();
	    
		//show that the program has completed
		outputFile.println("\nThe program has completed");

		//close the input file
		inputFile.close();
		
		//close the file
		outputFile.close();
	}
}