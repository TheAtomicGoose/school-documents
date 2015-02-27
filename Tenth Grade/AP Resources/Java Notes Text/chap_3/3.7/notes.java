/* Introductions to Exceptions and TRY...CATCH */
/* ___________________________________________ */


/*
 * Java has a way to deal with "exceptional" cases that throw the flow of
 * control off of its normal track. By default these cases make the program
 * exit with an error message. Java makes it possible to catch these errors
 * and program a different response with the TRY...CATCH statement.
 */

/* 3.7.1 Exceptions */
/* \\\\\\\\\\\\\\\\ */

/*
 * The term exception refers to the type of error that one would handle with
 * a TRY...CATCH statement. 
 *
 * Exceptions in Java are represented as objects of type Exception, with
 * subclasses representing the different kinds of Exceptions.
 *
 * A NumberFormatException can occur when a program trys to convert a string
 * into a number. This type of conversion is done by the Integer.parseInt and
 * Integer.parseDouble functions. If you try to convert a string containing
 * "42", then the Integer.parseInt function will convert it to the integer 42.
 * However, if the string is "fred", the function will fail to convert it to
 * an integer and will return a NumberFormatException. If the exception isn't 
 * handled, the program will crash.
 *
 * IllegalArgumentExceptions occur when an illegal value is passed as an
 * argument. For instance, when a string is passed instead of an int.
 */


/* 3.7.2 TRY...CATCH */
/* \\\\\\\\\\\\\\\\\ */


/*
 * When an exception occurs, that exception is considered to have been
 * "thrown". When an exception is thrown, it is possible to "catch" the
 * exception  with a TRY...CATCH statement. The simplified syntax for a
 * TRY...CATCH statement is:
 */

try {
	statements-1
}
catch (exception-class-name variable-name) {
	statements-2
}

/*
 * The exception-class-name could be NumberFormatException,
 * IllegalArgumentException, or any other exception name. When the program
 * runs the TRY...CATCH statement, it runs the statements in the TRY part.
 * If that runs without errors, it skips the CATCH section. However, if there
 * is an error with the name of exception-class-name, the program instantly
 * skips to statements-2. 
 *
 * The variable-name in CATCH represents the exception object so that you can
 * do things with it, like print it out.
 *
 * After the end of the CATCH statement, the program continues normally.o
 *
 * Here is an example of using the TRY...CATCH statement:
 */

double x;
try {
	x = Double.parseDouble(str);
	System.out.println("The number is " + x);
}
catch (NumberFormatException e) {
	System.out.println("Not a legal number.");
	x = Double.NaN;
}

/* SEE COMPUTEAVERAGE2.JAVA */
