import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class WordCount {

	public static void main(String[] args) throws Exception {
		 
		//validate input is a file 
		try {
		//run a for loop to recieve the file name through the terminal
        for (int i = 0; i < args.length; i++) {
        
        	   System.out.print("File Name: (" + args[i] + ") : \n");
        	 
        	   //call the methods to count 
        	   countWords(args[i]);
        	   countLines(args[i]);
        	   countChar(args[i]);
        	}
		}catch (FileNotFoundException err) {
			
			System.err.println("File Not Found");
			System.err.println("Enter the correct File name or directory");
			
		}
		//notify the use the program has terminated 
        System.out.println("Program Terminated");
		
	}
	
	//the count words method to count the words in a file
	public static void countWords(String fileName) throws Exception{
		
		String line;
		int wordCount = 0;
		
		BufferedReader input = new BufferedReader(new FileReader(fileName));
		
		 //Gets each line till end of file is reached  
        while((line = input.readLine()) != null) {
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            wordCount = wordCount + words.length;  
        }  
        
        //display the counting result
        System.out.println("Number of words: " + wordCount);  
        input.close();
	}
	
	//countLines method to count the lines in a file
	public static void countLines(String fileName) throws Exception {
         
		String line;
		int lineCount = 0;      // Number of lines in the file.
	     
		BufferedReader input = new BufferedReader(new FileReader(fileName) );
	      
		while ((line = input.readLine()) != null) {
	        //split lines and store them into the array	 
			String lines[] = line.split("\n");
			lineCount+= lines.length;              // Count this line.
	                   
	         }
	         
		//display the counting result
		System.out.println("Number of Lines: " + lineCount);
	      
	    input.close();
	   } 
	
	//cout char method to count the chrachters in the file
	public static void countChar(String fileName) throws Exception {
		String line;
		int charCount = 0;
		
		BufferedReader input = new BufferedReader(new FileReader(fileName));
		
		while((line = input.readLine()) != null) {
			
			//divide the line to spaces
			charCount += line.length();
		}
		
		//display the counting result
		System.out.println("Number of Charachters: " + charCount);
		
		input.close();
	}
}
