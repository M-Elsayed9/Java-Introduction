import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.PrintStream;
import java.io.IOException;

public class Hw7 {

	public static void main(String[] args) throws IOException {
		
		//declare input variables
		String carMake;
		int yearModel = 0;
		
		//program variables
		int currMileage;
		double currFuel = 0;
		int maxSpeed = 70;
		int currSpeed = 0;
		String error;
		
		//create a scanner object and attach it to system.in
		Scanner input = new Scanner(System.in);
		
		//prompt the use to enter the car make
		System.out.println("Enter the Car Make: ");
		carMake = input.next();
		
		PrintStream output = new PrintStream(carMake.concat(".txt"));
		
		while (yearModel < 1886 || yearModel > 2022) {
		//prompt the user to enter model year and validate input
		try {	
			System.out.println("Enter the Model Year (1886-2022): ");
			yearModel = input.nextInt();
		
			if (yearModel >= 1886 && yearModel <= 2022) {
				yearModel = yearModel;
			}else if(yearModel < 1886 || yearModel > 2022) {
				System.err.println("(" + yearModel + ") invalid input");
				System.err.println("Enter a year between 1886 -2022");
				System.out.println("Enter the Model Year (1886-2022): ");
				yearModel = input.nextInt();
			}
		}catch (InputMismatchException err) {
			error = input.nextLine();
			System.err.println("(" + error + ") invalid input");
			System.err.println("Enter digits only");
			System.out.println("Enter the Model Year (1886-2022): ");
			yearModel = input.nextInt();
		}
		}
		//create a new car object and attach the input values to it
		Car car = new Car(yearModel,carMake);
		output.println("Car make: " + car.getMake() + "\nYear Model: " + car.getYearModel());
		//System.out.println("\nCar make: " + car.getMake() + "\nYear Model: " + car.getYearModel());
		
		//create a fuel gauge object
		Car.FuelGauge fuel = new Car.FuelGauge();
		Car.Odometer odometer = new Car.Odometer(0,fuel);
		
		//filling the  car Tank
		for(int x = 0; x < fuel.max_gallons; x++) {
			
			fuel.addFuel();
			currFuel = fuel.getGallons();
		}
		
		//display the current tank level and mileage 
		output.println("Full Tank at: " + currFuel + " Gallons");
		output.println("initial mileage: " + odometer.getMileage() + " Mile\n");
		//System.out.println("Full Tank at: " + currFuel + " Gallons");
		//System.out.println("initial mileage: " + odometer.getMileage() + " Mile\n");
		
		//empty out the tank 
		while(fuel.getGallons() > 0 ) {
			
			//keep speeding until the car reaches max speed and then brake
			//display the current speed after braking
			currSpeed = car.getSpeed();
			if(currSpeed == maxSpeed-5) {
				car.brake();
				output.println("Current Speed: " + car.getSpeed() + " MPH");
				//System.out.println("Current Speed: " + currSpeed + " MPH");
				} else if (currSpeed < maxSpeed) {
					car.accelerate();
					if(currSpeed == 0) {
						output.println("Current Speed: " + car.getSpeed() + " MPH");
					}
				}
				
			//increase the mileage and display the current mileage consistently 
			odometer.addMileage();
			
			currMileage = odometer.getMileage();
			output.println("Mileage: " + currMileage);
			//System.out.println("Mileage: " + currMileage);
			
			currFuel = fuel.getGallons();
			// Display the amount of fuel.
			output.printf("Fuel level:  %.2f %s",  currFuel, " gallons\n");
			output.println("------------------------------");
	       // System.out.printf("Fuel level:  %.2f %s",  currFuel, " gallons\n");
	        //System.out.println("------------------------------");
			
	        //create a loop to stop the car 
	        if(currFuel <= 1.81 && currFuel > 0) {
	        	
	        	//System.out.println("Car Stopped! - Empty Tank");
	        	for(int i = 2; i <= currSpeed/5; i++) {
	        		car.brake();
	        		output.println("Current Speed: " + car.getSpeed() + " MPH");
	        		
	        		//increase the mileage and display the current mileage consistently 
	    			if(currFuel != 0) {
	        		odometer.addMileage();
	    			}
	    			currMileage = odometer.getMileage();
					output.println("Mileage: " + currMileage);
					//System.out.println("Mileage: " + currMileage);
					
					currFuel = fuel.getGallons();
					// Display the amount of fuel.
					output.printf("Fuel level:  %.2f %s",  currFuel, " gallons\n");
					
					if(currFuel != 0) {
	        			output.println("-Low Fuel!");
	        		}else if( currFuel == 0) {
		        			output.println("-Empty Tank!");
	        		}
					output.println("------------------------------");
			       // System.out.printf("Fuel level:  %.2f %s",  currFuel, " gallons\n");
			        //System.out.println("------------------------------");
	        	}
	        }	
		}
		
		//notify the user the program has terminated
		System.out.println("\nProgram terminated\nPlease refer to the output file (" + carMake.concat(".txt)"));
		
		//close the input file
		input.close();
	}
}

