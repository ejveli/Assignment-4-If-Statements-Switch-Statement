package Assignment_4;

import java.util.Scanner;

public class Question_1 {
	
	/*In this formula, mass is in kilograms and height is in meters. 
	 *The health risk associated with a BMI value is

      - Underweight<18.5
      - Normal Weight>=18.5 and <25
      - Overweight>=25 and <30
      - Obese>=30

In this case study, the users input their weight in pounds and height in feet and inches.
The program then outputs the BMI and associated health risk. 
To do this we must first make our program convert from pounds to kilograms. 
One kilogram is 2.2 pounds. Additionally, the program must convert height in feet and inches to meters.
If we convert the height to all inches, then we can multiply by 0.0254 to convert inches to meters.

		Sample Output:
		Your weight in pounds:  150
		Your height in feet followed by a space then additional inches: 5 5
		Your BMI is 25.01349811736
		Your risk factory is Overweight
*/

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Your weight in pounds: ");
		double weight=input.nextDouble();
		
		System.out.println("Your height in feet followed by a space then additional inches: ");
		double heightFeet=input.nextDouble();
		double heightInche=input.nextDouble();
		
		double bmi=0.0;
		String riskFactory="";
		
		weight/=2.2;
		heightInche+=heightFeet*12;
		heightInche*=0.0254;
		
		bmi=weight/(heightInche*heightInche);
		
		if(bmi<18.5) {
			riskFactory="Underweight";
		}else if(bmi>=18.5 && bmi<25) {
			riskFactory="Normal Weight";
		}else if(bmi>=25 && bmi<30) {
			riskFactory="Overweight";
		}else riskFactory="obese";
		
		System.out.println("Your BMI is "+bmi);
		System.out.println("Your risk factory is "+riskFactory);

	}

}
