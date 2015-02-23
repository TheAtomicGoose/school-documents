/*
 * This program was written as an assignment for AmplifyMOOC. It checks the 
 * validity of a tweet. It checks if the tweet is less than 140 characters,
 * the number of mentions, hashtags, and links. If the tweet is too long, it
 * doesn't do anything other than tell you how many characters over you are.
 *
 * Written by Jesse Evers on 02-19-2015.
 */

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {

		Scanner stdin;
		String tweet;
		int length;
		int mentions, hashtags, links;
		int excess;

		stdin = new Scanner(System.in);
		System.out.println("Please enter a tweet:");
		tweet = stdin.nextLine();
		length = tweet.length();

		if (length > 140) {
			excess = length - 140;
			System.out.println("Excess Characters: " + excess);
			return;
		} else {
			System.out.println("Length Correct");
		}

		mentions = 0;
		hashtags = 0;
		links = 0;

		int i = 0;
		while (i <= length - 1) {
			if (tweet.charAt(i) == '@') {
				if (length - 1 > i && tweet.charAt(i + 1) != '\t' && tweet.charAt(i + 1) != ' ') {
					mentions++;
				}
			}
			if (tweet.charAt(i) == '#') {
				if (length - 1 > i && tweet.charAt(i + 1) != '\t' && tweet.charAt(i + 1) != ' ') {
					hashtags++;
				}
			}
			if (i <= length - 7 && tweet.substring(i, i + 7).equalsIgnoreCase("http://")) {
				links++;
			}
			i++;
		}

		System.out.println("Number of Hashtags: " + hashtags);
		System.out.println("Number of Attributions: " + mentions);
		System.out.println("Number of Links: " + links);
	}
}
