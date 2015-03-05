/**
 * This program takes an array of integers and returns the smallest
 * integer in the array.
 *
 * Written as an exercise for AmplifyMOOC on 03-04-2015 by Jesse Evers.
 */

public class Lesson_34_Activity_Four {

	public static int findMin(int[] array) {

		/* 
		 * Max is set to the biggest possible integer value, so that 
		 * everything will be smaller than it to begin with.
		 */
		int min = Integer.MAX_VALUE;

		/*
		 * Iterates over the array. If the current array item is smaller
		 * than min, min is set to that item.
		 */
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}
}