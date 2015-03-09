/*
 * This program simulates choosing people at random and checking the day of
 * the year that they were born on. Once three people are found with the same
 * birthday, the program stops and returns how many people had to be selected
 * before three were found with the same birthday.
 *
 * This program was written as an exercise for the Java Notes online textbook 
 * on 03-08-2015 by Jesse Evers.
 */

public class ThreeSameBirthday {

	public static void main(String[] args) {

		int[] used;  // For recording the possible birthdays used so far
		int count;  // Number of people checked

		used = new int[365];
		for (int i = 0; i < used.length; i++) {
			used[i] = 0;
		}
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

			if (used[birthday] == 2) {
				break;
			}

			used[birthday] += 1;

		}  // End of while loop

		System.out.println();
		System.out.println("Three people with the same birthday were found after " + count + " tries.");

	}  // End of main()

}  // End of ThreeSameBirthday