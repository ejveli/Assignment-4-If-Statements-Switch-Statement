package Assignment_4;

import java.util.Scanner;

public class Question_2 {
	
	/*
	 * Tax Calculator:

    - Let user enter his income

    - Calculate the tax amount according to below table

    - Print the tax amount

		Income	Tax Ratio
		
		income ≤150,000,000		%25
		income ≤ 300,000,000	%30
		income ≤ 600,000,000	%35
		income ≤ 1,200,000,000	%40
		income > 1,200,000,000	%50
		
		Sample Output-1
		Your Income : 1500
		The tax amount you have to pay : 375.0
*/

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		long income=input.nextLong();
	
		
		
		if(income<=150_000_000) {
			System.out.println(income*0.25);
		
		}else if(income<=300_000_000) {
			System.out.println(income*0.30);
		
		}else if(income<=600_000_000) {
			System.out.println(income*0.35);
			
		}else if(income<=1_200_000_000) {
			System.out.println(income*0.40);
			
		}else if(income>=1_200_000_000) {
			System.out.println(income*0.50);
			
		}
	}

}
