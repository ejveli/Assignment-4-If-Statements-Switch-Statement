package Assignment_4;

import java.util.Scanner;

public class Question_3 {

	/*
	 * Any year is input by the user. Write a program to determine whether the year
	 * is a leap year or not. Leap Years are any year that can be evenly divided by 4.
	 * A year that is evenly divisible by 100 is a leap year only if it is also
	 * evenly divisible by 400.
	 * 
	 * Example :
	 * 1992 Leap Year
	 * 2000 Leap Year 
	 * 1900 NOT a Leap Year
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if(year %4==0 && year %100!=0 ) {
			System.out.println("Leap Year");
		}else if(year%400==0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("NOT a Leap Year");
				}
	}
}

