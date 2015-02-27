/*
 * This program will play a guessing game with the user. The main
 * method will call an infinite loop with playGame(). The super
 * basic pseudocode is:
 */

/*
	Pick a random number
	while the game is not over:
		Get the user's guessing
		Tell the user whether the guess is high, low, or correct
*/

/*
 * A more complete algorithm checks if the user's guess is
 * correct, and keeps track of the number of guesses made:
 */

/*
	Let computersNumber be a random number between 0 and 100
	Let guessCount = 0
	while (true):
		Get the guess by adding 1 to guess guess count
		if the user's guess equals computersNumber:
			Tell the user they won
			break out of the loop
		if the number of guesses is 6:
			Tell the user they lost
			break out of the loop
		if the user's guess is less than computersNumber:
			Tell the user the guess was low
		else if the user's guess is higher than computersNumber:
			Tell the user the guess was high
*/


/*
 * This program randomly chooses an number between 0 and 100, then
 * plays a guessing game with the user to see if they can guess
 * the number. They get 6 guesses, then they lose.
 *
 * 
 * Copied from http://math.hws.edu/javanotes/c4/s2.html, and
 * modified to use the Scanner class instead of TextIO.
 * Copied on 02-26-2015 by Jesse Evers.
 */

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		System.out.println("Let's play a game. I'll pick a number between");
		System.out.println("1 and 100, and you try to guess it.");
		boolean playAgain;
		Scanner stdin;
		stdin = new Scanner(System.in);
		do {
			playGame();  // Call subroutine to play one game
			System.out.print("Would you like to play again? ");
			playAgain = stdin.nextBoolean();
		} while (playAgain);
		System.out.println("Thanks for playing. Goodbye.");
	}  // End of main()

	static void playGame() {
		int computersNumber;  // A random number picked by the computer
		int usersGuess;  // A number entered by the user as a guess
		int guessCount;  // The number of guesses the user has made
		Scanner stdin;
		computersNumber = (int)(100 * Math.random()) + 1;
		guessCount = 0;
		stdin = new Scanner(System.in);
		System.out.println();
		System.out.print("What is your first guess? ");
		while (true) {
			usersGuess = stdin.nextInt();  // Get the user's guess
			guessCount++;
			if (usersGuess == computersNumber) {
				System.out.println("You got it in " + guessCount + " guesses! My number was " + computersNumber);
				break;
			}
			if (guessCount == 6) {
				System.out.println("You didn't get the number in 6 guesses.");
				System.out.println("You lose. My number was " + computersNumber);
				break;  // The game is over; the user has lost
			}
			// If we get to this point, the game continues
			// Tell the user if the guess was too high or too low
			if (usersGuess < computersNumber) {
				System.out.print("That's too low. Try again: ");
			} else if (usersGuess > computersNumber) {
				System.out.print("That's too high. Try again: ");
			}
		}
		System.out.println();

	}  // End of playGame()

}  // End of class GuessingGame