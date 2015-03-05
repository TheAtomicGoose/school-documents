/*
 * This program contains an overloaded version of a method called randomize. It can choose a random int
 * between int max and int min, a random int between 0 and int max, a random double between double max and
 * double min, or a random double between 0 and double max.
 *
 * Written as an exercise for AmplifyMOOC on 03-04-2015 by Jesse Evers.
 */

public class Lesson_35_Activity_One {

	/* Returns a random int between min and max */
	public static int randomize(int min, int max) {

		return (int)((max - min) * Math.random()) + min;
	}

	/* Returns a random int between 0 and max */
	public static int randomize(int max) {

		return (int)(max * Math.random());
	}

	/* Returns a random double between min and max */
	public static double randomize(double min, double max) {

		return ((max - min) * Math.random()) + min;
	}

	/* Returns a random double between 0 and max */
	public static double randomize(double max) {

		return (max * Math.random());
	}
}