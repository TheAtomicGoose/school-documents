/*
 * This program takes a string and outputs every letter (without repeats)
 * in the string, as well as the number of different letters in the string.
 *
 * This program was copied from http://math.hws.edu/javanotes/c3/s4.html on
 * 02-25-2015 by Jesse Evers, and modified to use the Scanner class instead
 * of TextIO.
 *
 * Pseudocode:
 */

/*
	Ask the user to input a string
	Read the response into a variable, str
	Let count = 0 (for counting the number of different letters)
	for each letter of the alphabet:
		if the letter occurs in str:
			Print the letter
			Add 1 to count
	Output the count
*/

/*
	Ask the user to input a string
	Read the response into a variable, str
	Convert str to upper case
	Let count = 0
	for letter = 'A', 'B', ..., 'Z':
		for i = 0, 1, ..., str.length() - 1:
			if letter == str.charAt(i):
				Print letter
				Add 1 to count
				break
	Output the count
*/


/* Final program: */

import java.util.Scanner;

public class ListLetters {

	public static void main(String[] args) {

		Scanner stdin;  // Gets user input
		String str;  // Line of text entered by the user
		int count;  // Number of different letters found in str.
		char letter;  // A letter of the alphabet

		System.out.println("Please type of a line of text.");
		stdin = new Scanner(System.in);
		str = stdin.nextLine();
		
		str = str.toUpperCase();

		count = 0;
		System.out.println("Your input contains the following letters:");
		System.out.println();
		System.out.print("  ");
		for (letter = 'A'; letter <= 'Z'; letter++) {
			int i;  // Position of a character in str
			for (i = 0; i < str.length(); i++) {
				if (letter == str.charAt(i)) {
					System.out.print(letter);
					System.out.print(' ');
					count++;
					break;
				}
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("There were " + count + " different letters.");

	}  // End of main()

}  // End of ListLetters
