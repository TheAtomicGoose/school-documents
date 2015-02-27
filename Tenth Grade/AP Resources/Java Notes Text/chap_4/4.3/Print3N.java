import java.util.Scanner;

/**
 * This method prints a 3N + 1 sequence to standard output, Using
 * startingValue as the initial value of N. It also prints the number
 * of terms in the sequence. The value of the parameter, startingValue,
 * must be a positive integer.
 */

public class Print3N {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("This program will print out 3N + 1 sequences");
		System.out.println("for starting values that specify.");
		System.out.println();
		int K;  // Input from user; loop ends when K < 0
		do {
			System.out.println("Enter a starting value.");
			System.out.println("To end the program, enter 0: ");
			K = stdin.nextInt();  // Get starting value from user
			if (K > 0) {
				print3NSequence(K);
			}
		} while (K > 0);  // Continue only if K > 0
	}  // End of main()


	static void print3NSequence(int startingValue) {

		int N;      // One of the terms in the sequence
		int count;  // The number of terms

		N = startingValue;  // The first term is whatever value is passed
							// to the method as a parameter

		count = 1;  // We have one term, the starting value, so far

		System.out.println("The 3N + 1 sequence starting from " + N);
		System.out.println();
		System.out.println(N);  // Print inital term of the sequence

		while (N > 1) {
			if (N % 2 == 1) {  // is N odd?
				N = 3 * N + 1;
			} else {
				N = N / 2;
				count++;  // Count this term
				System.out.println(N);  // Print this term
			}
		}

		System.out.println();
		System.out.println("There were " + count + " terms in the sequence.");
		
	}  // End of print3NSequence

}  // End of Print3N