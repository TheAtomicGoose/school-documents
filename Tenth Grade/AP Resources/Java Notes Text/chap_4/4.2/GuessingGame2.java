/*
 * Variables inside of a method are local variables. However, variables
 * can be defined in a class outside of a method. These variables are
 * member, or global, variables. If they aren't private, they can be
 * accessed from outside the class.
 *
 * Member variables can be either static or non-static. This chapter's
 * notes will stick to static member variables. A static member variable
 * exists as long as the class exists, unlike local variables, which only
 * exist as long as the method they are in is running.
 *
 * The declaration of a member variable is outside any method, and is
 * marked by modifiers like static, public, and private. For example:
 */

/*
 static String usersName;
 public static int numberOfPlayers; 
 private static double velocity, time;
 */

 /*
  * Member variables are automatically initialized with a default value.
  * Numeric values are 0, boolean values are false, chars are the Unicode
  * code number 0, and objects' default value is null.
  */


/*
 * This program is a modified version of the GuessingGame program in this
 * directory. It uses member variables to keep track of the number of
 * games that the user has played, and the number they have won.
 *
 * This program was copied from http://math.hws.edu/javanotes/c4/s2.html
 * and modified to use the Scanner class instead of TextIO on 02-27-2015
 * by Jesse Evers.
 */

import java.util.Scanner;

public class GuessingGame2 {

	static int gamesPlayed;  // The number of games played
	static int gamesWon;     // The number of games won

	public static void main(String[] args) {
		/* 
		 * These two lines are actually redundant since gamesPlayed
		 * and gamesWon are automatically initialized to 0
		 */
		gamesPlayed = 0;
		gamesWon = 0;

		Scanner stdin = new Scanner(System.in);

		System.out.println("Let's play a game. I'll pick a number between");
		System.out.println("1 and 100, and you try to guess it.");
		boolean playAgain;
		do {
			playGame();  // Call method to play one time
			System.out.println("Would you like to play again? ");
			playAgain = stdin.nextBoolean();
		} while (playAgain);
		System.out.println();
		System.out.println("You played " + gamesPlayed + " games,");
		System.out.println("and you won " + gamesWon + " of those games.");
		System.out.println("Thanks for playing. Goodbye.");		
	}  // End of main()

	static void playGame() {
		int computersNumber;  // A random number picked by the computer
		int usersGuess;       // A number entered by the user as a guess
		int guessCount;       // Number of guesses the user has made
		Scanner stdin = new Scanner (System.in);  // For user input
		gamesPlayed++;
		/* Randomly picks a number between 1 and 100 inclusive */
		computersNumber = (int)(100 * Math.random()) + 1;
		guessCount = 0;
		System.out.println();
		System.out.print("What is your first guess? ");
		while (true) {
			usersGuess = stdin.nextInt();  // Get user's guess
			guessCount++;
			if (usersGuess == computersNumber) {
				System.out.println("You got it in " + guessCount
						+ " guesses! My number was " + computersNumber);
				gamesWon++;  // Count this win
				break;		 // The game is over 
			}
			if (guessCount == 6) {
				System.out.println("You didn't get the number in 6 guesses.");
				System.out.println("You lose. My number was " + computersNumber);
				break;  // The game is over; the user has lost
			}
			// If we get to this point, the game continues
			// Tell the user whether the guess was too high or too low
			if (usersGuess < computersNumber) {
				System.out.println("That's too low. Try again: ");
			} else if (usersGuess > computersNumber) {
				System.out.println("That's too high. Try again: ");
			}
			System.out.println("That's too high. Try again: ");
		}
		
	}  // End of playGame()

}  // End of GuessingGame2