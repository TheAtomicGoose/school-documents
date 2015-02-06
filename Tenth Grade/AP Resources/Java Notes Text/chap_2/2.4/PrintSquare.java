/*
 * A program that reads an integer that is typed in by the user and computes
 * and prints the square of that integer. 
 *
 * Copied from http://math.hws.edu/javanotes/c2/s4.html on 02-06-2015 by
 * Jesse Evers.
 */

public class PrintSquare {

	public static void main(String[] args) {

		int userInput;  // The number input by the user
		int square;  // The userInput, multiplied by itself

		System.out.print("Please type a number: ");
		userInput = TextIO.getlnInt();
		square = userInput * userInput;

		System.out.println();
		System.out.println("The number that you entered was " + userInput);
		System.out.println("The square of that number is " + square);
		System.out.println();

	}  // End of main()

}  // End of class PrintSquare
