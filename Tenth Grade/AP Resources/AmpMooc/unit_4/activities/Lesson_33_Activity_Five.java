/**
 * Takes an array of integers, an integer value, and an index number, and inserts the integer value at the
 * location of the index, and bump the array items after the index number up one index.
 *
 * Written as an exercise for AmplifyMOOC on 03-03-2015 by Jesse Evers.
 */

public class Lesson_33_Activity_Five {

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


	public static void insertValue(int[] intArray, int value, int index) {

		int[] temp = new int[intArray.length];

		for (int i = 0; i < intArray.length; i++) {
			temp[i] = intArray[i];
		}

		intArray[index] = value;

		for (int i = index + 1; i < intArray.length; i++) {
			intArray[i] = temp[i - 1];
		}
	}  // End of insertValue


	public static void main(String[] args) {
		
		int[] userNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		insertValue(userNums, 1, 1);
		printIt(userNums);
	}  // End of main
}