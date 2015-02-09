/*
 * This program takes input from the user to find out the number of quarters,
 * dimes, nickels, and pennies that the user has, then adds them together to
 * find the amount of money that the user has.
 *
 * This program was written as an exercise for the Java Notes online textbook
 * on 02-08-2015 by Jesse Evers. 
 */

import java.util.Scanner;  // Import scanner to get user input

public class CountChange {

	public static void main(String[] args) {

		double quarters, dimes, nickels, pennies;  // All the different coins
		double total;  // Total amount of money
		Scanner stdin;  // Scanner for user input

		/* Gets the number of each type of coin via Scanner */
		stdin = new Scanner(System.in);
		System.out.println("This program counts your change for you.");
		
		System.out.print("Please enter the number of quarters you have: ");
		quarters = stdin.nextDouble();
		System.out.print("Please enter the number of dimes you have: ");
		dimes = stdin.nextDouble();
		System.out.print("Please enter the number of nickels you have: ");
		nickels = stdin.nextDouble();
		System.out.print("Please enter the number of pennies you have: ");
		pennies = stdin.nextDouble();

		/* Calculates the total amount of money */
		total = quarters * .25 + dimes * .1 + nickels * .05 + pennies * .01;

		/* Print out the total */
		System.out.printf("You have a total of $%1.2f", total);

	}  // End of main()

}  // End of CountChange
