/*
 * This program was written as an exercise for AmplifyMOOC. It 
 * takes a list of strings and takes any spaces out of each string
 * in the list.
 *
 * Written on 02-23-2015 by Jesse Evers.
 */

public class Lesson_30_Activity_One {

	public static String[] list = {};

	public static void main(String[] args) {

		String temp = "";

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length(); j++) {
				if (list[i].charAt(j) != ' ') {
					temp += list[i].charAt(j);
				}
			}	
			list[i] = temp;
			temp = "";
		}
	}
}
