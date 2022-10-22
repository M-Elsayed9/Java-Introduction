import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.IOException;


public class distanceTraveled {

	public static void main(String[] args) throws IOException {
		
		//declare input Variables
		String header;		
		String vehicle;
		int speed;
		int time;
			
		//create a scanner reference and attach it to a scanner object inputFile
		Scanner inputfile = new Scanner(new File("DT_inputFile.txt"));
		
		//consume the input header
		header = inputfile.nextLine();
		
		//use a delimiter to read input
		inputfile.useDelimiter(",|\\n");
		
		//use a while loop to iterate and consume 
		while(inputfile.hasNext()) {
			
			vehicle = inputfile.next();
			speed = Integer.parseInt(inputfile.next());
          		time = Integer.parseInt(inputfile.next().trim());
			
			//invoke the saveAsFile method to print the output to different files
			saveAsFile(vehicle,speed,time);
			
		}
		
		//notify the user that the program ran succefully
		System.out.println("Program terminated\nPlease refer to the outputfiles generated for each vehicle with a .txt extension ");
		System.out.println("E.g: \"Train.txt\", \"Car.txt\", etc... ");
	}

	//Create distance method with two int parameters
	public static void distance(int speed1, int time1, PrintStream output) {
		
		int hour;
		int distance;
		
		//print out the report header
		output.println("Hour\t\tDistance Traveled");
		output.println("---------------------------------");
		//System.out.println("Hour\t\tDistance Traveled");
		//System.out.println("---------------------------------");
		
		//use a conditional statement to validate input 
		if (speed1 >= 0 && time1 > 0) { 
			
			//index hour with each value of time 
			for ( hour = 1; hour <= time1; hour++) {
			
				//initialize the distance variable with the formula
				distance = speed1 * hour;
				
				//printout the distance traveled for each hour of a time period  
				output.println(hour + "\t\t\t\t" + distance);	
			}
		}
		
		//print out an error message if speed input is invalid
		if (speed1 < 0) {
			output.println(speed1 + " is invalid speed");
		}
		//System.err.println(speed1 + " invalid speed"); //testing
				
		//print out an error message if time input is invalid
		if (time1 < 1) {
			output.println(time1 + " is invalid time");
		}
		//System.err.println(time1 + " invalid time");	//testing	
	}
	
	//create a saveAsFile method to print to different output files
	public static void saveAsFile(String vehicle1, int speed2, int time2) throws IOException {
		
		//create a print stream reference and attatch it to new object 
		//concat each vehicle name with the extension string
		PrintStream output = new PrintStream(vehicle1.concat(".txt"));
		
		//printout the vehicle type to each output file
		output.println("Vehicle Type: " + "(" + vehicle1 + ")");
		
		//invoke the distance method to print the report to different files 
		distance(speed2,time2,output);
	}
}
