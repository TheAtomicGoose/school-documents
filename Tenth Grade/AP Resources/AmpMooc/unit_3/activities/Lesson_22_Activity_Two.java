/*
 * This program was written as an exercise for AmplifyMOOC. It takes a string
 * and prints it diagonally with one tab per character.
 *
 * Written by Jesse Evers on 02-19-2015.
 */

import java.util.Scanner;

public class Lesson_22_Activity_Two {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = stdin.nextLine();

		int i = 0;
		int j = 0;
		while (i <= str.length() - 1) {
			while (j <= i - 1) {
				System.out.print("\t");
				j++;
			}
			j = 0;
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
