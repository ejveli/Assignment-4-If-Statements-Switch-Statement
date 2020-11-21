package Assignment_4;

import java.util.Scanner;

public class Question_14 {

	/*
	 ABC Booksellers has a book club that awards points to its customers
	 based on the number of books purchased each month. T
	 he points are awarded as follows:

		If a customer purchases 0 books, he or she earns 0 points.
		If a customer purchases 1 book, he or she earns 5 points.
		If a customer purchases 2 books, he or she earns 15 points.
		If a customer purchases 3 books, he or she earns 30 points.
		If a customer purchases 4 books or more books, he or she earns 60 points.
		
Write a program that lets the user declare the number of books
that he or she has purchased this month and then display the number of points awarded.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of books that are purchased:");
		int books = scan.nextInt();

		int point = 0;

		switch(books) {
		
		case 0:
			break;
			
		case 1:
			point+=5;
			break;
			
		case 2:
			point+=15;
			break;
			
		case 3:
			point+=30;
			break;
			
		case 4:
			point+=60;
			break;
			
			default:
				point+=60;
				
		}

		System.out.println("Total points: " +point);
	}
}
