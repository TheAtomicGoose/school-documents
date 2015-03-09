import java.util.Scanner;

/**
 * This program takes two numbers from the user and adds, subtracts, multiplies, or divides the number based
 * on the operator that the user inputs.
 *
 * This program was written as an exercise for the Java Notes online textbook on 03-05-2015 by Jesse Evers.
 */

public class BasicMath {

	public static void main(String[] args) {
		
		Scanner stdin;  // For getting user input
		double num1, num2;  // The numbers that the user inputs to have operations performed on
		String operator;  // The operation to be performed
		double result;  // The result of the operation

		result = 0.0;

		while (true) {
			stdin = new Scanner(System.in);
			System.out.print("Enter a number, 0 to quit: ");
			num1 = stdin.nextDouble();

			if (num1 == 0) {
				break;
			}

			System.out.print("Enter the second number: ");
			num2 = stdin.nextDouble();
			System.out.print("Enter the operation you want to have performed (+-*/): ");
			operator = stdin.next();

			if (operator.equals("+")) {
				result = num1 + num2;
			} else if (operator.equals("-")) {
				result = num1 - num2;
			} else if (operator.equals("*")) {
				result = num1 * num2;
			} else if (operator.equals("/")) {
				result = num1 / num2;
			} else {
				System.out.print("That is not a valid operator. Please enter a valid one: ");
				operator = stdin.next();
			}

			System.out.println(num1 + " " + operator + " " + num2 + " equals " + result);
		}

		System.out.println("Thank you for using BasicMath!");
	}
}