/*Mohamed Elsayed
 * HW6 - Calculator
 */

//needed to use IO File
import java.io.*;
//Needed in order to use the scanner
import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) throws IOException	//added throws clause 
	{
		
		//declaring variables 
		int number1 , number2 ,number3, result;		//declaring arithmetic operations
		char operator;						//declaring the user's response 
		String myline;
		
		
		//open the input file
		File myFile = new File("HW6_inputFile.txt");		//myFile is a File reference variable

		//Create a Scanner object to read the input file
		Scanner inputFile = new Scanner(myFile);	//inputFile is a Scanner reference variable
		//Scanner inputFile = new Scanner(System.in);
						
		//create a PrintWriter reference variable to an output file PrintWriter object
		PrintWriter outputFile = new PrintWriter("HW6-outputFile.txt");
		//PrintWriter outputFile = new PrintWriter(System.out);
		
		
		//print the calculator header
				outputFile.printf("%30s","Calculator\n");
				outputFile.println();
						
		// choose an operator
	    outputFile.println("Choose an operator: \n\n(+  -  *  /  %) \nA = Average of two numbers \nX = Maximum of two numbers "
			    		+ "\nM = Minimum of two numbers \nS = Square of a number \nEnter Q to quit the calculator\n");
			 
		
	    
	    myline = inputFile.next(); //read the response
	    operator = myline.charAt(0); //extract the character
	    
	    // Read number1 
	   
	    number1 = inputFile.nextInt();
	    
	    
	    // read number2
	    
	    number2 = inputFile.nextInt();
	    
	    //read number3
	    number3 = inputFile.nextInt();
	   
	    switch (operator) 
	    
	    {
	    
	    
	    // performs addition between numbers
	      case '+':
	        result = number1 + number2 + number3;
	      outputFile.println("operation: Addition" + "\naugend: "+ number1 + "\naddend: " + number2 + "\naddend2: " + number3 + "\nsum: " + result + "\n\n");
	        

	    // performs subtraction between numbers
	      case '-':
	        result = number1 - number2 - number3;
	        outputFile.println("operation: subtraction" + "\nminuend: " + number1 + "\nsubtrahend: " + number2 + "\nsubtrahend2: " + number3 + "\nthe difference: " + result+ "\n\n");
	        
			        
		// performs multiplication between numbers
	      case '*':
	        result = number1 * number2 * number3;
	        outputFile.println("operation: Multiplication" +"\nmultiplicand: " + number1 + "\nmultiplier: " + number2 + "\nmultiplier2: " + number3 + "\nproduct: " + result+ "\n\n");
	        

	    // performs division between numbers
	      case '/':
	        result = (number1 / number2) /number3;
	        outputFile.println("operation: divison"+"\ndividend: " +number1 + "\ndivisor: " + number2 + "\ndivisor2: " + number3 + "\nquotient: " + result+ "\n\n");
	        
	        
	    // performs modulus between numbers
	      case '%':
	        result = (number1 % number2)%number3;
	        outputFile.println("operation: modulus"+"\n1st operand: " +number1 + "\n2nd operand: " + number2  + "\n3rd operand: " + number3 +"\nremainder: " + result+ "\n\n");
	        
	        
	    // average of numbers
	      case 'A':
		    result = (number1 + number2 + number3) / 3;
		    outputFile.println("operation: Average of numbers" + "\nnumber 1: " +number1 + "\nnumber 2: " + number2 + "\nnumber 3: " + number3 + "\nAverage: " + result+ "\n\n");
		    
		    
		// Maximum of numbers
	      case 'X':
		    result = Math.max(number1,number2);
		    outputFile.println("operation: Maximum of two numbers" + "\nnumber 1: " +number1 + "\nnumber 2: " + number2 + "\nMax: " + result+ "\n\n");
		    
		    
	    // Maximum of numbers
	      case 'M':
		    result = Math.min(number1,number2);
		    outputFile.println("operation: Minimum of two numbers" + "\nnumber 1: " +number1 + "\nnumber 2: " + number2 + "\nMin: " + result+ "\n\n");
		    
		    
		// square of a number
	      case 'S':
		    result = number1 * number1;
		    outputFile.println("operation: Square of a number" + "\nnumber: " +number1 + "\nSquare: " + result+ "\n\n");
		    
		    
	      
	    	  
	      default:
	        outputFile.println("Quitting calculator!");
	        break;
	        
	      
	   } 
			
		//show that the program has completed in the console
		  System.out.println("\nThe program has completed");
		
	    //flush the output buffer
	  outputFile.flush();
	    //close the input file
	  inputFile.close();
	  
	}

	
}
	


