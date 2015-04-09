import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program takes a list of names from the user, puts them into title
 * case (first letter capitalized), and sorts them alphabetically.
 */

public class InsertNames {

    public static void main(String[] args) {

        // Define variables
        Scanner stdin;
        ArrayList <String> names = new ArrayList<String>();
        String currentName;
        int count;
        boolean sorted;

        // Initialize Scanner and count
        stdin = new Scanner(System.in);
        sorted = false;

        // This loop takes user input until the user enters STOP
        while (true) {
            System.out.print("Enter a name: ");
            currentName = stdin.nextLine();

            if(currentName.toUpperCase().equals("STOP")) {
                break;
            } else {
                names.add(titleCase(currentName));
            }
        }

        while (!sorted) {
            String temp;
            count = 0;

            if (names.size() == 0 || names.size() == 1) {
                break;
            }

            for (int i = 1; i < names.size(); i++) {
                if (names.get(i).compareTo(names.get(i - 1)) < 0) {
                    temp = names.get(i);
                    names.set(i, names.get(i - 1));
                    names.set(i - 1, temp);
                } else {
                    count++;
                }

                if (count == names.size() - 1) {
                    sorted = true;
                }
            }
        }

        // Prints out the names in alphabetical order
        System.out.println(names.toString());
    }

    /**
     * Takes a string and returns it in title case.
     * @param s the string to be put into title case
     * @return <code>s</code> in title case
     */
    public static String titleCase(String s) {

        s = s.toLowerCase();
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}