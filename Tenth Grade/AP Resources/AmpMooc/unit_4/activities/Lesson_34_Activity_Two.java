/**
 * This program takes an array of integers and returns the average of the
 * integers in the array.
 *
 * This program was written as an exercise for AmplifyMOOC on 03-04-2015
 * by Jesse Evers.
 */

public class Lesson_34_Activity_Two {

	public static double average(int[] array) {

		double average;
		average = 0;
		for (int i = 0; i < array.length; i++) {
			average += (double)array[i];
		}
		average /= array.length;
		return average;
	}
}