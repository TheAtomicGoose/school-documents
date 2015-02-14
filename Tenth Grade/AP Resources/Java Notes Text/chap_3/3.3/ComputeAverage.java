/*
 * This program reads a sequence of positive integers input by the user, and
 * will print out the average of those integers. The user is prompted to enter
 * one integer at a time. The user must enter a 0 to mark the end of the data.
 * (The zero is not counted as part of the data to be averaged.) The program 
 * does not check whether the user's input is positive, so it will actually
 * add up both positive and negative input values.
 *
 * This program was copied from http://math.hws.edu/javanotes/c3/s3.html on 
 * 02-10-2015 by Jesse Evers. It was modified to use java.util.Scanner instead
 * of TextIO.
 */

import java.util.Scanner;  // For getting user input

public class ComputeAverage {

	public static void main(String[] args) {

		int inputNumber;  // One of the integers input by the user
		int sum;  // The sum of the positive integers
		int count;  // The number of positive integers
		double average;  // The average of the positive integers
		Scanner stdin;  // The scanner for getting user input

		/* Initialize the summation and counting variables */

		sum = 0;
		count = 0;

		/* Read and process the user's input */

		System.out.print("Enter your first positive integer: ");
		stdin = new Scanner(System.in);
		inputNumber = stdin.nextInt();

		while (inputNumber != 0) {
			sum += inputNumber;  // Add inputNumber to running sum
			count++;  // Count the input by incrementing count
			System.out.print("Enter your next positive integer, or 0 to end: ");
			inputNumber = stdin.nextInt();
		}  // End of while loop

		/* Display the result */

		if (count == 0) {
			System.out.println("You didn't enter any data!");
		} else {
			average = ((double)sum) / count;
			System.out.println();
			System.out.println("You entered " + " positive integers.");
			System.out.printf("Their average is %1.3f.\n", average);
		}

	}  // End of main()

}  // End of ComputeAverage
