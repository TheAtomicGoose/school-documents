/* 
 * This program asks the user to input their first name, and then returns a greeting which includes their name
 * in all caps.
 *
 * This program was written as an exercise for the Java Notes online textbook on 02-08-2015 by Jesse Evers. */

import java.util.Scanner;  // Imports the Scanner class for getting user input

public class BigGreeting {

	public static void main(String[] args) {

		/* Declare variables */
		Scanner scanner = new Scanner(System.in);  // Makes a Scanner named scanner
		String name;  // Will be used to store user's name
		String upperCaseName;  // For the uppercase version of the name
		
		/* Asks for the user's first name */
		System.out.print("Please enter your first name: ");
		name = scanner.next();

		/* Makes name uppercase */
		upperCaseName = name.toUpperCase();

		System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
	}
}
