/**
 * Takes an array of integers and prints them out in reverse order.
 *
 * Written as an exercise for AmplifyMOOC on 03-03-2015 by Jesse Evers.
 */

public class Lesson_33_Activity_Four {

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


	public static void reverse(int[] intArray) {

		int[] temp = new int[intArray.length];

		for (int i = 0; i < intArray.length; i++) {
			temp[i] = intArray[i];
		}

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = temp[temp.length - 1 - i];
		}
	}  // End of reverse


	public static void main(String[] args) {
		
		int[] userNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		reverse(userNums);
		printIt(userNums);
	}  // End of main
}