//needed in order to use the Scanner class
import java.util.Scanner;

public class pgm3_3tax {

	public static void main(String[] args) {
		//declare variables
		int id;	                         		//employee id
		double hours,rate,pay,tax,netpay;		//payroll variables
		int numemp = 0;                  		//count the employees

		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);		//keyboard is a Scanner reference variable
		
		//prompt the user to enter an ID
		System.out.print("Please enter an ID (enter -1 to stop): ");
		
		//read the id
		id = keyboard.nextInt();						
		
		while (id != -1) {               		//check for fake ID
			//prompt for and read the hours worked
			System.out.print("Please enter the hours worked: ");
			hours = keyboard.nextDouble();						

			//prompt for and read the rate of pay
			System.out.print("Please enter rate of pay: ");
			rate = keyboard.nextDouble();						

			//calculate the gross pay
			pay = hours * rate;
/**/			
			//calculate the tax
			if (pay < 300)
				tax = 0.15 * pay;
			else
				tax = 0.28 * pay;
/**				
			tax = (pay < 300) ? (0.15 * pay) : (0.28 * pay);
/**/			
			//calculate the net pay
			netpay = pay - tax;

			//print employee payroll information
			System.out.printf("\nEmployee %d worked %.1f hours at a rate of pay of $%.2f"
				+ " earning $%.2f\n", id,hours,rate,pay);
			System.out.printf("tax withheld was $%.2f leaving net pay of $%.2f\n",
				tax,netpay);
			System.out.println();
	        
			//increment the employee counter
			numemp++;
	        
			//prompt for and enter the next ID
			System.out.print("Please enter an ID (enter -1 to stop): ");
			id = keyboard.nextInt();						
		}
		System.out.println("\nWe have processed " + numemp + " employees");
		
		//close the keyboard
		keyboard.close();
	}
}