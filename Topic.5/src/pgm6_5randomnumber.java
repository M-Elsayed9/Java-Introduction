import java.util.Random;

public class pgm6_5randomnumber {

	public static void main(String[] args) {
		int num1, num2;
		
		//create a Random object
		Random randomNumber = new Random();
		
		do {
			//generate random numbers between 1 and 6
			num1 = randomNumber.nextInt(6) + 1;
			num2 = randomNumber.nextInt(6) + 1;
			System.out.println(num1 + " " + num2);
		} while(num1+num2 != 7);

	}

}