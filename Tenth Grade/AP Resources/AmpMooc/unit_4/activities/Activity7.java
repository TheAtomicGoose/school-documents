import java.util.Scanner;  // For getting user input

/**
 * This program takes two base ten numbers from the user, prints out their
 * binary equivalents, and prints out the binary equivalent of the sum of
 * the two base ten numbers.
 *
 * Written as an activity for AmplifyMOOC on 03-04-2015 by Jesse Evers.
 */

public class Activity7 {

	public static int[] convertToBinary(int b) {

		int[] binaryVer = {0, 0, 0, 0, 0, 0, 0, 0};

		int count = 0;
		for (int i = 128; i >= 1; i /= 2) {
			if (b >= i) {
				binaryVer[count] = 1;
				b -= i;
			}
			count++;
		}

		return binaryVer;
	}

	public static void printBin(int b[]) {

		for (int i = 0; i < b.length; i++) {
			if (i == b.length - 1) {
				System.out.println(b[i]);
			} else {
				System.out.print(b[i] + " ");
			}
		}
	}

	public static int[] addBin(int a[], int b[]) {

		printBin(a);
		printBin(b);
		int num1, num2;
		int sum;
		int pow;
		num1 = 0;
		num2 = 0;
		pow = 7;

		for (int i = 0; i < 8; i++) {
			if (a[i] == 1) {
				num1 += Math.pow(2, pow);
			}

			if (b[i] == 1) {
				num2 += Math.pow(2, pow);
			}
			pow--;
		}
		pow = 0;

		sum = num1 + num2;
		System.out.println(sum);
		return convertToBinary(sum);
	}

	public static void main(String[] args) {
		
		Scanner stdin;
		stdin = new Scanner(System.in);
		int userNum1, userNum2;

		System.out.println("Enter a base ten number between 0 and 255,inclusive.");
		userNum1 = stdin.nextInt();
		System.out.println("Enter a base ten number between 0 and 255,inclusive.");
		userNum2 = stdin.nextInt();

		System.out.println("First binary number:");
		printBin(convertToBinary(userNum1));

		System.out.println("Second binary number:");
		printBin(convertToBinary(userNum2));

		System.out.println("Added:");
		printBin(addBin(convertToBinary(userNum1), convertToBinary(userNum2)));
	}
}