/**
 * This program prints out any command line arguments entered by the user.
 *
 * Copied from http://math.hws.edu/javanotes/c4/s3.html on 02-27-2015 by
 * Jesse Evers.
 */

public class CLDemo {

	public static void main(String[] args) {
		
		System.out.println("You entered " + args.length + " command-line arguments");
		if (args.length > 0) {
			System.out.println("They were:");
			for (int i = 0; i < args.length; i++) {
				System.out.println("  " + args[i]);
			}
		}

	}  // End of main()

}  // End of CLDemo