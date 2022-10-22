
public class pgm5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring integers 
		int a,b,c,num;
		
		a = 5;
		b = triple(a);
		System.out.println("original value is " + a + ", its triple is " + b);
		
		num = 2;
		c = triple(num);
		System.out.println("original value is " + num + ", its triple is " + c);
		
		num = triple(a-1);
		System.out.println("origianl value is " + (a-1) + ", its triple is " + num);
		
		c = triple(4);
		System.out.println("original value is " + 4 + ", its triple is " + c);
	}
	/* method to return three times 
	 * the input parameter 'num'
	 */
	public static int triple(int num)
	{
		return (3 * num);
	}
}
