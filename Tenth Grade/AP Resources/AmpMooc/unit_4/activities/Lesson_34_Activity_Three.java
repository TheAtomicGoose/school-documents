/**
 * This program takes an array of integers and returns the largest integer
 * in the array.
 *
 * Written as an exercise for AmplifyMOOC on 03-04-2015 by Jesse Evers.
 */

public class Lesson_34_Activity_Three {

	public static int findMax(int[] array) {

		/* 
		 * Max is set to the smallest possible integer value, so that 
		 * everything will be bigger than it to begin with.
		 */
		int max = Integer.MIN_VALUE;

		/*
		 * Iterates over the array. If the current array item is larger
		 * than max, max is set to that item.
		 */
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}
}