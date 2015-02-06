/\/\/\Section 2.4 Text Input and Output/\/\/\
=============================================

2.4.1 Basic Output and Formatted Output
=======================================

/* System.out.print() takes an input, converts it to a string if necessary, 
 * and then outputs to standard output. */
System.out.print(x);

/* System.out.println() is the same, except adds a line return at the end. */
System.out.println(x);

/* System.out.printf() produces formatted output. 
 * It takes two parameters: a format string, and the value to be outputted.
 * The format string below formats a monetary amount properly. */
System.out.printf("%1.2f", amount);
/* Format strings always begin with "%" and end with a letter, possibly with
 * some extra formatting in the middle.
 *
 * The ending letter "d" specifies that a base-10 integer should be outputted.
 * The ending letter "x" specifies that a base-16 integer should be outputted.
 * The ending letter "s" can be used with any type of value.
 * It means that the value should be outputted in its default format.
 * The ending letter "f" specifies that a floating point number should be 
 * outputted.
 *
 * In "%1.2f" the 2 specifies the number of digits after the decimal point.
 * 1 specifies the minimum number of characters to output.
 *
 * Very small and very large numbers should be written in exponential format,
 * e.g. 6.002214e23, which represents 6.002214 * 10^23.
 * Something like "%15.8e" specifies to output 8 decimal places in exponential
 * form. If you use "g" instead of "e", very large and very small numbers will
 * be in exponential form and in floating point form for other values.
 *
 * If a comma (",") is included in the format string, the output will be
 * grouped like 100,000. Use the comma like so: "%,12.3f"
 * To left-justify the text instead of right-justifying, put a "-" before the
 * number of spaces you want used.
 *
 * printf() statements can include other characters which are copied to the
 * output. This can be useful for inserting values in the middle of the output
 * For example: */
System.out.printf("The product of %d and %d is %d", x, y, x*y);

/* That will print out "The product of x and y is x*y */


2.4.6 Using Scanner for Input
=============================

/* The Scanner class can be used to get user input. It has to be imported
 * like so: */
import java.util.Scanner;
/* Then include the following at the beginning of main(): */
Scanner stdin = new Scanner (System.in);
