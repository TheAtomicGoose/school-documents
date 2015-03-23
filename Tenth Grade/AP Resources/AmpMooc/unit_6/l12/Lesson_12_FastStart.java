import java.util.ArrayList;

/**
 * This program prints out two random strings from an ArrayList of 10
 * strings.
 *
 * Written as an exercise for AmplifyMOOC on 03-18-2015 by Jesse Evers.
 */

public class Lesson_12_FastStart {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        int randomNum;
        int oldRandomNum;

        words.add("this");
        words.add("is");
        words.add("a");
        words.add("bunch");
        words.add("of");
        words.add("random");
        words.add("words");
        words.add("in");
        words.add("an");
        words.add("arraylist");

        randomNum = (int) (Math.random() * 10);
        System.out.println(words.get(randomNum));
        oldRandomNum = randomNum;

        randomNum = (int) (Math.random() * 10);
        boolean different = false;
        while (!different) {
            if (randomNum == oldRandomNum) {
                randomNum = (int) (Math.random() * 10);
            } else {
                different = true;
            }
        }
        System.out.println(words.get(randomNum));
    }
}
