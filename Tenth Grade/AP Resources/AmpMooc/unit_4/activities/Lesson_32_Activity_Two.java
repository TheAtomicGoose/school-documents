import java.util.Scanner;

/**
 * This program takes a month number (e.g., 8 is August) as a parameter, and then returns the number of days
 * in that month.
 */

public class Lesson_32_Activity_Two {

	public static void main(String[] args) {
		
		Scanner stdin;
		int monthNum;

		stdin = new Scanner(System.in);
		System.out.print("Enter the number of the month whose number of days you want to know: ");
		monthNum = stdin.nextInt();
		monthDays(monthNum);
	}  // End of main

	/**
	 * Prints out the number of days in the month for which the number is given.
	 * @param num the number of the month for which the number of days is being printed out
	 * @return nothing, the number of days is printed out
	 */
	public static void monthDays(int num) {

		int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 31, 31, 30, 31};

		num -= 1;  // So that I don't have to do index - 1

		System.out.println(numDays[num]);
	}
}