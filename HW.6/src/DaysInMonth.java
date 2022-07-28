import java.util.Scanner;	

//class with the main method

public class DaysInMonth {

	public static void main(String[] args) throws Exception {
	
		//input/output variables
		int month;
		int year;
		int days;
		String monthName;
		
		//create a scanner object 
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a month and a year
		System.out.println("Enter a Month (1-12): ");
		month = input.nextInt();
		System.out.println("Enter a Year: ");
		year = input.nextInt();
		
		//create a new month object
		Month moName = new Month();
		
		//invoke the toString method on the moName object to the get the name of the month
		monthName = moName.toString(month);
		
		//create a new Monthdays object
		Month.MonthDays mDays = new Month.MonthDays(month,year);
		
		//initialize the days variable 
		days = mDays.getNumberOfDays(month);
		
		System.out.printf("%2s %2d has %2d days \n", monthName,year,days);
		
		input.close();
		
	}
}

//declare the class month
class Month {
	
	//declare the class fields 
	 private int monthNumber;
	 private String monthName;
	
	//declare a no argument constructor 
	public Month() {
		monthNumber = 1;
	}
	
	//declare the constructor with the month number as a parameter to set the month number
	public Month(int monthNumber) {
		
		//use exception handling to validate the input 
		try {
		if (monthNumber >= 1 && monthNumber <= 12) {
			this.monthNumber = monthNumber;
		}else {
			monthNumber = 1;
			throw new MyException("invalid Month Number");
			
		}
		} catch (Exception e){
		      System.out.println(e);
		}
		
	}
	//a constructor that accepts the name of the month 
	public Month(String monthName) {
		
		this.monthName = monthName;
		
		//set the name of the monthNumber field to the monthName		
		//use exception handling to validate input
		//use .equalsIgnoreCase method to ignore and validate the invalid month names
		try {
		if (this.monthName.equalsIgnoreCase("January")) {
         this.monthNumber = 1;
     } else if (this.monthName.equalsIgnoreCase("February")) {
         this.monthNumber = 2;
     } else if (this.monthName.equalsIgnoreCase("March")) {
         this.monthNumber = 3;
     } else if (this.monthName.equalsIgnoreCase("April")) {
         this.monthNumber = 4;
     } else if (this.monthName.equalsIgnoreCase("May")) {
         this.monthNumber = 5;
     } else if (this.monthName.equalsIgnoreCase("June")) {
         this.monthNumber = 6;
     } else if (this.monthName.equalsIgnoreCase("July")) {
         this.monthNumber = 7;
     } else if (this.monthName.equalsIgnoreCase("August")) {
         this.monthNumber = 8;
     } else if (this.monthName.equalsIgnoreCase("September")) {
         this.monthNumber = 9;
     } else if (this.monthName.equalsIgnoreCase("October")) {
         this.monthNumber = 10;
     } else if (this.monthName.equalsIgnoreCase("November")) {
         this.monthNumber = 11;
     } else if (this.monthName.equalsIgnoreCase("December")) {
         this.monthNumber = 12;
     }else { 
    	 
    	 throw new MyException("invalid Month name (january-december)");
     }
		} catch (Exception e){
		      System.out.println(e);
		}
	}
	
	// a setter method that accepts the month number to validate input
	public void setMonthNumber (int monthNumber) {
		
		if (monthNumber >= 1 && monthNumber <= 12) {
			this.monthNumber = monthNumber;
		}else {
			monthNumber = 1;
		}
	}
	
	
	//a getter method to get the month number
	public int getMonthNumber() {
		return monthNumber;
	}
	
	//a method that returns the name of the month 
	public String getMonthName(int monthNumber) {
		switch (monthNumber) {
		
		case 1 : return "January";
		case 2 : return "February";
		case 3 : return "March";
		case 4 : return "April";
		case 5 : return "May";
		case 6 : return "June";
		case 7 : return "July";
		case 8 : return "August";
		case 9 : return "September";
		case 10 : return "October";
		case 11 : return "November";
		case 12 : return "December";
		default : return "January";
         
		}
	}
	
	
	//a method that returns the monthNumber a string
	public String toString(int monthNumber) {
		return getMonthName(monthNumber);
	}
	
	
	public boolean equals(Month Num) {
		
		if (this.getMonthNumber() == Num.getMonthNumber()) {
			return true;
		}else {
			return false;
		}
	}
	
	// create a monthdays subclass 
	static class MonthDays extends Month {
		
		private int monthNumber;
		private int year;
		private int daysNum;
		
		public MonthDays(int monthNum, int yearNum) {
			
			monthNumber = monthNum;
			year = yearNum;
		}
		
		//validate if the year is a leap year and return the 
		public int getNumberOfDays(int monthNum) {
			
			if (monthNum == 2) {
				
				if ((year % 100 == 0) && (year % 400 == 0) || !(year % 100 == 0) && (year % 4 == 0)) {
					daysNum = 29;
				}else {
					daysNum = 28;
				}
				}else if (monthNum == 1 || monthNum == 3 || monthNum == 5|| monthNum == 7 
						|| monthNum == 8 || monthNum == 10 || monthNum == 12) {
					daysNum = 31;
				}else { 
					daysNum = 30;
			}
			return daysNum;
		}
	}
}

//create a my exception class to test and validate input
class MyException extends Exception { 
    public MyException(String errorMessage) {
        super(errorMessage);
    }
    public MyException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}