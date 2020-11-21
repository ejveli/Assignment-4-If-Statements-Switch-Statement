package Assignment_4;

public class Question_7 {

	/*
	 * Write a program that lets the user declare a number in seconds.
	 * 
	 * There are 60 seconds in a minute. If the number of seconds is greater than or
	 * equal to 60, the program should display the number of minutes in that many
	 * seconds. There are 3600 seconds in an hour. If the number of seconds is
	 * greater than or equal to 3600, the program should display the number of hours
	 * in that many seconds. There are 86400 seconds in a day. If the number of
	 * seconds is greater than or equal to 86400, the program should display the
	 * number of days in that many seconds.
	 */

	public static void main(String[] args) {

		int second = 1000000;

		if (second >= 60) {

			System.out.println(second + " secons is " + second / 60 + " minutes");
		}
		if (second >= 3600) {

			System.out.println(second + " secons is " + second / 3600 + " hours");
		}
		if (second >= 86400) {

			System.out.println(second + " secons is " + second / 86400 + " days");
		}

	}
}
