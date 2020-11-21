package Assignment_4;

import java.util.Scanner;

public class Question_13 {

	/*
	 * A bank charges a base fee of $10 per month, plus the following check fees for
	 * a commercial checking account:
	 * 
	 * $.10 each for less than 20 checks
	 * 
	 * $.08 each for 20-39 checks
	 * 
	 * $.06 each for 40-59 checks
	 * 
	 * $.04 each for 60 or more checks
	 * 
	 * Write a program that lets the user declare the number of checks written for
	 * the month. The program should then calculate and display the bank's service
	 * fees for the month.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of checks:");
		double check = scan.nextDouble();

		double fees = 10;

		if (check < 20) {

			fees += 0.1 * check;

		} else if (check >= 20 && check <= 39) {

			fees += 0.08 * check;

		} else if ((check >= 40 && check <= 59)) {

			fees += 0.06 * check;
		} else {
			fees += 0.04 * check;
		}

		System.out.println("Service fees for the month: " + fees);
	}
}
