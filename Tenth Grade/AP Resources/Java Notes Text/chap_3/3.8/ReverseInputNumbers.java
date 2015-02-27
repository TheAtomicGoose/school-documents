/*
 * This program takes in numbers from the user and then returns them in the
 * reverse order of how they were entered.
 *
 * This program was copied from http://math.hws.edu/javanotes/c3/s8.html and
 * modified to use the Scanner class instead of TextIO on 02-26-2015 by 
 * Jesse Evers.
 */

import java.util.Scanner;

public class ReverseInputNumbers {

	public static void main(String[] args) {

		Scanner stdin;  // For getting user input
		int[] numbers;  // An array for storing the input values
		int count;  // The number of numbers saved in the array
		int num;  // One of hte numbers input by the user

		stdin = new Scanner(System.in);
		numbers = new int[100];  // Space for 100 ints
		count = 0;  // No numbers have been saved yet

		System.out.println("Entever up to 100 positive integers; enter 0 to end.");

		while (true) {
			System.out.print("? ");
			num = stdin.nextInt();
			if (num <= 0) {
				break;
			}
			numbers[count] = num;  // Put num in position count
			count++;
		}

		System.out.println("\n Your numbers in reverse order are:\n");

		for (int i = count - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}

	}  // End of main()

}  // End of ReverseInputNumbers
