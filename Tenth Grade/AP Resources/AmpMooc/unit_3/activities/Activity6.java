/*
 * This program was written as an activity for AmplifyMOOC. It takes two arrays
 * which are up to 10,000 elements long and each of which are in order from
 * smallest to largest, and combines them into one array, which is also in order.
 * If the originally entered arrays are not in order, an error will be thrown.
 * The user enters the original two arrays, and enters a negative number to stop
 * entering numbers into each array.
 *
 * Written on 02-24-2015 by Jesse Evers.
 */

import java.util.Scanner;  // For getting user input

public class Activity6 {

	public static void main(String[] args) {

		/* Declare variables */
		Scanner stdin;
		int[] array1 = new int[10000];
		int[] array2 = new int[10000];
		int[] combined = new int [20000];
		int length1, length2, combinedLength;
		int currentNum;
		int i, j;
		int flag;

		stdin = new Scanner(System.in);
		length1 = 0;
		length2 = 0;


		/* Gets the numbers for the first array */
		System.out.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
		i = 0;
		while (true) {
			currentNum = stdin.nextInt();
			if (currentNum < 0) {
				break;
			}
			array1[i] = currentNum;
			length1++;
			i++;
		}

		/* Gets the numbers for the second array */
		System.out.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
		i = 0;
		while (true) {
			currentNum = stdin.nextInt();
			if (currentNum < 0) {
				break;
			}
			array2[i] = currentNum;
			length2++;
			i++;
		}


		/* Prints out first array */
		System.out.println("First Array:");
		for (i = 0; i < length1; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		/* Prints out second array */
		System.out.println("Second Array:");
		for (i = 0; i < length2; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();


		/*
		 * Sets the length of the ordered array to the sum of the lengths of the 
		 * user-inputted arrays
		 */
		combinedLength = length1 + length2;

		flag = 0;


		/* Checks if the first array is in order */
		for (i = 1; i < length1; i++) {
			int prev = array1[i - 1];
			if (prev > array1[i]) {
				System.out.println("ERROR: Array not in correct order");
				return;
			}
		}

		/* Checks if the second array is in order */
		for (i = 1; i < length2; i++) {
			int prev = array2[i - 1];
			if (prev > array2[i]) {
				System.out.println("ERROR: Array not in correct order");
				return;
			}
		}


		/* Combines the two arrays into a single array */
		for (i = 0; i < length1; i++) {
			combined[i] = array1[i];
		}

		for (i = 0; i < length2; i++) {
			combined[i + length1] = array2[i];
		}


		/* Sorts the combined array */
		j = 0;
		while (j <= (combinedLength / 2) + 1) {
			for (i = 1; i < combinedLength; i++) {
				if (combined[i - 1] > combined[i]) {
					int temp = combined[i];
					combined[i] = combined[i - 1];
					combined[i - 1] = temp;
				}
			}
			j++;
		}


		/* Prints out the sorted array */
		System.out.println("Merged Array:");
		for (i = 0; i < combinedLength; i++) {
			System.out.print(combined[i] + " ");
		}
		System.out.println();
	}
}
