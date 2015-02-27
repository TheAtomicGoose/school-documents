/*
 * This program converts a measurement in inches, feet, yards, or miles, to
 * the other three measurements that the original is not in.
 *
 * This program is modified to use the Scanner class instead of TextIO. The
 * program was copied from http://math.hws.edu/javanotes/c3/s6.html on 02-25-2015
 * by Jesse Evers.
 */

import java.util.Scanner;

public class LengthConverterCase {

	public static void main(String[] args) {

		int optionNumber;  // Option number from menu, selected by user
		double measurement;  // Numerical measurement input by user
		double inches;  // The same measurement, converted to inches
		Scanner stdin;  // For getting user input

		stdin = new Scanner(System.in);
		/* Display menu and get user's selected option number */
		
		System.out.println("What unit of measurement does your input use?");
		System.out.println();
		System.out.println("		1.  inches");
		System.out.println("		2.  feet");
		System.out.println("		3.  yards");
		System.out.println("		4.  miles");
		System.out.println();
		System.out.println("Enter the number of your choice: ");
		optionNumber = stdin.nextInt();

		/* Read user's measurement and convert to inches */

		switch (optionNumber) {
			case 1:
				System.out.println("Enter the number of inches: ");
				measurement = Scanner.nextDouble();
				inches = measurement;
				break;
			case 2:
				System.out.println("Enter the number of inches: ");
				measurement = Scanner.nextDouble();
				inches = measurement * 12;
				break;
			case 3:
				System.out.println("Enter the number of inches: ");
				measurement = Scanner.nextDouble();
				inches = measurement * 36;
				break;
			case 4:
				System.out.println("Enter the number of inches: ");
				measurement = Scanner.nextDouble();
				inches = measurement * 12 * 5280;
				break;
			default:
				System.out.println("Error! Illegal option number! I quit!");
				System.exit(1);
		}  // End of switch

	}  // End of main()

}  // End of LengthConverterCase
