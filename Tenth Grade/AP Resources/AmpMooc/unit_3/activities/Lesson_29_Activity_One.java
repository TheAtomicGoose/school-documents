/*
 * This program was written as an exercise for AmplifyMOOC. It
 * takes a list of strings and returns the longest one. If there 
 * are two words that are both the largest out of the words, 
 * return the first instance of a word of that length.
 * 
 * Written on 02-23-2015 by Jesse Evers
 */

public class Lesson_29_Activity_One {

	public static String [] list = {};

	public static void main(String[] args) {

		int index = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].length() > list[index].length()) {
				index = i;
			}
		}

		System.out.println(list[index]);
	}
}
