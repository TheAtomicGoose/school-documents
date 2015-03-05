/**
 * Takes an array of integers and fills it with random ints from 10 to 99.
 *
 * Written as an exercise for AmplifyMOOC on 03-03-2015 by Jesse Evers.
 */

public class Lesson_33_Activity_Two {

	public static void printIt(int[] intArray) {

		int count;
		count = intArray.length;

		System.out.println("Your array printed out:");
		for (int i = 0; i < count; i++) {
			if (i != count - 1) {
				System.out.print(intArray[i] + " ");
			} else {
				System.out.print(intArray[i]);
			}
		}
		System.out.println();
	}  // End of printIt


	public static void randomize(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(90.random()) + 10;
		}
	}  // End of randomize


	public static void main(String[] args) {
		
		int[] userNums = new int[10];

		randomize(userNums);
		printIt(userNums);
	}  // End of main
}