/*
 * This program takes a number of eggs from the user and then tells them how
 * many gross (1 gross = 144 eggs), how many dozen, and how many single eggs
 * have.
 *
 * This program was written as an exercise for the Java Notes online textbook
 * on 02-09-2015 by Jesse Evers.
 */

import java.util.Scanner;  // Import Scanner for getting user input

public class EggCounter {

	public static void main(String[] args) {

		/* Declare variables */
		int totalEggs;  // The number of eggs the user has
		int gross, dozen, singles;  // The number of gross, dozen, single eggs
		int temp;  // Holds remainders
		Scanner stdin;  // The scanner which gets user input

		/* Get the number of eggs the user has */
		System.out.print("How many eggs do you have? ");
		stdin = new Scanner(System.in);  // Makes a stdin into a new scanner
		totalEggs = stdin.nextInt();
		
		/* Figures out the number of gross, dozen, singles */
		gross = totalEggs / 144;
		temp = totalEggs % 144;
		dozen = temp / 12;
		temp = temp % 12;
		singles = temp;

		/* Prints out the number of gross, dozen, and singles */
		System.out.printf("You have %d gross, %d dozen, and %d.", 
				gross, dozen, singles);

	}  // End of main()

}  // End of EggCounter
