/**
 * This program takes an array of ints and returns the sum of the 
 * in the array
 *
 * This program was written as an exercise for AmpMOOC on 02-04-2015 by
 * Jesse Evers.
 */

public class Lesson_34_Activity_One {

	public static int sum(int[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}  