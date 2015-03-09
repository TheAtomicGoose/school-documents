import java.util.Scanner;  // Dealing with contents of file
import java.io.File;  // Opening file
import java.io.FileNotFoundException;  // Managing file exceptions

/**
 * This program reads information from a file called sales.dat, which is
 * formatted like so:
 *		...
 *		San Francisco:  19887.32
 *		Chicago:  no report receieved
 *		New York:  298734;12
 *		...
 * The program returns the total sales of all the cities put together, as
 * well as the number of cities for which data was not available.
 *
 * Written as an exercise for the Java Notes online textbook on 03-06-2015
 * by Jesse Evers.
 */

public class Sales {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file;  // Stores the file to be read from
		Scanner stdin;  // For reading the file
		double sales;  // Total sales
		int noData;  // Number of cities with no data
		String originalLine;  // Original form of current line
		String strippedLine;  // Version of currentLine without whitespace
		double currentSales;  // Sales of current city

		file = new File("./sales.dat");
		stdin = new Scanner(file);
		sales = 0;
		noData = 0;

		while (stdin.hasNextLine()) {
			originalLine = stdin.nextLine();
			strippedLine = "";
			for (int i = 0; i < originalLine.length(); i++) {
				if (!(originalLine.charAt(i) == ' ')) {
					strippedLine += originalLine.charAt(i);
				}
			}
			if (Character.isLetter(strippedLine.charAt(strippedLine.indexOf(':') + 1))) {
				noData++;
			} else {
				currentSales = Double.parseDouble(strippedLine.substring(strippedLine.indexOf(':') + 1));
				sales += currentSales;
			}
		}

		System.out.println("The total sales are $" + sales);
		System.out.println(noData + " cities did not have sales data.");
	}
}