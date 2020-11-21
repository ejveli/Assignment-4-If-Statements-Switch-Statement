package Assignment_4;

import java.util.Scanner;

public class Question_4 {

	/*
	 Write a Java program to calculate the monthly telephone bills as per the following rule: 
	 
		Minimum $200 for up to 100 calls. 
		Plus $0.60 per call for the next 50 calls. 
		Plus $0.50 per call for the next 50 calls. 
		Plus $0.40 per call for any call beyond 200 calls.
		
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int call = input.nextInt();
		
		double bill=200.0;
		
		if(call>100 && call<=150) {
			bill+=0.6*(call-100);
		}else if(call>150 && call<=200) {
			bill+=0.6*50+0.5*(call-150);
		}else if(call>200) {
			bill+=0.6*50+0.5*50+0.4*(call-200);
		}
		
		System.out.println("Bill : "+bill);
	}
}

