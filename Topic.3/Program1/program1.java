import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class program1 {

	// create a factorial method that  calculates the factorial number of the parameter x
	public static void factorial(int x, PrintStream outputFile) {
		
		//declare and initialize variables
		int i;
		int fact = 1;    
		
		//iterate the calculations using a for loop
		for(i=1; i<=x; i++) { 
		      fact = fact * i;      
		  }
		
		//print the out the result
		//System.out.println("The factorial of " + x + " is: " + fact );
		outputFile.println("The factorial of " + x + " is: " + fact);
	}
	
	//create a sumOfSquares method that calculates the sum of squares for the number series ending in that number
	public static void sumOfSquares(int y, PrintStream outputFile) {
		
		//declare and initialize variables
		int i;
		double sqrSum = 0;
		
		//use a for loop to iterate the calculations
		for(i = 0;i<=y; i++) 
		{
			sqrSum = Math.pow(i,2) + sqrSum;
		}
		
		//print out the result
		//System.out.printf("The Sum of Squares is = %.0f%s",  sqrSum, "\n");
		outputFile.printf("The Sum of Squares is = %.0f%s",  sqrSum, "\n");
	}
	
	//create a fibonacci method that prints the fibonacci sequnce of the number
	public static void fibonacci(int z, PrintStream outputFile) 
	{
		
		//declare and initialize variables
		int num1 = 1; 
		int num2 = 2;
		int num3;
		int counter = 0;
		
		
		//System.out.print("The Fibonacci sequence is: ");
		outputFile.print("The Fibonacci sequence is: ");
        
		// use a do while loop to Iterate till counter is z
        do 
        {
  
            // Print the result
            //System.out.print(num1 + " ");
            outputFile.print(num1 + " ");
        	
            //switch the values after every iteration to get the right result
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
		
        } while (counter < z);
        
        //System.out.println("\n");
        outputFile.println("\n");
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		//declare and initialize variables
		int n;
		
		//Create a Scanner object to read the input file
		Scanner inputFile = new Scanner(new File("HW3inputFile.txt"));	
						
		//create a Printstream reference variable to an output file 
		PrintStream outputFile = new PrintStream("pgm1_outputFile.txt");
		
		//use a while loop to read the inputfile until there are no integer left
		while (inputFile.hasNextInt()) 
		{
			
			n = inputFile.nextInt();
		
		
			//call and apply the methods to the variables n
			factorial(n, outputFile);
		
			sumOfSquares(n, outputFile);
		
			fibonacci(n, outputFile);
			outputFile.println("-------------");
		
		}
		
		//notify the user the process has ended and refer to outputfile for results
		System.out.println("Thank you! \nPlease refer to the output file (pgm1_outputFile.txt) for the results ");
		
		//close the input and output files
		outputFile.close();
		inputFile.close();
	}

}
