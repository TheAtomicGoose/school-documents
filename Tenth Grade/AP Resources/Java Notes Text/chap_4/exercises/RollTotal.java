import java.util.Scanner;

/**
 * This program takes a number between 2 and 12 from the user and returns
 * the number of rolls it took with two dice to get that total (the total
 * being the values of the two dice added together).
 *
 * Written as an exercise for the Java Notes online textbook on 03-13-2015
 * by Jesse Evers.
 */

 public class RollTotal {

     public static int numRolls(int total) {

         if (total < 2 || total > 12) {
             throw new IllegalArgumentException("Impossible total for a pair of dice.");
         }

         int die1, die2;  // The two dice
         int bothDice;  // The total of the two dice
         int count;  // Number of rolls

         bothDice = 0;
         count = 0;

         while (true) {
             die1 = (int)(Math.random() * 6) + 1;
             die2 = (int)(Math.random() * 6) + 1;

             bothDice = die1 + die2;
             count++;
             if (bothDice == total) {
                 break;
             }
         }

         return count;
     }

     public static void main(String[] args) {

         Scanner stdin;
         int input;

         System.out.print("Please enter a number between 2 and 12 inclusive to see how many rolls it takes with 2 dice to get that number: ");
         stdin = new Scanner(System.in);
         input = stdin.nextInt();

         System.out.println(numRolls(input));
     }
 }
