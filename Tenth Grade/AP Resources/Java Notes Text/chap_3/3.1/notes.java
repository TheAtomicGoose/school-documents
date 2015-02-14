/* #### Blocks, Loops, and Branches #### */
/* _____________________________________ */

/* 3.1.1 Blocks */
/* \\\\\\\\\\\\ */

/* 
 * A block is the simplest type of structured statement.
 * It simply groups a sequence of statements into a single statement.
 * The format for a block is:
 */

{
	// Code . . .
}

/* 
 * An empty block is the same thing but without any statements in it, e.g. just
 * a pair of braces with nothing in between them.
 */

/*
 * A variable declared inside a block does not exist outside that block. It is 
 * good style to declare a variable in a block if that variable is used nowhere
 * other than the block. The variable is said to be "local" to the block.
 *
 * The scope of a variable is the part of the program in which that variable is
 * valid.
 */


/* 3.1.2 The Basic While Loop */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * A block alone doesn't really affect the control flow of a program, but the
 * other five control structures do.
 *
 * A while loop is used to repeat a given statement over and over while a certain
 * condition is true.
 * The format for a while loop is:
 */

while (boolean expression) {
	// Code . . .
}

/* Here is an example of a while loop that prints the numbers 1, 2, 3, 4, 5: */
int number;  // The number to be printed
number = 1;  // Start with 1
while (number < 6) {  // Keep going as long as number is less than 6
	System.out.println(number);
	number = number + 1;  // Go on to the next number
}
System.out.println("Done!");


/* 3.1.3 The Basic If Statement */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * An if statement tells the computer to take a certain course of action 
 * depending on the value of a given boolean expression.
 *
 * An if statement has the following form: 
 */

if (boolean expression) {
	// Code . . .
} else {
	// Code . . .
}

/* 
 * If you just want the computer to choose between doing and not doing something,
 * you can omit the else part like so:
 */

if (boolean expression) {
	// Code . . .
}
