import javax.swing.JOptionPane;

public class pgm3_2payroll_dialogbox {

	public static void main(String[] args) {
		//declare variables
		int id;	             			//employee id
		double hours,rate,pay;			//payroll variables
		int numemp = 0;	      			//count the employees
		String input;        			//line of input from dialog box
	    
		//prompt the user to enter an ID
		input = JOptionPane.showInputDialog("Please enter an ID (enter -1 to stop): ");
		
		//convert the input to an integer
		id = Integer.parseInt(input);						
		
		while (id != -1) {				//check for fake ID
			//prompt for, read, and convert the hours worked
			input = JOptionPane.showInputDialog("Please enter the hours worked: ");
			hours = Double.parseDouble(input);						

			//prompt for,read, and convert the rate of pay
			input = JOptionPane.showInputDialog("Please enter rate of pay: ");
			rate = Double.parseDouble(input);						

			//calculate the gross pay
			pay = hours * rate;
			
			//print employee payroll information
/**/
			JOptionPane.showMessageDialog(null, "Employee " + id + " worked " + hours + 
				" hours at a rate of pay of $" + rate + " earning $" + pay);
/**			
			String str = String.format("Employee %d worked %.1f hours at a rate of pay of $%.2f"
				+ " earning $%.2f\n", id,hours,rate,pay);
			JOptionPane.showMessageDialog(null,str); 
/**			
			JOptionPane.showMessageDialog(null, 
				String.format("Employee %d worked %.1f hours at a rate of pay of $%.2f"
					+ " earning $%.2f\n", id,hours,rate,pay));
/**/		    
			//increment the employee counter
			numemp++;
	        
			//prompt for, enter, and convert the next ID
			input = JOptionPane.showInputDialog("Please enter an ID (enter -1 to stop): ");
			id = Integer.parseInt(input);						
		}
		JOptionPane.showMessageDialog(null, "We have processed " + numemp + " employees");
		
		//terminate the program - required if using dialog boxes
		System.exit(0);
		
	}

}