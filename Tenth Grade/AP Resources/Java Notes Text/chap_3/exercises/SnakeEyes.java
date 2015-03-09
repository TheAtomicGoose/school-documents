/**
 * This program simulates rolling dice and returns the number of rolls it takes before the
 * dice come up snake eyes.
 * 
 * Written as an exercise for the Java Notes online textbook on 03-05-2015 by Jesse Evers.
 */

public class SnakeEyes {

	public static void main(String[] args) {
		
		int die1, die2;  // The two dice
		int count;  // The number of rolls

		count = 0;

		do {
			die1 = (int)(6 * Math.random());
			die2 = (int)(6 * Math.random());
			count++;
		} while (!(die1 == 1 && die2 == 1));

		System.out.println(count);
	}
}