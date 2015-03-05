import java.util.Scanner;  // For getting user input

/**
 * Takes an array of strings from the user and changes each string in the
 * array to uppercase.
 *
 * Written as an exercise for AmplifyMOOC on 03-03-2015 by Jesse Evers.
 */

public class Lesson_33_Activity_One {

	public static int count;

	public static void upper(String[] strArray) {

		String[] upperCaseVer = strArray;

		System.out.println("Your strings in uppercase:");
		for (int i = 0; i < count; i++) {
			upperCaseVer[i] = strArray[i].toUpperCase();
			if (i != count - 1) {
				System.out.print(upperCaseVer[i] + " ");
			} else {
				System.out.print(upperCaseVer[i]);
			}
		}
		System.out.println();
	}  // End of upper


	public static void main(String[] args) {
		
		Scanner stdin;
		String input;
		String[] userStrings = new String[100];

		stdin = new Scanner(System.in);
		input = "begin";

		while (!(input.equals(""))) {
			System.out.println("You can only enter 100 strings.");
			System.out.print("Enter a string to add to the array, press return to stop: ");
			input = stdin.nextLine();
			count++;
			userStrings[count - 1] = input;
		}

		count -= 1;  // Otherwise, the blank ending string gets counted
		upper(userStrings);
	}  // End of main
}