
public class pgm5_03testMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p,q;
		
		p=10;
		q=-7;
		System.out.println(max3(p+2, 12, Math.abs(q) * 3));
	}
	// method to find the largest of three integers a,b,c
	public static int max3(int a, int b, int c)
	{
		int maxSofar;			//maxSoFar is a local variable
		
		//find the larger of a and b
		if (a >= b)
			maxSofar = a;
		else 
			maxSofar = b;
		
		//compare maxSofar with c
		if (maxSofar < c)
			return  (c);
		else 
			return(maxSofar);
		
		
	}
}
