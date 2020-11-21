package Assignment_4;

import java.util.Scanner;

public class Question_6 {

	/*
	 * Scientists measure an object's mass in kilograms and its weight in Newton. If
	 * you know the amount of mass that an object has, you can calculate its weight,
	 * in Newtons, with the following formula:
	 * 
	 * Weight = Mass * 9.8
	 * 
	 * Write a program that asks the user to enter an object's mass, and then
	 * calculate its weight. If the object weighs more than 1000 Newtons, display a
	 * message indicating that it is too heavy. If the object weighs less than 10
	 * Newtons, display a message indicating that the object is too light.
	 * 
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an object's mass");
		int mass = input.nextInt();
		
		double weight = mass * 9.8;

		if (weight>1000) {
			System.out.println("Object is too heavy");

		}else if(weight<10) {
			
			System.out.println("Object is too light");
			
		}

	}
}
