package Assignment_4;

public class Question_15 {
	/*
	 * Write a switch-case program:
	 * 
	 * 1- Declare a number
	 * 
	 * 2- IF the number is 0,1 or 2 print Low Number. IF the number is 3,4,5 print "Medium Number". 
	 * IF the number is is not between 0-5 then print "Other Number"
	 */
	public static void main(String[] args) {

		int number = 56;

		switch (number) {
		case 0:
			System.out.println("Low Number");
			break;
		case 1:
			System.out.println("Low Number");
			break;
		case 2:
			System.out.println("Low Number");
			break;
		case 3:
			System.out.println("Medium Number");
			break;
		case 4:
			System.out.println("Medium Number");
			break;
		case 5:
			System.out.println("Medium Number");
			break;
		default:
			System.out.println("Other Number");

			switch (number) {

			}
		}
	}
}
