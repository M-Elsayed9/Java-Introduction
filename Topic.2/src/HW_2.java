/*Mohamed Elsayed
/*HW-2 
*/
public class HW_2
{
	public static void main(String[] args)
	{
		//declare real number variables
		double x, y;
		int numemp;
		numemp = 0;

		//print the headings
		System.out.println("This is the output of your first program\n");
		System.out.println();
		System.out.println("\t\tThe Corresponding Values of Y(x)");
		System.out.println();
		System.out.println("The Value of X\t\tThe Value of Y\t\tNegative/positive/Zero");

		//use for loop to iterate the process
		for (x = -3.00; x <= 4.00; x += 0.50)
		{
			//calculate the result
			y = (9*(x*x*x)-27*(x*x)-4*x+12)/(Math.sqrt(3*(x*x)+1)+Math.abs(5-x*x*x*x));
	    	
			//print the results to center width and precision
			System.out.printf("%9.1f%25.3f", x,y);

			//determine if y is equal to negative, positive or zero
			if (y == 0)
				System.out.print("\t\t     Y IS ZERO");
			if (y > 0)
				System.out.print("\t\t     Y IS POSITIVE");
			if (y < 0)
				System.out.print("\t\t     Y IS NEGATIVE");
			
			numemp++;

			//go to next line
			System.out.println();
		}
		System.out.println("\nThe Table is finished!");
		System.out.println("\nwe have proccssed " + numemp + " Value");
	}
}