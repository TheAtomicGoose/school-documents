/*
 * Lesson 12 - Unit 2 - If's Making Decisions
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson12_template{

	public static void main (String str[]) throws IOException {

		Scanner stdin = new Scanner(System.in);
		double temperature = stdin.nextDouble();
		
		if (temperature > 98.6) {
			System.out.println("you have a fever");
		}	
	}

}
