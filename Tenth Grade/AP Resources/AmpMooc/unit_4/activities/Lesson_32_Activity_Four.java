import java.util.Scanner;

/**
 * This program takes two integers and prints them out in reverse order.
 */

public class Lesson_32_Activity_Four {

	public static void main(String[] args) {
		
		Scanner stdin;
		int numLetters;

		stdin = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		numLetters = stdin.nextInt();
		realTime(numLetters);
	}  // End of main

	/**
	 * Prints out the integers given in reverse order
	 * @param num the number of seconds to be converted to hours, minutes, and seconds
	 * @return nothing, the number of hours, minutes, and seconds are printed out
	 */
	public static void realTime(int num) {

		int hours, minutes, seconds;

		hours = num / 3600;
		num -= hours * 3600;
		minutes = num / 60;
		num -= minutes * 60;
		seconds = num;

		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}  // End of realTime
}