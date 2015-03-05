/**
 * This program takes an array of integers and returns true if all of the
 * items in the array are greater than or equal to zero. Otherwise, it
 * returns false.
 *
 * Written as an exercise for AmplifyMOOC on 03-04-2015 by Jesse Evers.
 */

public class Lesson_34_Activity_Six {

	public static boolean allPositive(int[] array) {

		boolean positive;
		positive = true;

		for (int i = 0; i < array.length; i++) {
			if (!(array[i] >= 0)) {
				positive = false;
			}
		}

		return positive;
	}
}