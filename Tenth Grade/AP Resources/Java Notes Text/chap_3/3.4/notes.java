/* #### The FOR Statement #### */
/* ___________________________ */


/* 3.4.1 For Loops */
/* \\\\\\\\\\\\\\\ */

/*
 * The for statement makes a common type of while loop easier to write.
 * Many while loops have the form:
 */

initialization
while (continuation-condition) {
	statements
	update
}

/* For example: */

years = 0;  // Initialization
while (years < 5) {  // Continuation condition
	interest = principal * rate;  //
	principal += interest;        // Do three statements
	System.out.println(principal);//

	years++;  // Update
}

/* The for loop equivalent of the above while loop: */

for (years = 0; years < 5; years++) {
	interest = principal * rate;
	principal += principal;
	System.out.println(principal);
}

/*
 * For loops combine the initialization, continuation condition, and update
 * in the first line. It makes it easier to read and understand the loop.
 * The initialization is executed once, the continuation condition is executed
 * just before each iteration of the loop, and the update is run at the 
 * end of every iteration.
 *
 * The formal syntax of a for statement is as follows: 
 */

for (initialization; continuation-condition; update) {
	statement(s)
}

/*
 * The continuation condition must be a boolean expression. The initialization
 * is usually an assignment statement/declaration. The update is usually an
 * increment, a decrement, or an assignment statement.
 *
 * It is possible to begin an infinite loop with:
 */

for (;;){
	// Code . . .
}

/*
 * The official syntax of a for statement allows the initialization and update
 * to include several comma separated expressions. For instance:
 */

for (i = 1, j = 10; i <= 10; i++, j--) {
	System.out.printf("%5d", i);  // Output i in a 5 character wide column
	System.out.printf("%5d", j);  // Output j in a 5 character wide column
	System.out.println();
}

/*
 * A for statement can use things other than integers for controls, such as
 * a char.
 */


/* 3.4.2 Example: Counting Divisors */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/* SEE COUNTINGDIVISORS.JAVA */


/* 3.4.3 Nested FOR Loops */
/* \\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Nested for loops arise naturally in many algorithms. Consider the problem
 * of printing out a multiplication table from 1 to 12. It is arranged into
 * 12 rows and 12 columns. The pseudocode algorithm for that is (everywhere
 * that there are two new lines between pseudocode means that after the 
 * new lines there is a refined pseudocode block):
 */

for each rowNumber = 1, 2, 3, ..., 12:
	Print the first twelve multiples of rowNumber on one line
	Output a carraige return


for each rowNumber = 1, 2, 3, ..., 12:
	for N = 1, 2, 3, ..., 12:
		Print N * rowNumber
	Output a carriage return

/* The final result: */
for (rowNumber = 1; rowNumber <= 12; rowNumber++) {
	for (N = 1; N <= 12; N++) {
		System.out.printf("%4d", N * rowNumber);
	}
	System.out.println();
}

/* SEE LISTLETTERS.JAVA */

