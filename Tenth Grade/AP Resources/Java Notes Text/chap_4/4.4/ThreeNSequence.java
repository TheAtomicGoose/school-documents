/*
 * This program finds and prints out all the terms in the 3N + 1 sequence, starting from a number that the
 * user enters.
 *
 * The function print3NSequence was copied from http://math.hws.edu/javanotes/c4/s4.html on 02-28-15. The
 * rest of the program was written on 02-28-2015 by Jesse Evers.
 */

import java.util.Scanner;  // For getting user input

public class ThreeNSequence {

	public static void main(String[] args) {
		
		/* Declare variables */
		Scanner stdin;
		int startingNum;

		stdin = new Scanner(System.in);  // Gets user input

		System.out.print("Enter the term to start the 3N + 1 sequence at: ");
		do {
			startingNum = stdin.nextInt();  // Get the term to start with

			/*
			 * The do...while loop makes sure that it always runs at least once. If the user enters 0 as the
			 * startingNum, the loop ends and the program stops.
			 */
			if (startingNum == 0) {
				break;
			}

			print3NSequence(startingNum);  // Calls the rest of the program

			System.out.println("If you would like to run the program again, enter another starting term.");
			System.out.println("If not, enter 0.");
		} while (true);

		System.out.println("Exiting.");

	}  // End of main()

	static void print3NSequence(int startingValue) {

		/* Declare variables */
		int N;      // One of the terms in the sequence
		int count;  // The number of terms found

		N = startingValue;  // Start the sequence with startingValue
		count = 1;

		System.out.println("The 3N + 1 sequence starting from " + N);
		System.out.println();
		System.out.println(N);  // Print initial term of sequence

		/* Executes the 3N + 1 sequence on the number until the number is <= 1 */
		while (N > 1) {
			N = nextN(N);  // Compute the next term using the function nextN
			count++;  // Count this term
			System.out.println(N);  // Print this term
		}

		System.out.println();
		System.out.println("There were " + count + " terms in the sequence.");

	}  // End of print3NSequence(startingValue)

	static int nextN(int currentN) {

		if (currentN % 2 == 1) {  // Test if N is odd
			return 3 * currentN + 1;  // If so, return this value
		} else {
			return currentN / 2;  // If not, return this instead
		}
	}
}