// find the sum of the first 'numberToSum' squares using a method.

//needed in order to use the Scanner class
import java.util.Scanner;

public class pgm5_04Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Public variable declaration
		int numberToSum;
		
		//Create a Scanner object to read from the keyboard
		Scanner kybd = new Scanner(System.in);
		
		System.out.print("Enter the number of squares to be summed ");
		numberToSum = kybd.nextInt();
		
		//call method to find the sum of the squares and print the results
		System.out.println(sumOfSquares(numberToSum) + " is the sum of the first " 
				+ numberToSum + " squares. ");
		 //close keyboard
		kybd.close(); 
		
	}
	
	//method to find the sum of the squares
	public static int sumOfSquares(int n)
	{
		int sum = 0; //local variable
		
		//calculate the sum of the squares 
		for (int i = 1; i <=n; i++)
			sum += (i + i);
		
		//return the sum
		return (sum);
	}
}
