/*
 * This program was written as an exercise for AmplifyMOOC. It
 * takes an array of strings and prints out each string in the
 * array backwards.
 *
 * Written on 02-23-2015 by Jesse Evers.
 */

public class Lesson_29_Activity_Two {

	public static String[] list = {};

	public static void main(String[] args) {

		String temp = "";

		for (int i = 0; i < list.length; i++) {
			for (int l = 0; l < list[i].length(); l++) {
				temp += list[i].charAt(list[i].length() - 1 - l);
			}
			System.out.println(temp);
			temp = "";
		}
	}
}
