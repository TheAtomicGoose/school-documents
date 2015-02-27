/*
 * This program simulates choosing people at random and checking the day of
 * the year that they were born on. If their birthday is the same as one that
 * was seen previously, stop, and output the number of people who were
 * checked.
 *
 * This program was copied from http://math.hws.edu/javanotes/c3/s8.html on
 * 02-26-2015 by Jesse Evers.
 */

public class BirthdayProblem {

	public static void main(String[] args) {

		boolean[] used;  // For recording the possible birthdays used so far
		int count;  // Number of people checked

		used = new boolean[365];
		count = 0;

		while (true) {
			/*
			 * Select a birthday at random, from 0 to 364. If the birthday has
			 * has already been used, quit. Otherwise, record birthday as
			 * used.
			 */

			int birthday;  // The selected birthday
			birthday = (int)(Math.random()*365);
			count++;

			System.out.printf("Person %d has birthday number %d", count, birthday);
			System.out.println();

			if (used[birthday]) {
				break;
			}

			used[birthday] = true;

		}  // End of while loop

		System.out.println();
		System.out.println("A duplicate birthday was found after " + count + " tries.");

	}  // End of main()

}  // End of BirthdayProblem
