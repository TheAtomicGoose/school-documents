/*
 * This program takes a user's birthday in the format "3 17" where the first
 * number is the month and the second number is the day of the month. It will
 * then print out their birthday in the form "March seventeenth." It will also
 * tell them what their horoscope sign is.
 *
 * This program was written as an exercise for AmplifyMOOC on 02-13-2015...
 * FRIDAY THE THIRTEENTH
 * by Jesse Evers.
 */

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);  // For getting user input
		String userHoroscope;
		int month, day;  // Numerical month and day of birth
		String[] months = {"", "January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"};
		String[] days = {"", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", 
			"eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", 
			"fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", 
			"twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", 
			"twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first"};
		String[] horoscope = {"", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", 
			"Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"};
		int[] runningDate = {0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
		int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		System.out.println("What month were you born in? (number)");
		month = stdin.nextInt();
		System.out.println("What day? (number)");
		day = stdin.nextInt();

		if (month < 1 || month >= 12) {
			System.out.println("error");
			return;
		} else if (day < 1 || day > daysInMonth[month]) {
			System.out.println("error");
			return;
		}

		System.out.println("Your birthday is: " + months[month] + " " + days[day]);

		int horoscopeDate = runningDate[month] + day;

		if (horoscopeDate >= 20 && horoscopeDate <= 49) {
			userHoroscope = horoscope[1];
		} else if (horoscopeDate >= 50 && horoscopeDate <= 80) {
			userHoroscope = horoscope[2];
		} else if (horoscopeDate >= 81 && horoscopeDate <= 110) {
			userHoroscope = horoscope[3];
		} else if (horoscopeDate >= 111 && horoscopeDate <= 141) {
			userHoroscope = horoscope[4];
		} else if (horoscopeDate >= 142 && horoscopeDate <= 172) {
			userHoroscope = horoscope[5];
		} else if (horoscopeDate >= 173 && horoscopeDate <= 204) {
			userHoroscope = horoscope[6];
		} else if (horoscopeDate >= 205 && horoscopeDate <= 235) {
			userHoroscope = horoscope[7];
		}else if (horoscopeDate >= 236 && horoscopeDate <= 266) {
			userHoroscope = horoscope[8];
		}else if (horoscopeDate >= 267 && horoscopeDate <= 296) {
			userHoroscope = horoscope[9];
		}else if (horoscopeDate >= 297 && horoscopeDate <= 326) {
			userHoroscope = horoscope[10];
		}else if (horoscopeDate >= 327 && horoscopeDate <= 354) {
			userHoroscope = horoscope[11];
		} else {
			userHoroscope = horoscope[12];
		}

		System.out.println(userHoroscope);

	}
}
