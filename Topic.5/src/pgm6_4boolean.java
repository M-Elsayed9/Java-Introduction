// program to illustrate data type boolean

public class pgm6_4boolean {

	public static void main(String[] args) {
		//variable declarations
		int x=4, y=0, z=1;
		boolean cond;

		if (x < y || z >= x && x != 0)
			System.out.println("it is true");
		else
			System.out.println("it is false");

		cond = (x < y - 1) || (y + z >= x) && (x != 0);
		System.out.println("cond = " + cond);

		x=-4;

		cond = (x < y - 1) || (y + z >= x) && (x != 0);
		System.out.println("cond = " + cond);

/*****************************************************/
		
		int a = 2, b = 4, c = 7, d = 4, e = 3;
		
		if (a * 2 > b || ! (c == 6) && d - 1 <= e)
			System.out.println("it is true");
		else
			System.out.println("it is false");	
	}

}