import java.util.Scanner;  // For getting user input

/**
 * This program takes a string from the user and capitalizes the first
 * letter of each word.
 */

public class Capitalize {

    public static String printCapitalized(String s) {

        String upperString;

        upperString = "";

        if (Character.isLetter(s.charAt(0))) {
            upperString += Character.toUpperCase(s.charAt(0));
        } else {
            upperString += s.charAt(0);
        }
        for (int i = 1; i < s.length(); i++) {
            if (!(Character.isLetter(s.charAt(i - 1)))) {
                upperString += Character.toUpperCase(s.charAt(i));
            } else {
                upperString += s.charAt(i);
            }
        }

        return upperString;
    }

    public static void main(String[] args) {

        Scanner stdin;
        String input;

        stdin = new Scanner(System.in);
        System.out.println("Please enter a string to be capitalized:");
        input = stdin.nextLine();
        System.out.println(printCapitalized(input));
    }
}
