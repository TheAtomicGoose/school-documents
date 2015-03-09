/*
 * This program simulates choosing people at random and checking the day of
 * the year that they were born on. It keeps checking until someone has been
 * checked with every possible birthday. It then returns the number of people
 * checked.
 *
 * This program was written as an exercise for the Java Notes online textbook
 * on 03-08-2015 by Jesse Evers.
 */

public class EveryBirthday {

	public static void main(String[] args) {

		boolean[] used;  // For recording the possible birthdays used so far
		int count;  // Number of people checked
		int numUsed;  // Number of birthdays found

		used = new boolean[365];
		count = 0;
		numUsed = 0;

		while (numUsed < 365) {

			numUsed = 0;
			/*
			 * Select a birthday at random, from 0 to 364. If the birthday has
			 * has already been used, quit. Otherwise, record birthday as
			 * used.
			 */

			int birthday;  // The selected birthday
			birthday = (int)(Math.random()*365);
			count++;

			//System.out.printf("Person %d has birthday number %d", count, birthday);
			//System.out.println();

			for (int i = 0; i < used.length; i++) {
				if (used[i]) {
					numUsed++;
				}
			}
			used[birthday] = true;

			
			System.out.println(numUsed);

		}  // End of while loop

		System.out.println();
		System.out.println("Someone with every birthday was found after " + count + " people were checked.");

	}  // End of main()

}  // End of EveryBirthday
