/*
 * This program was written as an activity for AmplifyMOOC. It prints out every
 * number between 23 and 89 with 10 numbers per line.
 *
 * Written on 02-20-15 by Jesse Evers.
 */

public class Lesson_24_Activity_One {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 23; i <= 89; i++) {
			System.out.print(i + " ");
			count++;
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}
