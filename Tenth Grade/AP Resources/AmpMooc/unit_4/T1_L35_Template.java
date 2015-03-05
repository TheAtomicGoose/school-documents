/*
 * Lesson 35 - Unit 4 - Overloaded Methods
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


class t1_lesson35_template{

    public static int max (int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int max (int a, int b, int c) {

        return (max(max(a, b), c));
    }
    
    public static void main (String str[]) throws IOException {

        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter two integers: ");

        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("The larger of two numbers is: " + max(x, y));

        System.out.println("Enter a third integer: ");
        int z = scan.nextInt();

        System.out.println("The largest of three numbres is: " + max(x, y, z));

        }

}