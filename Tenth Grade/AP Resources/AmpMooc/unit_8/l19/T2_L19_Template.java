/*
 * Lesson 19 - Unit 8 - 2-D Array
 */

import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;

class T2_Lesson19_Template{

    public static void randomizeScores(int ts[][]) {

        for (int i = 0; i < ts.length; i++) {
            for (int j = 0; j < ts[0].length; j++) {
                ts[i][j] = (int)(Math.random() * 40) + 60;
            }
        }
    }

    public static void printTestScores(int ts[][]) {
        for (int i = 0; i < ts.length; i++) {
            for (int j = 0; j < ts[0].length; j++) {
                System.out.print(ts[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void average(int ts[][], double a[]) {

        for (int i = 0; i < ts.length; i++) {
            double sum = 0;
            for (int j = 0; j < ts[0].length; j++) {
                sum += ts[i][j];
            }
            a[i] = sum / ts[0].length;
        }
    }

    public static void printAvg(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean improving(int a[]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void studentsImproving(int ts[][], boolean b[]) {
        for (int i = 0; i < ts.length; i++) {
            b[i] = improving(ts[i]);
        }
    }

    public static void printImproved(boolean a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void testAvg(int ts[][], int col) {
        int sum = 0;
        for (int i = 0; i < ts.length; i++) {
            sum += ts[i][col];
        }
        System.out.println((double)sum / ts.length);
    }

    public static void main(String str[]) throws IOException {

        int testScores[][] = new int[25][4];
        double average[] = new double[25];
        boolean better[] = new boolean[25];

        randomizeScores(testScores);
        printTestScores(testScores);
        testAvg(testScores, 0);
    }
}