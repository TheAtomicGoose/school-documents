import java.util.Scanner;

/**
 * This program takes two integers and prints them out in reverse order.
 */

public class Lesson_32_Activity_Three {

	public static void main(String[] args) {
		
		Scanner stdin;
		int num1, num2;

		stdin = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		num1 = stdin.nextInt();
		System.out.print("Enter the second integer: ");
		num2 = stdin.nextInt();
		swap(num1, num2);
	}  // End of main

	/**
	 * Prints out the integers given in reverse order
	 * @param num1 the first integer to be printed in reverse order
	 * @param num2 the second integer to be printed in reverse order
	 * @return nothing, the numbers are printed out in reverse order
	 */
	public static void swap(int num1, int num2) {

		System.out.println(num2 + " " + num1);
	}
}