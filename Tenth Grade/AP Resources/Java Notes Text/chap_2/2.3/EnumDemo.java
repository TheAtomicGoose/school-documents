/* This is a file demonstrating how to use enums in Java.
 * It was copied from http://math.hws.edu/javanotes/c2/s3.html on 02-06-2015
 * by Jesse Evers. */

public class EnumDemo {
	
	// Define two enum types -- remember that the definitions go OUTSIDE the
	// main() routine!

	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, 
		SATURDAY }

	enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

	public static void main(String[] args) {
		
		Day tgif;  // Declare a variable of type Day
		Month libra;  // Declare a variable of type Month

		tgif = Day.FRIDAY;  // Assign a value of type Day to tgif
		libra = Month.OCT;  // Assign a value of type Month to libra

		System.out.print("My sign is libra, since I was born in ");
		System.out.println(libra);  // Output value will be OCT
		System.out.print("That's the ");
		System.out.print( libra.ordinal() );
		System.out.println("-nth month of the year.");
		System.out.println("   (Counting from 0, of course!)");

		System.out.print("Isn't it nice to get to ");
		System.out.println(tgif);  // Output value will be FRIDAY

		System.out.print(tgif + " is the " + tgif.ordinal()
				+ "-th day of the week.");
	}
}
