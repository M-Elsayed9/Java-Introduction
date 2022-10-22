//Mohamed Elsayed
//HW-1
//Write a program that prints the numbers from 1 to 100 with five values per line
public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mohamed Elsayed");
		
		//Declare variables
				int A , B , C , D , E;
				
				// using a for loop to iterate the values of number 
				for(A = 1 , B = 2 , C = 3 , D = 4 , E = 5; A <= 100; A = A + 5 ,
						B = B + 5 , C = C + 5, D = D + 5 , E = E + 5) {
					System.out.println(A + "  " + B + "  " + C + "  " + D + "  " + E);
					
				}
	}

}
