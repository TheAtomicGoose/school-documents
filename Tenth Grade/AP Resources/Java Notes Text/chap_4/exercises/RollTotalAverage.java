/**
 * This program checks the average number of rolls (across 10000 tests)
 * with two dice that it takes to roll every number in 2..12 inclusive. It
 * returns the results as a table of values.
 *
 * Written as an exercise for the Java Notes online textbook on 03-13-2015
 * by Jesse Evers.
 */

 public class RollTotalAverage {

     /**
      * This method returns the average number of rolls (across 10000
      * tests) that it takes to roll a certain number with two dice.
      * @param total the number that is being checked for
      * @return the average number of rolls that it took to roll total
      *     across 10000 tests
      */
     public static double numRolls(int total) {

         if (total < 2 || total > 12) {
             throw new IllegalArgumentException("Impossible total for a pair of dice.");
         }

         int die1, die2;  // The two dice
         int bothDice;  // The total of the two dice
         int count;  // Number of rolls
         double sum;  // Total number of rolls across the 10000 tests

         bothDice = 0;
         count = 0;
         sum = 0;

         for (int i = 0; i < 10000; i++) {
             while (true) {
                 die1 = (int)(Math.random() * 6) + 1;
                 die2 = (int)(Math.random() * 6) + 1;

                 bothDice = die1 + die2;
                 count++;
                 if (bothDice == total) {
                     sum += count;
                     break;
                 }
             }
             count = 0;
         }

         return sum / 10000;
     }

     public static void main(String[] args) {

         System.out.println("Total On Dice\tAverage Number of Rolls");
         System.out.println("-------------\t-----------------------");
         for (int i = 2; i <= 12; i++) {
             System.out.println("        " + i + "     \t     " + numRolls(i));
         }
     }
 }
