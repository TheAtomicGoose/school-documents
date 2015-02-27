/* #### Static Subroutines and Static Variables #### */
/* _________________________________________________ */


/*
 * Every subroutine in Java must be defined inside some class.
 *
 * There is a basic distinction in Java between static and non-static subroutines.
 * Static subroutines are easier to understand. In a running program, a static
 * subroutine is a member of the class itself. A non-static subroutine is there
 * only to be used when an object is created, and it becomes a member of the
 * object. The rest of the notes in this folder will be about static subroutines.
 * 
 * A subroutine that is in a class or object is called a method.
 */

/* 4.2.1 Subroutine Definitions */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * A method definition in Java looks like this:
 */

modifiers return-type subroutine-name (parameter-list) {
	statements
}

/*
 * The statements make up the body of the method. They are in the implementation
 * part of the black box.
 *
 * The modifiers are words that set certain characteristics of the method.
 *
 * If the method is a function, then the return-type specifies the type of value
 * that is returned by the function. All of the following are valid return-types:
 */

String
int
double[]

/*
 * If the method is not a function, then the return-type is void, meaning that no
 * value is returned.
 *
 * The parameter-list items represent information that is passed into the method
 * from the outside to be used in the method's computations. For example, a
 * Television class with the method changeChannel() would take a channel parameter
 * like so:
 */

public void changeChannel(int channelNum) { ... }

/*
 * A value for channelNum would be provided when the method is called, like so:
 */

changeChannel(17);

/*
 * Here are some examples of method definitions, leaving out the statements which
 * define what the methods do:
 */

public static void playGame() {
	// "public" and "static" are modifiers; "void" is the
	// return-type; "playGame" is the subroutine-name;
	// the parameter-list is empty.
	. . .  // Statements that define what playGame does go here
}

int getNextN(int N) {
	// There are no modifiers; "int" in the return-type;
	// "getNextN" is the subroutine-name; the parameter-list
	// includes one parameter whose name is "N" and whose
	// type is "int".
	. . .  // Statements that define what getNextN does go here.
}

static boolean lessThan(double x, double y) {
	// "static" is a modifier; "boolean" is the
	// return-type; "lessThan" is the subroutine-name;
	// the parameter-list includes two parameters whose names are
	// "x" and "y", and the type of each of these parameters
	// is "double".
	. . .  // Statements taht define what lessThan does go here.
}

/*
 * The "public" modifier indicates that the method can be called from anywhere
 * in the program. "private" indicates that the method can only be called from
 * inside the same class. Public and private are called access specifiers.
 */


/* 4.2.2 Calling Subroutines */
/* \\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Methods, even when they're defined, aren't executed until they are called.
 * A method call to the playGame() method would look like this:
 */

playGame();

/*
 * Since playGame() is public, it can be called from other classes, and since it
 * is static, its full name includes the name of the class in which it is defined.
 * If playGame() was defined in a Poker class, you would call it from outside the
 * class like this:
 */

Poker.playGame();

/*
 * A subroutine (method) call statement for a static subroutine
 * (method) takes the form: 
 */

subroutine-name(parameters);

/*
 * If the method being called is in a different class, then:
 */

class-name.subroutine-name(parameters);


/* 4.2.3 Subroutines in Programs */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * This section is in GuessingGame.java
 */


/* 4.2.4 Member Variables */
/* \\\\\\\\\\\\\\\\\\\\\\ */

/*
 * This section is in GuessingGame2.java
 */