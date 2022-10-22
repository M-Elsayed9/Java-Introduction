//program to illustrate iteration 
public class pgm1_5forloop {

	public static void main(String[] args) {
		//declare some variables
		int number, sqnumber;
		
		//use a for loop to iterate the values of number 
		for(number = 4; number <= 8; number = number + 1) {
			sqnumber = number * number;
			System.out.println("number = " + number + " sqnumber = " +sqnumber);
		}

	}

}