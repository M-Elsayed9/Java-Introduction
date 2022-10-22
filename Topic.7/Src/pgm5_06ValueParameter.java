// program to try to add one to a function parameter
// illustrate pass by value

public class pgm5_06ValueParameter
{
	public static void main(String[] args)
	{
		//variable declaration
		int k = 5;

		//print value of k before calling the method trytoadd1()
		System.out.println("in main - before call: " + k);
	    
		//call the method tryToAdd1()
		tryToAdd1(k);
	    
		//print value of k after calling the method trytoadd1()
		System.out.println("in main - after call: " + k);
	}
	
	/* Method tryToAdd1()
	 * Input:
	 *  x - passed integer - value parameter
	 * Process:
	 *  adds 1 to its parameter x
	 * Output:
	 *  prints x before and after adding 1 to it
	 */
	//method to try and add 1 to its parameter 
	public static void tryToAdd1(int x)
	{
		//print value of x before adding 1
		System.out.println("in method - before adding: " + x);
	    
		//add 1 to the parameter
		x++;
	    
		//print value of x after adding 1
		System.out.println("in method - after adding: " + x);
	}
}