/*Mohamed Elsayed
*HW5
*/

//needed to use IO File
import java.io.*;
//Needed in order to use the scanner 
import java.util.Scanner;

public class HW_5 
{
	
	public static void main(String[] args) throws IOException	//added throws clause 
	{
		//declare variables
		int  score1, score2, score3;			//scores variables
		int numofgroups = 0;   	//number of groups variable 		
		int numofig = 0;			//number of invalid groups
		int numofvg = 0;			//number of valid groups
		//open the input file
		File myFile = new File("HW5_inputFile.txt");		//myFile is a File reference variable

		//Create a Scanner object to read the input file
		Scanner inputFile = new Scanner(myFile);	//inputFile is a Scanner reference variable
		//Scanner inputFile = new Scanner(System.in);
				
		//create a PrintWriter reference variable to an output file PrintWriter object
		PrintWriter outputFile = new PrintWriter("HW5_output.txt");
		//PrintWriter outputFile = new PrintWriter(System.out);
		
		//print the table header
		outputFile.printf("%30s","Bowling Scores\n");
		outputFile.println();
		outputFile.printf("score1" + "\tscore2" + "\tscore3");
		outputFile.println();
		
		//read score 1 from the input file as an integer
		score1 = inputFile.nextInt();
		//a while loop with a sentinel = -999 to stop the loop
		while(score1 != -999) 
		{
			
			//read score2 from the input file as an integer
			score2 = inputFile.nextInt();
			//read score3 from the input file as an integer
			score3 = inputFile.nextInt();
			
			//print the three scores from the file
			outputFile.println(" " + score1 + "\t " + score2 + "\t " + score3);
			outputFile.println();
			
			
			//implementing the valid group method inside of 
			if (validgroup(score1,score2,score3, outputFile))
			{
				outputFile.println("Group is valid");
				
				//implementing oneGamescore method to rate the scores
				 oneGamescore(score1, outputFile);
				 oneGamescore2(score2, outputFile);
				 oneGamescore3(score3, outputFile);
				 
				//number of valid groups counter
				numofvg++;
				
				
			}
			else {
			
				outputFile.println("Group is invalid");
			
				if(score1 < 0)
					outputFile.println(score1 + " is negative");
				if(score1 > 300)
					outputFile.println(score1 + " is more than 300");
				if(score2 < 0)
					outputFile.println(score2 + " is negative");
				if(score2 > 300)
					outputFile.println(score2 + " is more than 300");
				if(score3 < 0)
					outputFile.println(score3 + " is negative");
				if(score3 > 300)
					outputFile.println(score3 + " is more than 300");
				//number of invalid groups counter
				numofig++;
			}
			
			
			//printing the average of the scores 
			 outputFile.println("Average of scores =  " + avg3scores(score1,score2,score3) +"\n\n\n");
			 
							 
			 
			
			//total number of groups processed
			numofgroups++;

			
			//flush the output buffer
			outputFile.flush();
			
			score1 = inputFile.nextInt();
			
	}
		
		//print the number of groups processed
		outputFile.println();
		outputFile.println(numofgroups + " Groups have been processed");
		
		//print number of invalid groups
		outputFile.println(numofvg + "valid Groups");
				
		//print number of invalid groups
		outputFile.println(numofig + "invalid Groups");
		 
		//close the input file
		inputFile.close();
		
		//flush the output buffer
		outputFile.flush();
	    
		//show that the program has completed in the console
		System.out.println("\nThe program has completed");

		}

	/* Method oneGamescore()
	 * Input:
	 *  score(reference to score1) - an integer to be tested
	 * Process:
	 * converts scores into a rating
	 * Output:
	 *  prints the original score and the rating for the score
	 */

	public static void oneGamescore(int score, PrintWriter outputFile) 
	{
		if (score >= 250)
			outputFile.println("*a score of " + score + " is a Professional game score");
		if (score >= 200)
			if (score <= 249)
			outputFile.println("*a score of " +score + " is an excellent game score");
		if (score >= 140)
			if (score <= 199)
			outputFile.println("*a score of " +score + " is a very good game score");
		if (score >= 100)
			if (score <= 139)
			outputFile.println("*a score of " +score + " is a good game score");
		if (score >= 50)
			if (score <= 99)
			outputFile.println("*a score of " +score + " is a poor game score");
		if (score < 50 )
			outputFile.println("*a score of " +score + " is a horrible game score");
		
	}

	/* Method oneGamescore2()
	 * Input:
	 *  score2 - an integer to be tested
	 * Process:
	 * converts scores into a rating
	 * Output:
	 *  prints the original score and the rating for the score
	 */

	public static void oneGamescore2(int score2, PrintWriter outputFile) 
	{
		if (score2 >= 250)
			outputFile.println("*a score of " +score2 + " is a Professional game score");
		if (score2 >= 200)
			if (score2 <= 249)
			outputFile.println("*a score of " +score2 + " is an excellent game score");
		if (score2 >= 140)
			if (score2 <= 199)
			outputFile.println("*a score of " +score2 + " is a very good game score");
		if (score2 >= 100)
			if (score2 <= 139)
			outputFile.println("*a score of " +score2 + " is a good game score");
		if (score2 >= 50)
			if (score2 <= 99)
			outputFile.println("*a score of " +score2 + " is a poor game score");
		if (score2 < 50 )
			outputFile.println("*a score of " +score2 + " is a horrible game score");
		
	}

	
	/* Method oneGamescore3()
	 * Input:
	 *  score3 - an integer to be tested
	 * Process:
	 * converts scores into a rating
	 * Output:
	 *  prints the original score and the rating for the score
	 */

	public static void oneGamescore3(int score3, PrintWriter outputFile) 
	{
		if (score3 >= 250)
			outputFile.println("*a score of " +score3 + " is a Professional game score");
		if (score3 >= 200)
			if (score3 <= 249)
			outputFile.println("*a score of " +score3 + " is an excellent game score");
		if (score3 >= 140)
			if (score3 <= 199)
			outputFile.println("*a score of " +score3 + " is a very good game score");
		if (score3 >= 100)
			if (score3 <= 139)
			outputFile.println("*a score of " +score3 + " is a good game score");
		if (score3 >= 50)
			if (score3 <= 99)
			outputFile.println("*a score of " +score3 + " is a poor game score");
		if (score3 < 50 )
			outputFile.println("*a score of " +score3 + " is a horrible game score");
		
	}
	
	
	/* Method avg3scores()
	 * Input:
	 *  score1 - an integer to be tested
	 *  score2 - an integer to be tested
	 *  score3 - an integer to be tested 
	 * Process:
	 *  finds the average of the three scores by adding them together first and then dividing them by 3
	 * Output:
	 *  the average of the three scores
	 */

	public static int avg3scores(int score1, int score2, int score3) 
	{
		
		return (score1+score2+score3)/3;
		
		
	}

	/* Method validGroup()
	 * Input:
	 *  score1 - an integer to be tested
	 *  score2 - an integer to be tested
	 *  score3 - an integer to be tested 
	 * Process:
	 *  tests if each integer is in the range from 0 to 300 
	 *  test if each integer is negative or not
	 * Output:
	 *  returns true or false indicating the validity of the group
	 *  if group is invalid, method prints score and why is it invalid
	 */

	public static boolean validgroup(int score1,int score2,int score3, PrintWriter outputFile) 
	{			
		if(score1 < 0)
			return false;
		if(score1 > 300)
			return false;
		if(score2 < 0)
			return false;
		if(score2 > 300)
			return false;
		if(score3 < 0)
			return false;
		if(score3 > 300)
			return false;
		return true;
	}
	
	
}