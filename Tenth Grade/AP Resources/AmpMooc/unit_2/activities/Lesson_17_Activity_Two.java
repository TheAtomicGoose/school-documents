/*
 * This program takes two numbers and prints a list of the even numbers between
 * them, and also prints the numbers themselves if they are even.
 *
 * Written on 02-14-2015 by Jesse Evers.
 */

import java.util.Scanner;

public class Lesson_17_Activity_Two {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int num1, num2;

		System.out.println("Enter two numbers: ");
		num1 = stdin.nextInt();
		num2 = stdin.nextInt();

		if (num1 % 2 == 0) {
			System.out.print(num1 + " ");
			num1 += 2;
		} else {
			num1++;
		}

		while (num1 < num2) {
			System.out.print(num1 + " ");
			num1 += 2;
		}

		if (num2 % 2 == 0) {
			System.out.println(num2);
		} else {
			System.out.println();
		}
	}
}
