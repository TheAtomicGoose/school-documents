/*
 * This program performs some mathematical computations and displays the
 * results. It also displays the value of the constant Math.PI. It then
 * reports the number of seconds that the computer spent on this task.
 *
 * This program was copied from http://math.hws.edu/javanotes/c2/s3.html on
 * 02-05-2015 by Jesse Evers
 */

public class TimedComputation {

	public static void main(String[] args) {

		long startTime;  // Starting time of program in milliseconds
		long endTime;  // Time when computations are done, in milliseconds
		double time;  // Time difference, in seconds

		startTime = System.currentTimeMillis();

		double width, height, hypotenuse;  // Sides of a triangle
		width = 42.0;
		height = 17.0;
		hypotenuse = Math.sqrt( width*width + height*height );
		System.out.print("A triangle with sides 42 and 17 has hypotenuse ");
		System.out.println(hypotenuse);

		System.out.println("\nMathematically, sin(x)*sin(x) + "
			   + "cos(x)*cos(x) - 1 should be 0.");
		System.out.println("Let's check this for x = 1:");
		System.out.print("		sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
		System.out.println( Math.sin(1)*Math.sin(1)
				+ Math.cos(1)*Math.cos(1) - 1 );
		System.out.println("(There can be round-off errors when"
				+ " computing with real numbers!)");
		System.out.print("\nHere is a random number:  ");
		System.out.println( Math.random() );

		System.out.print("The value of Math.PI is ");
		System.out.println( Math.PI );

		endTime = System.currentTimeMillis();
		time = (endTime - startTime) / 1000.0;

		System.out.print("\nRun time in seconds was:  ");
		System.out.println(time);
	}  // End of main()

} // End of class TimedComputation
