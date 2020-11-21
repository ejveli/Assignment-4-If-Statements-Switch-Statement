package Assignment_4;

import java.util.Scanner;

public class Question_12 {

	/*
	 * An internet service provider has three different subscription packages for
	 * its customers:
	 * 
	 * Package A: For $9.95 per month 10 hours of access are provided. Additional
	 * hours are $2.00 per hour
	 * 
	 * Package B: For $13.95 per month 20 hours of access are provided. Additional
	 * hours are $1.00 per hour
	 * 
	 * Package C: For $19.95 per month unlimited access is provided
	 * 
	 * Write a program that calculates a customer's monthly bill. It should let the
	 * user declare the letter of the package the customer has purchased (A, B, or
	 * C) and the number of hours that were used. It should then display the total
	 * charges.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your package (A/B/C):");
		String pack = scan.next();

		System.out.print("Enter number of hours:");
		double hour = scan.nextDouble();

		double bill = 0;

		if (pack.equals("A")) {

			bill = 9.95+(hour-10)*2;

		} else if (pack.equals("B")) {

			bill = 13.95+(hour-20)*2;

		} else if (pack.equals("C")) {

			bill = 19.95;
		}

		System.out.println("Total charges: " +bill);
	}
}
