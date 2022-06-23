import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) throws IOException {
		
		//declare input variables
		String date; 
		int sku = 0;
		double price, discount, tax;
		double pad = 0; //price after discount
		double max = 0, min = 1000, i = 0; //maximum and minimum variables
		int max_sku = 0;
		int min_sku = 0;
		double total = 0;
		
		//Create a Scanner object to read the input file
		Scanner inputFile = new Scanner(new File("HW2inputFile.txt"));	//inputFile is a Scanner reference variable
				
		//create a Printstream reference variable to an output file Printstream object
		PrintStream outputFile = new PrintStream("HW2outputFile.txt");
		
		//print out the report header
		outputFile.printf("%40s", "Report from 01-01 to 01-03\n\n");
		
		while(inputFile.hasNext()) {
			
			//print out the input data headers			
			outputFile.printf("(Date) %13s%12s%24s" , "(SKU)" , "(Price)" , "(Discount Percentage)\n");
		
			//read Data from inputfile
			date = inputFile.next();
			sku = inputFile.nextInt();
			price = inputFile.nextDouble();
			discount = inputFile.nextDouble();
			
			  
			//Print the data from the inputfile 
			outputFile.printf("%s%12s%12.2f%12.1f",date,sku, price ,discount);
			outputFile.println("\n");
		
			//calculate and print the price after discount
			pad = price-((price/100)*discount);
			outputFile.println("The total is = " + pad + " USD");
			
			//calculate and print the tax amount 
			tax = pad*0.08875;
			outputFile.printf("The tax amount is = ");
			outputFile.printf("%.3f%s", tax, " USD\n");
			outputFile.println("-------------------------\n");
			
			//calculate the total of pad
			total += pad;
			
			//use an if statement to initialize the maximum and minimum values
			if(i==1) {
				max = pad;
				min = pad;
			}
			
			
			//extract the maximum and minimum values using a math class  
			max = Math.max(max, pad);
			min = Math.min(min, pad);
			
			//use an if statement to extract the SKU of the highest and lowest prices
			if(max == pad) {
				max_sku = sku;
			}
			
			if(min == pad) {
				min_sku = sku;
			}
			
					
		}
		
		//printout the total 
		outputFile.println("The total sum is = " + total + " USD");
		//print out the highest and lowest item price
		outputFile.println("The highest price item is #" + max_sku  + " at " + max + " USD");
		outputFile.println("The lowest price item is #" + min_sku + " at " + min + " USD");
		
		//show that the program has completed
		outputFile.println("\nEnd of Report");
		System.out.println("The Program has Completed\nPlease refer to the OutputFile 'HW2outputFile.txt'");
		
		//flush the output buffer
		outputFile.flush();
		
		//close the input file
		inputFile.close();
				
		//close the output file
		outputFile.close();
	}

}
