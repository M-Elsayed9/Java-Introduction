import java.time.*;
import java.time.format.DateTimeFormatter;

public class arrayMethods {

	public static void main(String[] args) {
		
		//call the basicArray method to print its content
		System.out.println("The basic array method output:\n");
		basicArray();
		
		
		//create the string array 
		String[] str = {"first", "second", "third", "fourth", "fifth", "sixth",
				"seventh", "eighth", "nineth", "tenth"};
		
		
		//use the first print elements method to print the elements of the str array 
		System.out.println("\nThe first printElements strings array method output:\n");
		printElements(str);
		
		//create and initialize the values 2d array
		int[][] values = {
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
				{21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40},
				{41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60},
				{61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80},
				{81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100},
				{101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120},
				{121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140},
				{141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160},
				{161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180},
				{181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200}	
		};
		
		System.out.println("\nThe second printElements 2D array method output:\n");
		
		//write statements to print the number of rows and columns
		System.out.println("The number of rows = " + values.length);
		System.out.println("The number of columns = " + values[0].length + "\n");
		
		//call the second print element method to print the matrix
		printElements(values);
		
		//create a time type array and initialize it
		LocalTime[] times = new LocalTime[3];
		times[0] = LocalTime.now();
		times[1] = LocalTime.parse("22:45:59");
		times[2] = LocalTime.parse("11:59:59");
		
		System.out.println("\nThe third printElements time objects array method output:\n");
		//call the third printElemnts method to print the time objects array
		printElements(times);
		
	}
	//basic array method with no parameters
	public static void basicArray() {
		
		//initializing the array with 50 numbers
		int[] nums = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17,18 ,19 ,20 
				,21 ,22 ,23 ,24 ,25 ,26 ,27 ,28 ,29 ,30 ,31 ,32 ,33  ,34 ,35 
				,36 ,37 ,38 ,39 ,40 ,41 ,42 ,43 ,44 ,45 ,46 ,47 ,48 ,49,50};
		
		//getting the length of the array
		int arrayLength = nums.length;
		for(int i = 0; i < arrayLength; i++) {
				nums[i] += 10;
			//printing the array with i as index	
			System.out.println(nums[i]);
		}
	}
	
	
	//first printElements method with a string array parameter
	public static void printElements(String[] strings) {
		
		int i = 0;
		//using a for loop to fill the array
		for(i = 0; i < strings.length; i++) {
			//printing the array with i as index
			System.out.println(strings[i] + " (" + strings[i].length() + ")");
			
		}
	}
	
	//second printElements method with two dimensional array 
	public static void printElements(int[][] values1) {
		
		int i = 0,j = 0;
		
		
		 while (i != values1.length) {
			 while (j != values1[i].length) {
				 //print the formatted output to 3 spaces with a space between each element 
				 System.out.printf("%3d %s" , values1[i][j], " ");
				 j++;
			 }
			 j = 0;
			 i++;
			 System.out.println("");
		 }
	}
	
	//create the third print elements method 
	public static void printElements(LocalTime[] times1) {
		//use DateTimeFormatter to format the date output
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); 
		int i;
		
		//use a for loop to iterate 
		for(i = 0; i < times1.length; i++) {
			//convert the output to a string and print it 
			String s = String.valueOf(dtf.format(times1[i]));
			System.out.println(s);
		}
	}
}

