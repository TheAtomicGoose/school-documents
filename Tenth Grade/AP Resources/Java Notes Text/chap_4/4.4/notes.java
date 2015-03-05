/* #### Return Values #### */
/* _______________________ */



/*
 * Any method that returns a value is called a function. A function can only return a certain type of value,
 * called the return  type.
 */

/* 4.4.1 The RETURN Statement */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * A method returns a value with a return statement, which is done with the following statement:
 */

return expression;

/*
 * A return statement can only occur in the definition of a function. The type of the expression must match
 * the specified return type of the function. A return statement can occur anywhere in a function definition.
 * Return in a loop or switch will break out of both the statement and the method.
 */


/* 4.4.2 Function Examples */
/* \\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * This function has to do with the 3N + 1 problem. Given one term in the 3N + 1 sequence, it returns the
 * term in the sequence.
 */

static int nextN(int currentN) {
	if (currentN % 2 == 1) {  // Test if current N is odd
		return 3 * currentN + 1;
	} else {
		return currentN / 2;  // If not, return this instead
	}

}

/*
 * See the file ThreeNSequence.java for the above function implemented in a program.
 *
 * This function returns the letter grade corresponding to the numerical grade that is passed as a parameter:
 */

static char letterGrade(int numGrade) {
	if (numGrade >= 90) {
		return 'A';  // 90 or above gets an A
	} else if (numGrade >= 80) {
		return 'B';  // 80 to 89 gets a B
	} else if (numGrade >= 65) {
		return 'C';  // 65 to 79 gets a C
	} else if (numGrade >= 50) {
		return 'D';  // 50 to 64 gets a D
	} else {
		return 'F';  // Anything else gets an F
	}
}  // End of function letterGrade


/* This function returns true if N is a prime number. A prime number is an integer greater than 1 that is not
 * divisible by any positive integer, except itself and 1. If N has any divisor, D, in the range 1 < D < N,
 * then it has a divisor in the range 2 to Math.sqrt(N), namely either D itself or N/D. So we only test
 * possible divisors from 2 to Math.sqrt(N).
 */
static boolean isPrime(int N) {

	int divisor;  // A number we will test to see whether it evenly divides N

	if (N <= 1) {
		return false;  // No number <= 1 is a prime
	}

	int maxToTry;  // The largest divisor that needs to be tested

	maxToTry = (int)Math.sqrt(N);

	for (divisor = 2; divisor <= maxToTry; divisor++) {
		if (N % divisor == 0) {
			return false;  // If divisor is a divisor of N, then N is not prime
		}
	}

	return true;  // Yes, N is prime

}  // End of function isPrime

/*
 * This function reverses a string.
 */

static String reverse(String str) {
	String copy;  // The reversed copy
	int i;  // One of the indices of str
	copy = "";  // Start with an empty string
	for (i = str.length() - 1; i >= 0; i--) {
		copy += str.charAt(i);  // Append i-th char of str to copy
	}
}