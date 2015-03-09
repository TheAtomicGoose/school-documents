import java.util.Scanner;  // For getting user input

/**
 * This program takes a sentence from the user, removes punctuation, and
 * inserts newlines at each space.
 *
 * Written as an exercise for the Java Notes online textbook on 03-06-2015
 * by Jesse Evers.
 */

public class VertParse {

	public static void main(String[] args) {
		
		Scanner stdin;
		String input;
		String output;

		stdin = new Scanner(System.in);

		System.out.println("Enter a string:");
		input = stdin.nextLine();

		output = "\n";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i)) || input.charAt(i) == '\'') {
				output += input.charAt(i);
			} else if (input.charAt(i) == ' ') {
				output += '\n';
			}
		}

		System.out.println(output);
	}
}