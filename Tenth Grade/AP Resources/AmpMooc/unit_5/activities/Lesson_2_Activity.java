import java.util.Scanner;
import java.util.ArrayList;

/*
 * This program takes string input from the user, and stops taking input
 * when the user enters STOP. The strings are stored in an ArrayList. The
 * list's length and contents are printed out. Then, the strings with the
 * character 'a' in them are printed out.
 * 
 * This program was written as an exercise for AmplifyMOOC on 03-09-2015
 * by Jesse Evers.
 */

public class Lesson_2_Activity {

	public static void main(String[] args) {
		
		// Define variables
		ArrayList <String>list;
		String currentIn;
		Scanner stdin;

		// Initialize variables
		list = new ArrayList();
		stdin = new Scanner(System.in);
		currentIn = "";

		System.out.println("Please enter words, enter STOP to stop the loop.");

		while (!(currentIn.equals("STOP"))) {
			currentIn = stdin.nextLine();
			list.add(currentIn);
		} // End of while

		System.out.println();

		for (String s: list) {
			if (s.indexOf('a') != -1) {
				System.out.println(s);
			}
		}
	}
}