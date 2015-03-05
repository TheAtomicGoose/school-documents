import java.util.Scanner;  // For getting user input

/**
 * This program takes a number of a month (e.g., 8 is August) and returns the name of that month.
 *
 * Written as an exercise for AmplifyMOOC on 02-03-2015 by Jesse Evers.
 */

public class Lesson_32_Activity_One {

	public static void main(String[] args) {
		
		Scanner stdin;
		int monthNum;

		stdin = new Scanner(System.in);
		System.out.print("Enter the number of a month: ");
		monthNum = stdin.nextInt();
		monthName(monthNum);
	}  // End of main

	/**
	 * Returns a month name based on the number given.'
	 * @param num the number of a month; e.g., 8 is August
	 * @return nothing, just prints something out
	 */ 
	public static void monthName(int num) {

		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December"};

		num -= 1;  // Makes it so that I don't have to do num - 1 for the index

		System.out.println(months[num]);
	}
}