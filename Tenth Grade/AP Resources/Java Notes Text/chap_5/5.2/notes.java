/* #### Constructors and Object Initialization #### */

/*
 * Objects must be explicitly constructed.
 */


/* 5.2.1 Initializing Instance Variables */

/*
 * An instance variable can be assigned an initial value in its declaration. Here is an example with a class
 * called PairOfDice:
 */

public class PairOfDice {
    public int die1 = 3;  // Number showing on the first die
    public int die2 = 4;  // Number showing on the second die

    public void roll() {
        // Roll the dice by setting die1 and die2 to a random number in 1..6
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }
}  // End class PairOfDice

/*
 * A variation on PairOfDice that would make more sense is to set the dice equal to random numbers to begin
 * with.
 *
 * If you don't provide an initial value for an instance variable, it is automatically set.
 * Numerical primitives (int, double, etc.) are set to 0, boolean is set to false, chars are set to the
 * Unicode character with code number 0. Objects are set to null.
 */


/* 5.2.2 Constructors */

/*
 * Objects are created with the _new_ operator, like so:
 */

PairOfDice dice;  // Declare a variable of type PairOfDice
dice = new PairOfDice();  // Construct a new object and store it in dice

/*
 * The statement "new PairOfDice()" is what creates a new PairOfDice
 * object. PairOfDice() calls the PairOfDice constructor.
 *
 * A constructor's definition looks like a normal method definition except
 * that it doesn't have a return type, its name must be the name of the
 * class, and it must be public. Here's the PairOfDice class with a
 * constructor:
 */

public class PairOfDice {
    public int die1;
    public int die2;

    // Default Constructor
    public PPairOfDice() {
        roll();
    }

    // Constructor
    public PairOfDice(int val1, int val2) {
        die1 = val1;
        die2 = val2;
    }

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }
} // End of class PairOfDice

/*
 * Constructors are not referred to as methods.
 *
 * Unlike other methods, a constructor can only be called with _new_, like
 * so:
 */
new class-name (parameter-list)

/*
 * These are the exact steps a computer goes through to execute a
 * constructor call:
 *     - Get an block of unused memory in the heap
 *     - Initialize instance variables of the object
 *     - Parameters in the constructor, if any, are evaluated and assigned
 *          to formal parameters
 *     - Statements in the body of the constructor are executed
 *     - A reference to the object is returned
 */


/* 5.2.3 Garbage Collection */

/*
 * Java uses a procedure called garbage collection to reclaim memory
 * occupied by objects that are no longer accessible to a program.
 *
 * In languages where it is the programmer's responsibility to do garbage
 * collection, errors are very common. One is adangling pointer error,
 * which occurs when something is garbage collected before all references
 * to it are gone, and another is a memory leak, which is when an object
 * that is no longer in use is not deleted.
 */
