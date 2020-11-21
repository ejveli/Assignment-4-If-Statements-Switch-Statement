package Assignment_4;

public class Question_10 {

	/*
	 The Fast Freight Shipping Company charges the following rates:
	 
		Weight of Package							Rate per 500 Miles Shipped
		2 pounds or less							$1.10
		Over 2 pounds but not more than 6 pounds	$2.20
		Over 6 pounds but not more than 10 pounds	$3.70
		Over 10 pounds	$3.8
		
The shipping charges per 500 miles are not prorated. 
For example, if a 2-pound package is shipped 550 miles, the charges would be $2.20.
Write a program that lets the user declare the weight of a package and then displays the shipping charges.
	 */

	public static void main(String[] args) {

		int pakageWeight=10;
		
		
		double shippingCharge=0;
		
		if(pakageWeight<=2) {
			shippingCharge = pakageWeight*1.1;
			
		}else if(pakageWeight>2 && pakageWeight<=6) {
			shippingCharge = pakageWeight*2.2;
			
		}else if(pakageWeight>6 && pakageWeight<=10) {
			shippingCharge = pakageWeight*3.7;
			
		}else if(pakageWeight>10){
			shippingCharge = pakageWeight*3.8;
		}
		
		
		
		System.out.println("Total shipping charges: "+"$"+shippingCharge);
	}
}
