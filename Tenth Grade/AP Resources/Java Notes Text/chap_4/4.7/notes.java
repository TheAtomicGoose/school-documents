/* #### The Truth About Declarations #### */
/* ______________________________________ */


/* 4.7.1 Initialization in Declarations */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Since local variables are often initialized immediately after they are declared, both of the following are
 * valid ways to declare and initialize a variable:
 */

int count;
count = 0;

// Or

int count = 0

/*
 * Several variables can be declared in one statement, using both of the methods shown above:
 */

char firstInitial = 'D', secondInitial = 'E';

int x, y = 1;  // Ok, but only y has been initialized

int N = 3, M = N + 2;  // Ok because N has been initialized before it is used

/*
 * A member variable can also be initialized where it is being declared:
 */

public class Bank {
	private static double interestRate = 0.05;
	private static int maxWithdrawal = 200;
	.
	.  // More variables and subroutines
	.
}

/*
 * Assignment statements cannot occur outside of a method:
 */

public class Bank {
	private static double interestRate;
	interestRate = 0.05;  // ILLEGAL: Can't be outside a method!
}

/*
 * It is also possible to initialize arrays with the following syntax, but this syntax cannot be used in 
 * assignment statements:
 */

int[] smallPrimes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };


/* 4.7.2 Named Constants */
/* \\\\\\\\\\\\\\\\\\\\\ */

/*
 * If a variable is going to have the same value throughout the program, final is used when it is declared:
 */

public final static double interestRate = 0.05;  // Impossible to change the value elsewhere!

/*
 * A rule for named constants (final variables) is to give them entirely uppercase names. For instance:
 */

public final static double INTEREST_RATE = 0.05;

/*
 * One of the main attractions of constants is that their value is easy to change, so if you use them for a
 * fixed value, if you want to change that value you don't have to go through the whole program changing a
 * single number everywhere.
 */


/* 4.7.3 Naming and Scope Rules */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * The portion of the code where a variable is valid is called the scope of the variable.
 *
 * Static member methods are valid throughout the class in which they are defined.
 *
 * Static member variables are the same as static member methods, except that they are not valid in methods
 * which have variables or formal parameters with the same name as the member variable.
 *
 * The scope of a formal parameter of a method is the block that makes up the body of the method.
 *
 * The scope of a local variable is from the variable's declaration statement to the end of the block in
 * which the variable is declared.
 *
 * It is legal to have variables and methods with the same name, because method names are always followed
 * by an opening parenthesis.
 /*