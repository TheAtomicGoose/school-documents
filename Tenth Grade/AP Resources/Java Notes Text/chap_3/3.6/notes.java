/* #### The SWITCH Statement #### */
/* ______________________________ */


/* 3.6.1 The Basic SWITCH Statement */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * A switch allows you to test the value of an expression and, depending on
 * that value, to jump directly to some location within the switch statement.
 * The value can only be int, short, byte, char, String, or enum.
 *
 * The positions in a switch statement are marked with case labels. On the
 * last case in a switch statement, you can use the label "default", which is
 * used when the value of the expression is not listed in any of the cases.
 * 
 * The syntax for case statements is like so:
 */

switch (expression) {
	case constant-1:
		statements-1
		break;
	case constant-2:
		statements-2
		break;
		// .
		// . (more cases)
		// .
	case constant-N:
		statements-N
		break;
	default:  // Optional default case
		statements-(N+1)
}  // End of switch statement

/*
 * The switch statement has the same effect as a multi-(else-if) if statement, but can be more efficient in
 * situations with many possibilities, as it can evaluate only one expression and then jump right to the correct
 * case instead of going through all the possibilities.
 *
 * The break statements in the switch are technically optional, as they just make the program skip the rest of 
 * the break statement once it completes a case, but there is rarely a reason to continue through the rest of 
 * the statement after executing the one that corresponds to the way the boolean expression was evaluated.
 *
 * The statements don't have to be in numerical order. Also, if you leave out the statements of a certain group, it will just execute the statements of the next group
 * whose actions are defined. For example:
 */

switch (N) {  // Assume N is an integer variable
	case 1:
		System.out.println("The number is 1.");
		break;
	case 2:
	case 4:
	case 8:
		System.out.println("The number is 2, 4 or 8.");
		System.out.println("(That's a power of 2!)");
		break;
	case 3:
	case 6:
	case 9:
		System.out.println("The number is 3, 6, or 9.");
		System.out.println("(That's a multiple of 3!)");
		break;
	case 5:
		System.out.println("The number is 5.");
		break;
	default:
		System.out.println("The number is 7 or is outside the range 1 to 0.");
}


/* 3.6.2 Menus and SWITCH statements */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Switch statements can be used to process menus, especially if the menu items are numbered. 
 * SEE LENGTHCONVERTERCASE.JAVA


/* 3.6.3 Enums in SWITCH Statements */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * The type of the expression in a switch statement can be an enumerated type. For instance:
 */

enum Season { SPRING, SUMMER, FALL, WINTER }

switch (currentSeason) {
	case WINTER:  // NOT Season.WINTER
		System.out.println("December, January, February");
		break;
	case SPRING:
		System.out.println("March, April, May");
		break;
	case SUMMER:
		System.out.println("June, July, August");
		break;
	case FALL:
		System.out.println("September, October, November");
		break;
}


/* 3.6.4 Definite Assignment and SWITCH Statements */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * The following example randomly selects 0, 1, or 2 with equal probability for each.
 */

switch ((int)(3 * Math.random())) {
	case 0:
		computerMove = "Rock";
		break;
	case 1:
		computerMove = "Paper";
		break;
	case 2:
		computerMove = "Scissors";
		break;
}

/*
 * The previous switch statement alone is fine, but when used as follows:
 */

String computerMove;
switch ((int)(3 * Math.random())) {
	case 0:
		computerMove = "Rock";
		break;
	case 1:
		computerMove = "Paper";
		break;
	case 2:
		computerMove = "Scissors";
		break;
}
System.out.println("The computer's move is " + computerMove);  // ERROR!

/*
 * The program above gives an error on the last line!
 * This is because of definite assignment, which is the idea that the Java compiler must be able to determine
 * that a variable has definitely assigned a value before its value is used.
 * A solution to this is to replace the final case in the switch statement with default, which makes it so that
 * all possible values of the expression in the switch are covered, like so:
 */

String computerMove;
switch ((int)(3 * Math.random())) {
	case 0:
		computerMove = "Rock";
		break;
	case 1:
		computerMove = "Paper";
		break;
	default:
		computerMove = "Scissors";
		break;
}
System.out.println("The computer's move is " + computerMove);  // ERROR!
