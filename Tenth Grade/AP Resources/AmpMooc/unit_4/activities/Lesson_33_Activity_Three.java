import java.util.Scanner;  // For getting user input

/**
 * Takes an array of numbers from the user and prints every number in the
 * array on the same line, separated by spaces.
 *
 * Written as an exercise for AmplifyMOOC on 03-03-2015 by Jesse Evers.
 */

public class Lesson_33_Activity_Three {

	public static int count;

	public static void printIt(int[] intArray) {

		System.out.println("Your array printed out:");
		for (int i = 0; i < count; i++) {
			if (i != count - 1) {
				System.out.print(intArray[i] + " ");
			} else {
				System.out.print(intArray[i]);
			}
		}
		System.out.println();
	}  // End of printIt


	public static void main(String[] args) {
		
		Scanner stdin;
		int input;
		int[] userNums = new int[100];

		stdin = new Scanner(System.in);
		input = 1;

		while (input != 0) {
			System.out.println("You can only enter 100 numbers.");
			System.out.print("Enter an integer to add to the array, enter 0 to stop: ");
			input = stdin.nextInt();
			count++;
			userNums[count - 1] = input;
		}

		count -= 1;  // Otherwise, the zero at the end gets counted
		printIt(userNums);
	}  // End of main
}