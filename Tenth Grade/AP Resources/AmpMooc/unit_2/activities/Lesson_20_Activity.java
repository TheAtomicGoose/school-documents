/*
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_20_Activity{

	public static void main(String[] args){

		Scanner stdin = new Scanner(System.in);
		double latitude;
		double longitude;
		int flag;
		double maxNorth, maxSouth, maxEast, maxWest;

		maxNorth = Double.MIN_VALUE;
		maxSouth = Double.MAX_VALUE;
		maxEast = Double.MIN_VALUE;
		maxWest = Double.MAX_VALUE;

		flag = 1;

		while (flag != 0) {
			System.out.println("Please enter the latitude:");
			latitude = stdin.nextDouble();
			System.out.println("Please enter the longitude:");
			longitude = stdin.nextDouble();

			if (latitude < -90 || latitude > 90) {
				System.out.println("Incorrect Latitude or Longitude");
				System.out.println("Please enter the latitude:");
				latitude = stdin.nextDouble();
				System.out.println("Please enter the longitude:");
				longitude = stdin.nextDouble();
			} else if (longitude < -180 || longitude > 180) {
				System.out.println("Incorrect Latitude or Longitude");
				System.out.println("Please enter the latitude:");
				latitude = stdin.nextDouble();
				System.out.println("Please enter the longitude:");
				longitude = stdin.nextDouble();
			} else {
				if (latitude > maxNorth) {
					maxNorth = latitude;
				}

				if (latitude < maxSouth) {
					maxSouth = latitude;
				}

				if (longitude > maxEast) {
					maxEast = longitude;
				}

				if (longitude < maxWest) {
					maxWest = longitude;
				}
			}

			System.out.println("Would you like to enter another location?");
			flag = stdin.nextInt();
		}

		System.out.println("Farthest North: " + maxNorth);
		System.out.println("Farthest South: " + maxSouth);
		System.out.println("Farthest East: " + maxEast);
		System.out.println("Farthest West: " + maxWest);

	}
}
