/*
 * Lesson 4 - Unit 1  - Data types  
 */

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class t1_lesson04_template{


     public static void main (String str[]) throws IOException {

         
			Scanner stdin = new Scanner(System.in);
			System.out.println("Please input a decimal number: ");
            double x = stdin.nextDouble();
			
			System.out.println(x + " <-- the number you entered");

     }

}
