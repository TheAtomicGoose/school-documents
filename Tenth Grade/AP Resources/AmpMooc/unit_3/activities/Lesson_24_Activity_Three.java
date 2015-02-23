/*
 * This program was written as an activity for AmplifyMOOC. It takes a number
 * between 0 and 100 and prints out all the numbers between that number and 100
 * inclusive. If the number is not between 0 and 100 it throws an error.
 *
 * This program was written on 02-20-2015 by Jesse Evers.
 */

import java.util.Scanner;

public class Lesson_24_Activity_Three {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 100:");
		int num = stdin.nextInt();
		int count = 0;

		if (num < 0 || num > 100) {
			System.out.println("error");
			return;
		}

		for (int i = num; i <= 100; i++) {
			System.out.print(i + " ");
			count++;
			if (count == 20) {
				System.out.println();
				count = 0;
			}
		}
	}
}
