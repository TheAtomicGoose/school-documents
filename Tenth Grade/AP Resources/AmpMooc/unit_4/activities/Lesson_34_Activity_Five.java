/**
 * This program takes an array of ints and returns the sum of the even
 * numbers in the array.
 *
 * This program was written as an exercise for AmpMOOC on 02-04-2015 by
 * Jesse Evers.
 */

public class Lesson_34_Activity_Five {

	public static int sumEven(int[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum += array[i];
			}
		}
		return sum;
	}
}  