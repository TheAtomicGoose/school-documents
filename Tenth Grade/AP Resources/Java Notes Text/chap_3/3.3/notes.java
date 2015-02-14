/* #### Section 3.3 The While and Do..While Statements #### */
/* ________________________________________________________ */


/* 3.3.1 The while Statement */
/* \\\\\\\\\\\\\\\\\\\\\\\\\ */

/* The while statement was already introduced in Section 3.1. A while loop
 * has the following form:
 */

while (boolean expression) {
	// Code . . .
}

/*
 * The code can be a block statement consisting of one or more statements
 * grouped together by braces. This block is called the body of the loop. The
 * body of the loop is repeated as long as the boolean expression is true.
 * The boolean expression is called the continuation condition or test of the
 * loop.
 *
 * The following is a pseudocode algorithm for a program that finds the 
 * average of a set of positive integers entered by the user:
 */

Let sum = 0  // The sum of the integers entered by the user
Let count = 0  // The number of integers entered by the user
while there are more integers to process:
	Read an integer
	Add it to the sum
	Count it
Divide sum by count to get the average

/*
 * The one issue with this is knowing when to stop processing the integers.
 * A typical solution is to tell the user to enter a 0 when they're done
 * entering numbers. This works because we're assuming that all data is 
 * positive, so the zero isn't a legal value and won't be processed. A data
 * value used in this way is called a "sentinel value."
 *
 * Now, the while loop becomes "while the input integer is not zero." But,the
 * first time the test is evaluated, no integer has been read yet so testing
 * if its value is zero doesn't make sense. So something has to be done before
 * the loop to make sure that the test makes sense. Setting it up is called
 * priming the loop. This can be done by reading the first integer before the
 * beginning of the loop. Here is a revised version of the algorithm:
 */

Let sum = 0
Let count = 0
Read an integer
while the integer is not zero:
	Add the integer to the sum
	Count it
	Read an integer
Divide the sum by count to get the average
Print out the average


/* 3.3.2 The do..while statement */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Sometimes it works better to test the continuation condition at the end
 * of a loop instead of at the beginning. The do..while statement is the same
 * as a while loop except that the while (boolean expression) is at the end.
 * They are written like so:
 */

do {
	// Code . . .
} while (boolean expression);

/*
 * Here is some pseudocode for a game-playing program. It makes sense to use
 * a do..while loop here because you know that there will always be at least
 * one game played.
 */

do {
	Play a Game
	Ask user if they want to play another game
	Read the user's response
} while (the user's response is yes);

/* The above can be coded like so: */

import java.util.Scanner;
Scanner stdin = new Scanner(System.in);
boolean wantsToContinue;  // True if user wants to play again
do {
	Checkers.playGame();
	System.out.print("Do you want to play again? ");
	wantsToContinue = stdin.nextBoolean();
} while (wantsToContinue == true);

/*
 * While having multiple types of loops can be convenient, it does not make
 * the language more powerful. For instance, if doSomething represents any
 * block of code, then:
 */

do {
	doSomething;
} while (boolean expression);
/* is exactly the same as: */
doSomething;
while (boolean expression) {
	doSomething;
}

/* In the same vein, */

while (boolean expression) {
	doSomething;
}
/* is the same as */
if (boolean expression) {
	do {
		doSomething;
	} while (boolean expression);
}


/* 3.3.3 Break and Continue */
/* \\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Java provides a method for breaking out of the middle of any loop. It's
 * called the break statement, which takes the form:
 */
break;
/*
 * When the computer executes a break statement, it immediately stops the loop
 * and continues just after the loop in the program. For example:
 */

while (true) {  // Looks like it will run forever
	System.out.print("Enter a positive number: ");
	N = stdin.nextInt();
	if (N > 0) {  // the input value is OK, so jump out of the loop
		break;
    }
	System.out.print("Your answer must be greater than 0.");
}
// Continue here after break
