/*
 * This program was written as an exercise for AmplifyMOOC. It takes a string
 * and prints it with one character per line.
 *
 * Written by Jesse Evers on 02-19-2015.
 */

import java.util.Scanner;

public class Lesson_22_Activity_One {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = stdin.nextLine();

		int i = 0;
		while (i <= str.length() - 1) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
