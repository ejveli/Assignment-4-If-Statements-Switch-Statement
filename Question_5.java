package Assignment_4;

import java.util.Scanner;

public class Question_5 {

	/*
	 Write a Java program to calculate the monthly telephone bills as per the following rule: 
	 
		Minimum $200 for up to 100 calls. 
		Plus $0.60 per call for the next 50 calls. 
		Plus $0.50 per call for the next 50 calls. 
		Plus $0.40 per call for any call beyond 200 calls.
		
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int day= input.nextInt();
		int year = input.nextInt();
		 
		if(year==day*month) {
			
			System.out.println("The "+day+"/"+month+"/"+year+" is magic");
		}else {
			System.out.println("The "+day+"/"+month+"/"+year+" is not magic");
		}
		
	}
}

