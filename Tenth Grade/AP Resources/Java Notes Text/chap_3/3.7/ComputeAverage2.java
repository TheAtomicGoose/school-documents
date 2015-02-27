/*
 * This program computes the average of numbers entered by the user. This
 * version uses a try...catch statement to catch when an illegal argument
 * is entered.
 *
 * Copied from http://math.hws.edu/javanotes/c3/s7.html on 02-26-2015 by
 * Jesse Evers. Modified to use the Scanner class instead of TextIO.
 */

import java.util.Scanner;

public class ComputeAverage2 {

	public static void main(String[] args) {

		String str;  // The user's input
		Scanner stdin;
		double number;  // The input converted into a number
		double total;  // The total of all numbers entered
		double avg;  // The average of the numbers
		int count;  // The number of numbers entered
		total = 0;
		count = 0;

		stdin = new Scanner(System.in);

		System.out.println("Enter your numbers, press return to end.");
		while (true) {
			str = stdin.nextLine();
			if (str.equals("")) {
				break;  // Exit the loop since the input line was blank
			}
			try {
				number = Double.parseDouble(str);
				// If an error occurs, the next 2 lines are skipped
				total = total + number;
				count = count + 1;
			}
			catch (NumberFormatException e) {
				System.out.println("Not a legal number! Try again.");
			}
		}
		avg = total/count;
		System.out.printf("The average of %d numbers is %1.6g%n", count, avg);
	}
}
