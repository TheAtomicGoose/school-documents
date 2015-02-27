/* #### The IF Statement #### */
/* __________________________ */


/* 3.5.1 The Dangling ELSE problem */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * This subsection talks about possible errors when nesting if statements
 * and not using curly brackets to delineate them, but since I always use
 * curly brackets, I'm not going to worry about this.
 */


/* 3.5.2 Multiway Branching */
/* \\\\\\\\\\\\\\\\\\\\\\\\ */

/* This: */

if (boolean-expression-1) {
	statement-1
} else {
	if (boolean-expression-2) {
		statement-2
	} else {
		statement-3
	}
}

/* Is the same as: */

if (boolean-expression-1) {
	statement-1
} else if (boolean-expression-2) {
	statement-2
} else {
	statement-3
}

/* 
 * However, it is almost always written the second way. You can have as many
 * ELSE IFs per if statement as you want.
 * 
 * Here's an example that prints out one of three messages depending on the
 * value of a variable called temperature:
 */

if (temperature < 50) {
	System.out.println("It's cold.");
} else if (temperature < 80) {
	System.out.println("It's nice.");
} else {
	System.out.println("It's hot.");
}


/* 3.5.3 IF Statement Examples */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/* This program takes three integers and outputs them in increasing order */

if (x < y && x < z) {
	if (y < z) {
		System.out.println(x + " " + y + " " + z);
	} else {
		System.out.println(x + " " + z + " " + y);
	}
} else if (x > y && x > z) {
	if (y < z) {
		System.out.println(y + " " + z + " " + x);
	} else {
		System.out.println(z + " " + y + " " + x);
	}
} else {
	if (y < z) {
		System.out.println(y + " " + x + " " + z);
	} else {
		System.out.println(z + " " + x + " " + y);
	}
} 

/* SEE LENGTHCONVERTER.JAVA */


/* 3.5.4 The Empty Statement */
/* \\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * You can end an if statement with a semicolon (;) to tell it to do nothing.
 * It makes something like the following possible:
 */

if (done) {
	;  // Empty statement
} else {
	System.out.println("Not done yet.");
}
