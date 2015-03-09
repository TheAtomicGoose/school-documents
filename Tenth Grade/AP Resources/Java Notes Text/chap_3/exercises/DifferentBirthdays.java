/*
 * This program simulates choosing people at random and checking the day of
 * the year that they were born on. 365 people are created with random birthdays.
 * The program returns how many different birthdays those 365 people have.
 *
 * This program was written as an exercise for the Java Notes online textbook on
 * 03-08-2015 by Jesse Evers.
 */

public class DifferentBirthdays {

	public static void main(String[] args) {

		boolean[] used;  // For recording the possible birthdays used so far
		int count;  // Number of different birthdays

		used = new boolean[365];
		count = 0;

		for (int i = 0; i < 365; i++) {
			/*
			 * Select a birthday at random, from 0 to 364. If the birthday has
			 * has not been used, increment the count.
			 */

			int birthday;  // The selected birthday
			birthday = (int)(Math.random()*365);

			System.out.printf("Person %d has birthday number %d", count, birthday);
			System.out.println();

			if (!(used[birthday])) {
				count++;
			}

			used[birthday] = true;

		}  // End of while loop

		System.out.println();
		System.out.println("365 random people had " + count + " different birthdays.");

	}  // End of main()

}  // End of DifferentBirthdays
