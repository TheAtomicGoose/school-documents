/**
 * This program finds out the number between 1 and 10000 with the most divisors. If multiple
 * numbers in this range have the same, maximum, number of divisors, the lowest one is output.
 *
 * Written as an exercise for the Java Notes textbook on 03-05-2015 by Jesse Evers.
 */

public class MostDivisors {

	public static void main(String[] args) {
		
		int numDivisors;
		int lastNumDivisors;
		int mostDivisors;

		numDivisors = 0;
		lastNumDivisors = 0;
		mostDivisors = 1;

		for (int i = 1; i <= 10000; i++) {

			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
					numDivisors += 1;
				}
			}

			if (numDivisors > lastNumDivisors) {
				mostDivisors = i;
				lastNumDivisors = numDivisors;
			}

			numDivisors = 0;
		}

		System.out.println("The number between 1 and 10000 with the most divisors is: " + mostDivisors);
	}
}