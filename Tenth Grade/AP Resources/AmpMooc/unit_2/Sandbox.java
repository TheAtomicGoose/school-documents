/* This file is just for screwing around with Unit 2 stuff */

import java.util.Scanner;

public class Sandbox {
    
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter the first octet: ");
		int oct1 = stdin.nextInt();
		System.out.print("Please enter the second octet: ");
		int oct2 = stdin.nextInt();
		System.out.print("Please enter the third octet: ");
		int oct3 = stdin.nextInt();
		System.out.print("Please enter the fourth octet: ");
		int oct4 = stdin.nextInt();

		String ip = "";

		if (!(oct1 >= 0 && oct1 <= 255)) {
			System.out.println("Octet 1 is incorrect");
		} else {
			ip += oct1;
		}

		if (!(oct2 >= 0 && oct2 <= 255)) {
			System.out.println("Octet 2 is incorrect");
		} else {
			ip += ("." + oct2);
		}

		if (!(oct3 >= 0 && oct3 <= 255)) {
			System.out.println("Octet 3 is incorrect");
		} else {
			ip += ("." + oct3);
		}

		if (!(oct4 >= 0 && oct4 <= 255)) {
			System.out.println("Octet 4 is incorrect");
		} else {
			ip += ("." + oct4);
		}

		if ((oct1 >=0 && oct1 <= 255)) {
			if ((oct2 >= 0 && oct2 <= 255)) {
				if ((oct3 >= 0 && oct3 <= 255)) {
					if ((oct4 >= 0 && oct4 <= 255)) {
						System.out.println(ip);
					}
				}
			}
		} 
	}    
}
