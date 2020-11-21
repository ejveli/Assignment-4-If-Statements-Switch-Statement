package Assignment_4;

import java.util.Scanner;

public class Question_11 {

	/*
	 * The following table shows the approximate speed of sound in air, water, and
	 * steel:
	 * 
	 * Medium Speed 
	 * Air 1100 feet per second 
	 * Water 4900 feet per second 
	 * Steel 16400 feet per second
	 * 
	 * Write a program that let the user declare a variable to enter "air", "water",
	 * or "steel", and distance that a sound wave will travel in the medium. The
	 * program should then display the amount of time it will take. You can
	 * calculate the amount of time it takes sound to travel in the air with the
	 * following formula:
	 * 
	 * Time=Distance/1100
	 * 
	 * You can calculate the amount of time it takes sound to travel in water with
	 * the following formula:
	 * 
	 * Time=Distance/4900
	 * 
	 * You can calculate the amount of time it takes sound to travel in steel with
	 * the following formula:
	 * 
	 * Time=Distance/16400
	 */

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter air/water or steel:");
		String travel=scan.next();
		
		System.out.print("Enter distance(feet):");
		double distance=scan.nextDouble();
		
		double time=0;
		
		if (travel.equals("air")) {
			
			time=distance/1100;
			
		}else if (travel.equals("water")) {
			
			time=distance/4900;
			
		}else if (travel.equals("steel")) {
			
			time=distance/16400;
		}
		
		System.out.println("Sound  travels " +distance+" feet"+" in the "+travel+" in :"+time+" seconds");
	}	
}
