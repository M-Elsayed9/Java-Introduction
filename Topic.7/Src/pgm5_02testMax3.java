
public class pgm5_02testMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variable
		int x,y,z,ans;
		
		x=3;
		y=5;
		z=7;
		ans=max3(x,y,z);
		System.out.println(ans);
	}
	//method to calculate the largest(max) of three integers 
	public static int max3(int a,int b, int c)
	{
		int maxSofar;
		
		//find the larger of a and b 
		if (a >= 3)
			maxSofar = a;
		else
			maxSofar = b;
		
		//now compare maxSofar to c 
		if (maxSofar < c)
			maxSofar = c;
		return (maxSofar);
	}
}