//write the definition of the super class car 
class Car {
	
	//car fields
	private int yearModel;
	private String make = "";
	private int speed;
	
	//define a super constructor with no arguments to be able to call the subclasses
	public Car() {
		
		this.make = "";
	}
	
	public Car(int yearModel, String make) {
		
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	
	//accessors methods
	// getters and setters
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	
	public int getYearModel() {
		return yearModel;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	//make getter
	public String getMake() {
		return make;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//speed getter
	public int getSpeed() {
		return speed;
	}
	
	//method accelerate
	public void accelerate() {
		speed += 5;
	}
	
	//method brake
	public void brake() {
		if(this.speed > 0) {
		speed -= 5;
		//reduce fuel
		FuelGauge.setGallons(FuelGauge.getGallons() - Math.random()*0.30);
		}
	}
	
	//FuelGauge sub class
	static class FuelGauge extends Car {
		
		//fuelgauge fields 
		private static double gallons;
		final int max_gallons = 15;
		
		//fuelgauge constructor 
		public FuelGauge() {
			setGallons(0);
		}
		
		public FuelGauge(int gallons) {
			
			if(gallons < 0) {
				setGallons(0);
			}else if (gallons <= max_gallons && gallons >= 0) {
				setGallons(gallons);
			}else {
				gallons = max_gallons; 
			}
		}
		// getters and setters
		public static void setGallons(double gallons) {
			FuelGauge.gallons = gallons;
		}	
		
		public static double getGallons() {
			if (gallons < 0) {
				return 0;
			}
			return gallons;
		}
		
		//add fuel method that adds 1 gallons each time
		public void addFuel() {
			
			if(getGallons() < max_gallons) {
				setGallons(getGallons() + 1);
			}else {
				System.out.println("Full Tank");
			}
		}
		
		public static void burnFuel() {
				setGallons(getGallons() - 1);
				setGallons(getGallons() - Math.random()*0.50);
		}
	}
	
	//define the subclass odometer 
	static class Odometer extends Car {
		
	    // Constant for the miles-per-gallon
	    public static final int MPG = 24;
	    // Constant for the maximum mileage
	    public static final int Max_Mileage = 999_999;
	    private static int startMileage;
	    private static int mileage;

	    // Field to reference a FuelGauge object
	    private static FuelGauge fuel;

	    /// Constructor, Initial mileage A reference to a FuelGauge object.
	    public Odometer(int mileage, FuelGauge fuel) {
	        setStartMileage(mileage);
	        setMileage(mileage);
	        setFuel(fuel);
	    }
	    // getters and setters
	    public static void setMileage(int mileage) {
			Odometer.mileage = mileage;
		}
	    
	   
	    public static int getMileage() {
	        return mileage;
	    }


	    public static void setStartMileage(int startMileage) {
			Odometer.startMileage = startMileage;
		}
	    
		public static int getStartMileage() {
			return startMileage;
		}


		public static FuelGauge getFuel() {
			return fuel;
		}

		public static void setFuel(FuelGauge fuel) {
			Odometer.fuel = fuel;
		}
		
		/**The addMileage method increments the mileage field and burn fuel. If mileage
	     * exceeds the maximum amount it set the mileage to 0 
	     */
	    public void addMileage() {

	        if (getMileage() < Max_Mileage) {
	            setMileage(getMileage() + 1);
	        } else {
	            setMileage(0);
	        }
	        
	        int mileageDriven = getStartMileage() - getMileage();
	        if (mileageDriven % MPG == 0) {
	            getFuel();
				FuelGauge.burnFuel();
	        }
	    }
	}
}