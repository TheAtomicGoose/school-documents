/*
 * Lesson 10 Coding Activity Question 1
 * 
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 * 
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 * 
 * Sample run:
 * 
 *      Please enter two decimal values:
 *      2
 *      1.473
 *     
 *      The difference is: 0.527
 * 
 * Use this starter file as your template.
 * 
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_10_Activity {
    public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter two doubles: ");
		double num1 = stdin.nextDouble();
		double num2 = stdin.nextDouble();
		int temp = (int)Math.round(num2 * 1000);
		System.out.println((double)((num1 * 1000) - temp) / 1000);
    }
}
