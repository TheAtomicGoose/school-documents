/*
 * This program takes an input such as "17 feet" or "2.73 miles." The output
 * then shows the length in terms of inches, feet, yards, and miles. The
 * program keeps reading and converting measurements until a 0 is entered.
 *
 * This program was copied from http://math.hws.edu/javanotes/c3/s5.html on
 * 02-25-2015 by Jesse Evers, and modified to use the Scanner class instead of
 * TextIO.
 *
 * Pseudocode:
 */

/*
	Read the user's input measurement and units of measure
	Express the measurement in inches, feet, yards, and miles
	Display the four results
*/

/*
	Let measurement = Scanner.nextDouble(O
	Let units = Scanner.nextLine()
	if the units are inches
		Let inches = measurement
	else if the units are feet
		Let inches = measurement * 12
	else if the units are yards
		Let inches = measurement * 36
	else if the units are miles
		Let inches = measurement * 12 * 5280
	else
		The units are illegal!
		Print an error message and stop processing
	Let feet = inches / 12.0
	Let yards = inches / 36.0
	Let miles = inches / (12.0 * 5280.0)
	Display the results
*/

import java.util.Scanner;

public class LengthConverter {

	public static void main(String[] args) {

		double measurement;  // Numerical measurement, input by user
		String units;  // The unit of measurement input by the user
		/* Measurement expressed in each unit of measure */
		double inches, feet, yards, miles;
		Scanner stdin;  // For getting user input

		System.out.println("Enter measurements in inches, feet, yards, or miles.");
		System.out.println("For example:  1 inch   17 feet   2.73 miles");
		System.out.println("You can use abbreviations:  in   ft   yd    mi");
		System.out.println("I will convert your input into the other units");
		System.out.println("of measure.");
		System.out.println();
		stdin = new Scanner(System.in);

		while (true) {

			/* Get the user's input, and convert units to lower case */

			System.out.print("Enter your measurement, or 0 to end: ");
			measurement = stdin.nextDouble();
			if (measurement == 0) {
				break;  // Terminate the while loop
			}
			System.out.print("Enter the units for your measurement: ");
			units = stdin.nextLine();
			units = units.toLowerCase();  // Converts units to lowercase

			/* Convert the input measurement to inches */

			if (units.equals("inch") || units.equals("inches") || units.equals("in")) {
				inches = measurement;
			} else if (units.equals("foot") || units.equals("feet") || units.equals("ft")) {
				inches = measurement * 12;
			} else if (units.equals("yard") || units.equals("yards") || units.equals("yd")) {
				inches = measurement * 36;
			} else if (units.equals("mile") || units.equals("miles") || units.equals("mi")) {
				inches = measurement * 12 * 5280;
			} else {
				System.out.println("Sorry, but I don't understand \"" + units + "\".");
				continue;  // Back to start of loop
			}

			/* Convert measurement in inches to feet, yards, and miles */

			feet = inches / 12;
			yards = inches / 36;
			miles = inches / (12 * 5280);

			/* Output measurement in terms of each unit of measure */

			System.out.println();
			System.out.println("That's equivalent to:");
			System.out.printf("%12.5g", inches);
			System.out.println(" inches");
			System.out.printf("%12.5g", feet);
			System.out.println(" feet");
			System.out.printf("%12.5g", yards);
			System.out.println(" yards");
			System.out.printf("%12.5g", miles);
			System.out.println(" miles");
		}  // End of while loop

		System.out.println();
		System.out.println("OK! Bye for now.");

	}  // End of main()

}  // End of LengthConverter
