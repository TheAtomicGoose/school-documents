/*
 * This program simulates two dice being rolled by generating two random numbers
 * in the range 1..6 inclusive. 
 * 
 * This program was written as an exercise for the Java Notes online textbook on
 * 02-08-2015 by Jesse Evers. */

public class DoubleDice {

	public static void main(String[] args) {

		/* Declare variables */
		int die1, die2;  // The two dice

		/* Make each variable a random int in 1..6 inclusive */
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) + 1;

		/* Print out the results */
		System.out.println("The first die comes up " + die1);
		System.out.println("The second die comes up " + die2);
		System.out.println("Your total roll is " + (die1 + die2));

	}  // End main()

}  // End DoubleDice class
