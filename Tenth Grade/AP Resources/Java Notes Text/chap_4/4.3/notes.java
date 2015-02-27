/* #### Parameters #### */
/* ____________________ */


/*
 * A parameter provides a mechanism for passing information into a method
 * from outside of the method.
 */


/* 4.3.1 Using Parameters */
/* \\\\\\\\\\\\\\\\\\\\\\ */

/* SEE PRINT3N.JAVA */


/* 4.3.2 Formal and Actual Parameters */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Parameters in a method definition are called formal parameters or
 * dummy parameters. Parameters that are passed to a method when it is
 * called are called actual parameters or arguments.
 *
 * Formal parameters must be a name, like a variable. Like variables
 * formal parameters have a specified type. However, it would be legal
 * to pass an int to a double parameter, as ints can be legally assigned
 * to doubles. For example, with the following method:
 */

static void doTask(int N, double x, boolean test) {
	// Statements to perform the task go here
}

/* This might be called with the statement: */

doTask(17, Math.sqrt(z + 1), z >= 10);


/* 4.3.3 Overloading */
/* \\\\\\\\\\\\\\\\\ */

/*
 * To call a method legally, you need to know which/how many parameters to
 * pass it, the type of each parameter, and the name of the method. All of
 * that information together is called the method's signature. The
 * signature of the doTask method above can be expressed as:
 *
 ####  doTask(int, double,boolean)
 * 
 * Java allows two methods in the same class to have the same name as long
 * as their signatures are different. The state of having one method name
 * that defines two methods (each with a different signature) is called
 * overloading. "println" of System.out.println() is overloaded.
 * System.out has many different methods called println. They all have 
 * different signatures, such as:
 */

 println(int)			println(double)
 println(char)			println(boolean)
 println()

/*
 * Signature does not include the method's return type. It is illegal to
 * have two methods in the same class with the same signature but
 * different return types.
 */


/* 4.3.4 Subroutine Examples */
/* \\\\\\\\\\\\\\\\\\\\\\\\\ */

/**
 * Print all the divisors of N.
 * We assume that N is a positive integer.
 */
static void printDivisors(int N) {
	int D;  // One of the possible divisors of N
	System.out.println("The divisors of " + N " are:");
	for (D = 1; D <= N; D++) {
		if (N % D == 0) {  // Does D evently divide N?
			System.out.println(D);
		}
	}
}


/**
 * Write one line of output containing N copies of the 
 * character ch. If N <= 0, an empty line is output.
 */
private static void printRow(char, ch, int N) {
	int i;  // Loop-control variable for counting off the copies
	for (i = 1; i <= N; i++) {
		System.out.print(ch);
	}
	System.out.println();
}


/**
 * For each character in str, write a line of output
 * containing 25 copies of that character.
 */
private static void printRowsFromString(String str) {
	int i;  // Loop-control variable for counting off the cars
	for (i = 0; i < str.length(); i++) {
		printRow(str.charAt(i), 25);
	}
}


/* 4.3.5 Array Parameters */
/* \\\\\\\\\\\\\\\\\\\\\\ */

/*
 * It is possible for a parameter to be an array. For instance:
 */

static void printValuesInList(int[] list) {
	System.out.print('[');
	int i;
	for (i = 0; i < list.length; i++) {
		if (i > 0) {
			System.out.println(',');
		}
		System.out.println(']');
	}
}


/* 4.3.6 Command-line Arguments */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * The main method of a program has a parameter of type String[]. The
 * array of strings comes from command-line arguments from the command
 * that was used to run the program.
 *
 * To pass the variables one, two, and three to a program called myProg
 * from the command line, you would do this:
 */

# java myProg one two three

/* 
 * See CLDemo.java. It prints out any command-line arguments entered by
 * the user.
 */


/* 4.3.7 Throwing Exceptions */
/* \\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Methods usually throw IllegalArgumentException when they are passed
 * arguments of the incorrect type. To have that happen in a method, do
 * the following:
 */

throw new IllegalArgumentException(error-message);

/*
 * Where error-message is a string describing the error. In a method,
 * you would check if the parameters were valid, and if not, throw an 
 * exception. This could be added to Print3N to make sure that N starts
 * as greater than 0:
 */

if (startingValue <= 0) {
	throw new IllegalArgumentException("Starting value must be larger than zero.");
}


/* 4.3.8 Global and Local Variables */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * The three types of variables that can be used inside a method:
 	* local variables declared inside the method
 	* formal parameter names
 	* member variables declared outside the method
 */