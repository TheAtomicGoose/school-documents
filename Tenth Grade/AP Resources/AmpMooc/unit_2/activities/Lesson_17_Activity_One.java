/*
 * This is the first activity for Lesson 17 on AmplifyMOOC.
 *
 * Written on 02-14-2015 by Jesse Evers.
 */

import java.util.Scanner;

public class Lesson_17_Activity_One {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		double average;
		Scanner stdin = new Scanner(System.in);

		System.out.println("Enter the scores: ");
		int i = stdin.nextInt();

		while (i > -1) {
			sum += i;
			count++;
			i = stdin.nextInt();
		}

		average = (1.0 * sum) / count;
		System.out.println("The average is: " + average);

	}
}
