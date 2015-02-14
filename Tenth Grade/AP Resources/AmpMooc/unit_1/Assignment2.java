/*
 * This program simulates a change machine. The amount paid and the amount owed
 * are input from the keyboard. It will then return the number of quarters,
 * dimes, nickels, and pennies which should be given as change.
 *
 * This program was written as an exercise for AmplifyMOOC on 02-12-2015 by
 * Jesse Evers.
 */

import java.util.Scanner;
import java.lang.Math;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner stdin;  // For getting user input
		double cost;  // Cost of item
		double paid;  // Amount paid for item
		double change;  // Amount of change owed
		int quarters, dimes, nickels, pennies;  // Number of each type of coin
		int tempCost, tempPaid;  // For storing the int version of cost/paid
		int changeTemp;  // For storing the remainder of change

		stdin = new Scanner(System.in);

		/* Gets the cost of the item */
		System.out.println("Please Enter the Cost of the Item: ");
		cost = stdin.nextDouble();

		/* Gets the amount paid */
		System.out.println("Please Enter the Amount Paid: ");
		paid = stdin.nextDouble();

		/* Deal with subtraction and roundoff error */
		tempCost = (int)Math.round(cost * 100);
		tempPaid = (int)Math.round(paid * 100);
		change = tempPaid - tempCost;
		changeTemp = (int)change;

		System.out.println(change);

		System.out.printf("Change Owed: %1.2f\n", change / 100);

		quarters = (int)(changeTemp / 25);
		changeTemp %= 25;
		dimes = (int)(changeTemp / 10);
		changeTemp %= 10;
		nickels = (int)(changeTemp / 5);
		changeTemp %= 5;
		pennies = (int)(changeTemp / 1);

		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);

	}
}
