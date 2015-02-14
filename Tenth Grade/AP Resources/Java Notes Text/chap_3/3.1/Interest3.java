/*
 * This class implements a simple program that will compute the amount of
 * interest that is earned on an investment over a period of 5  years. The
 * initial amount of the investment and the interest rate are each input by the
 * user. The value of the investment at the end of each year is output.
 *
 * Copied from http://math.hws.edu/javanotes/c3/s1.html. Modified to use 
 * java.util.Scanner instead of TextIO and to use user input to decide how many 
 * years to simulate the investment for. Written on 02-09-2015 by Jesse Evers.
 */

import java.util.Scanner;  // To get user input

public class Interest3 {

	public static void main(String[] args) {

		double principal;  // The value of the investment
		double rate;  // The annual interest rate
		int duration;  // The number of years to simulate the investment for
		Scanner stdin;  // The scanner for getting user input

		/* Get the initial investment and interest rate from the user. */

		stdin = new Scanner(System.in);
		System.out.print("Enter the initial investment: ");
		principal = stdin.nextDouble();

		System.out.println();
		System.out.println("Enter the annual interest rate.");
		System.out.print("Enter a decimal, not a percentage: ");
		rate = stdin.nextDouble();
		System.out.println("Enter the number of years to simulate the investment for.");
		System.out.print("Enter an integer, not a decimal: ");
		duration = stdin.nextInt();
		System.out.println();

		/* Simulate the investment for the number of years the user inputs */

		int years;  // Counts the number of years that have passed

		years = 0;
		while (years < duration) {
			double interest;  // Interest for this year
			interest = principal * rate;
			principal = principal + interest;  // Add it to principal
			years = years + 1;  // Count the current year
			System.out.print("The value of the investment after ");
			System.out.print(years);
			System.out.print(" years is $");
			System.out.printf("%1.2f", principal);
			System.out.println();
		}  // End of while loop

	}  // End of main()

}  // End of Interest3
