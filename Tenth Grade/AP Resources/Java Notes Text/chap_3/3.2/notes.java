/* #### Section 3.2: Algorithm Development #### */
/* ____________________________________________ */


/*
 * Writing any but the simplest program requires learning to think the right way.
 * 
 * You start with a general idea of a task for the computer to perform. The
 * problem is to flesh out the outline into a completely unambiguous step-by-step
 * program for the computer to follow. That is called an "algorithm."
 */


/* 3.2.1 pseudocode and Stepwise Refinement */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Stepwise refinement is when you write a description of a task, then break
 * down the task into smaller and smaller steps until you have a complete
 * algorithm which can be directly translated into a programming language.
 *
 * As you refine your algorithm through stepwise refinement, you can write
 * descriptions of your algorithm in pseudocode. pseudocode is informal
 * instructions that mimic the structure of programming languages without
 * actually following the complete syntax and detail of a programming language.
 *
 * The pseudocode for the Interest3 class written in Section 3.1 would be
 * something like the following:
 */

Ask the user for the initial investment
Read the user's response
Ask the user for the interest rate
Read the user's response
Ask the user for the number of years to simulate
Read the user's response
While there are more years to process:
	Compute the interest
	Add the interest to the value
	Display the value


/* 3.2.2 The 3N + 1 Problem */
/* \\\\\\\\\\\\\\\\\\\\\\\\ */

"Given a positive integer, N, define the '3N+1' sequence starting from N as 
"follows: If N is an even number, then divide N by two; but if N is odd, then 
"multiply N by 3 and add 1. Continue to generate numbers in this way until N 
"becomes equal to 1. For example, starting from N = 3, which is odd, we multiply
"by 3 and add 1, giving N = 3*3+1 = 10. Then, since N is even, we divide by 2, 
"giving N = 10/2 = 5. We continue in this way, stopping when we reach 1. The 
"complete sequence is: 3, 10, 5, 16, 8, 4, 2, 1.

"Write a program that will read a positive integer from the user and will print 
"out the 3N+1 sequence starting from that integer. The program should also count
"and print out the number of terms in the sequence."

/* A general outline for the program would be: */
Get a positive integer N from the user.
Compute, print, and count each number in the sequence.
Output the number of terms.

/* Refined once: */
Get a positive integer N from the user;
while N is not 1:
	if N is even:
		Compute N = N/2;
	else
		Compute N = 3 * N + 1
	Output N;
	Count this term;
Output the number of terms;

/* Refined twice: */
Ask user to input a positive number;
Let N be the user's response;
while N is not positive:
	Print an error message;
	Read another value for N;
Let counter = 0;
while N is not 1:
	if N is even:
		Compute N = N/2;
	else
		Compute N = 3 * N + 1
	Output N;
	Count this term;
Output the number of terms;

/* To see the actual program that this algorithm results in, see ThreeN1.java. */
