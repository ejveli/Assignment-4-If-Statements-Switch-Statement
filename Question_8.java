package Assignment_4;

public class Question_8 {

	/*
	 A software company sells a package that retails for $99. 
	 Quantity discounts are given according to the following table:

		Quantity		Discount
		10-19			20%
		20-49			30%
		50-99			40%
		100 or more		50%
		
	Write a program that lets the user declare the number of packages purchased.
	The program should then display the amount of discounts(if any) 
	and the total amount of the purchase after discount.
	 */

	public static void main(String[] args) {

		int pakages=150;
		double totalAmount=0;
		
		
		if(pakages>=10 && pakages<=19) {
			totalAmount=pakages*99*0.80;
			
		}else if(pakages>=20 && pakages<=49) {
			totalAmount=pakages*99*0.70;
			
		}else if(pakages>=50 && pakages<=99) {
			totalAmount=pakages*99*0.60;
			
		}else if(pakages>=100){
			totalAmount=pakages*99*0.50;
		}
		
		System.out.println("Total amount of the purchase: "+"$"+totalAmount);
	}
}
