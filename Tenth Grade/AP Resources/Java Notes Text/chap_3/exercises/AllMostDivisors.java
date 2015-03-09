/**
 * This program finds out the number between 1 and 10000 with the most divisors. If multiple
 * numbers in this range have the same, maximum, number of divisors, they are all outputted.
 *
 * Written as an exercise for the Java Notes textbook on 03-06-2015 by Jesse Evers.
 */

public class AllMostDivisors {

	public static void main(String[] args) {
		
		int upTo;
		int numDivisors;
		int lastNumDivisors;
		int mostDivisors;
		int[] mostDivisorsArray;

		upTo = 10000;
		numDivisors = 0;
		lastNumDivisors = 0;
		mostDivisors = 1;
		mostDivisorsArray = new int[upTo / 4 + 1];

		for (int i = 0; i < mostDivisorsArray.length; i++) {
			mostDivisorsArray[i] = 0;
		}

		for (int i = 1; i <= upTo; i++) {

			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
					numDivisors += 1;
				}
			}

			if (numDivisors == lastNumDivisors) {
				for (int k = 0; k < mostDivisorsArray.length; k++) {
					if (mostDivisorsArray[k] == 0) {
						mostDivisorsArray[k] = i;
						break;
					}
				}
			} else if (numDivisors > lastNumDivisors) {
				for (int k = 0; k < mostDivisorsArray.length; k++) {
					if (mostDivisorsArray[k] != 0) {
						mostDivisorsArray[k] = 0;
					}
				}
				mostDivisors = i;
				mostDivisorsArray[0] = i;
				lastNumDivisors = numDivisors;
			}

			numDivisors = 0;
		}

		System.out.println("Among integers 1 and " + upTo + ",");
		System.out.println("The maxiumum number of divisors was " + lastNumDivisors);
		System.out.println("Numbers with that many divisors include:");
		for (int i = 0; i < mostDivisorsArray.length; i++) {
			if (mostDivisorsArray[i] != 0) {
				System.out.println(mostDivisorsArray[i]);
			}
		}

	}
}