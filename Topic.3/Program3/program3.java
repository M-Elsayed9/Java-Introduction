import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;


public class program3 {
	
	/*create an age calculator method with an integer return type
	 * that takes the date of birth as a date using the LocalDate class
	 */
	public static int calculateAge(LocalDate dob, PrintStream outputfile)  
	{  
		
		//declare and initialize variables
		int age;	
		
		//creating a curDate variable with the LocalDate class and invoke the now() method            
		LocalDate curDate = LocalDate.now();  
		
		//calculate the difference between two dates using Period between method 
		//and return the years using getYears method  
		age = Period.between(dob, curDate).getYears(); 
		
		//return statement
		return age;
	}
	
	public static void main(String[] args) throws IOException 
	{
		//declare and initialize variables
		String input;
		LocalDate age;
		
		//create a scanner object to read from the inputfile
		Scanner inputfile = new Scanner(new File(("pgm3inputFile.txt")));
		
		//create a printstream object reference variable to an outputfile
		PrintStream outputfile = new PrintStream("pgm3outputFile.txt");
		
		//use a do while loop to iterate the process as long as there are valid dates in the inputfile
		do {
			input = inputfile.nextLine();
			age = LocalDate.parse(input);
		
			//System.out.println("-Date of birth: (" + input + ") -Age: " + calculateAge(age) + "\n");
			outputfile.println("-Date of birth: (" + input + ") -Age: " + calculateAge(age,outputfile) + "\n");
			
			
		} while (inputfile.hasNextLine()); // conditional statement
		
		//notify the user the process has ended and refer to outputfile for results
		System.out.println("Thank you! \nPlease refer to the output file (pgm3outputFile.txt) for the results ");
		
		//close the input and output files
		inputfile.close();
		outputfile.close();
		
		}
		
	}

	

