/*
 * This program takes a positive integer and counts the number of divisors it
 * has. There is a fair amount of pseudocode before the actual program.
 *
 * Copied from http://math.hws.edu/javanotes/c3/s4.html on 02-25-2015 by
 * Jesse Evers. Modified to use the Scanner class instead of TextIO.
 */

/*
	Get a positive integer, N, from the user
	Let divisorCount = 0
	for each number, testDivisor, in the range from 1 to N:
		if testDivisor is a divisor of N:
			Count it by adding 1 to divisorCount
	Output the count
*/

/* 
 * We've decided to output a '.' every time the computer tests 1000000
 * divisors, so that if the program is taking a long time, the user can tell
 * that something is actually happening. This means that we need two counters.
 *
 * Revised pseudocode:
 */

/*
	Get a positive integer, N, from the user
	Let divisorCount = 0
	Let numberTested = 0

	for each number, testDivisor, in the range from 1 to N:
		if testDivisor is a divisor of N:
			Count it by adding 1 to divisorCount
		Add 1 to numberTested
		if numberTested is 1000000
			print out a '.'
			Reset numberTested to 0
	Output the count
*/

/* Finally, the actual program: */

import java.util.Scanner;

public class CountingDivisors {

	public static void main(String[] args) {

		int N;  // A positive integer entered by the user
		int testDivisor;  // A number between 1 and N which is a possible
						  // divisor of N
		int divisorCount;  // Number of divisors of N that have been counted
		int numberTested;  // Used to count how many divisors have been tested
		Scanner stdin;

		/* Get a positive integer from the user */

		stdin = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a positive integer: ");
			N = stdin.nextInt();
			if (N > 0) {
				break;
			}
			System.out.println("That number is not positive. Please try again.");
		}

		/* Count the divisors, printing '.' after every 1000000 tests */

		divisorCount = 0;
		numberTested = 0;

		for (testDivisor = 1; testDivisor <= N; testDivisor++) {
			if (N % testDivisor == 0) {
				divisorCount++;
			}
			numberTested++;
			if (numberTested == 1000000) {
				System.out.print('.');
				numberTested = 0;
			}
		}

		/* Display the result */

		System.out.println();
		System.out.println("The number of divisors of " + N + " is " + divisorCount);

	}  // End of main()

}  // End of CountingDivisors
