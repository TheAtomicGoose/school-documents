/*
 * Lesson 1011 Coding Activity 
 * 
 * Input a String to represent the octal number and translate to the base ten number. 
 * The octal number must be 8 digits or less. 
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity {

	public static void main(String[] args) {
		
		int pow0, pow1, pow2, pow3, pow4, pow5, pow6, pow7;
		int decimal;
		String stringVer;
		int flag = 0;

		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a number in base 8:");
		int octal = stdin.nextInt();
		int temp = octal;
		stringVer = String.valueOf(octal);

		for (int i = 0; i < 8; i++) {
			if (temp % 10 > 7) {
				flag = 1;
			}
			temp /= 10;
		}

		if (stringVer.length() > 8 || flag == 1) {
			System.out.println("ERROR: Incorrect Octal Format");
			return;
		}

		pow0 = octal % 10;
		octal /= 10;
		pow1 = octal % 10;
		octal /= 10;
		pow2 = octal % 10;
		octal /= 10;
		pow3 = octal % 10;
		octal /= 10;
		pow4 = octal % 10;
		octal /= 10;
		pow5 = octal % 10;
		octal /= 10;
		pow6 = octal % 10;
		octal /= 10;
		pow7 = octal % 10;

		decimal = (pow0 * 1 + pow1 * 8 + pow2 * 64 + pow3 * 512 + pow4 * 4096
				+ pow5 * 32768 + pow6 * 262144 + pow7 * 2097152);

		System.out.println(decimal);

	}
}
