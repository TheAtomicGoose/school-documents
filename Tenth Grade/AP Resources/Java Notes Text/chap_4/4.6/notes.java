/* #### More on Program Design #### */
/* ________________________________ */


/* 4.6.1 Preconditions and Postconditions */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * A convenient way to express the contract of a method is in terms of preconditions and postconditions.
 *
 * A precondition of a method is something that must be true when the method is called for the method to work
 * correctly.
 *
 * A postcondition of a method is something that will be true after the method has run, assuming that the
 * precondition is met.
 */


/* 4.6.2 A Design Example */
/* \\\\\\\\\\\\\\\\\\\\\\ */

/*
 * In this example, we will use pre-written methods as building blocks, and will design new methods that are
 * needed to complete the project. The final program will rely on Mosaic.java and MosaicPanel.java, which can
 * be found in the current directory.
 *
 * The program will fill the window with randomly colored squares, then randomly change the color of one
 * square at a time until the window is closed.
 *
 * Let the pseudocode begin:
 */

/* Round One */

	Open a Mosaic window
	Fill window with random colors
	Move around, changing squares at random


/*
 * Filling the window with random colors is a coherent task which can be made into a separate method. With
 * the third task expanded a bit:
 */

/* Round Two */

	Open a Mosaic window
	Fill the window with random colors
	As long as the Mosaic window is open:
		Randomly change color of the square at the current position
		Move current position up, down left, or right, at random


/*
 * The current position can be represented with two integer variables which hold the row and column number
 * of the square where the color is currently being changed. Changing to a random color and moving randomly
 * are going to be two separate methods.
 */

/* Round Three */
Mosaic.open(16, 20, 25, 25);
fillWithRandomColors();
currentRow = 8;  // Middle row, halfway down the window
currentColumn = 10;  // Middle column
while (Mosaic.isOpen()) {
	changeToRandomColor()(currentRow, currentColumn);
	randomMove();
}

/*
 * To keep the program from running much too quickly, Mosaic.delay(1); is added to the while loop.
 *
 * The main() method is finished, but to complete the program, fillWithRandomColors(),
 * changeToRandomColor(int, int), and randomMove() have to be written.
 */

/* Pseudocode for the fillWithRandomColors() method, Round One: */
For each row:
	For each column:
		set the square in that row and column to a random color

/* Round Two, proper Java: */
static void fillWithRandomColors() {
	for (int row = 0; row < 16; row++) {
		for (int column = 0; column < 20; column++) {
			changeToRandomColor(row, column);
		}
	}
}

/*
 * For the changeToRandomColor method, the red, green, and blue values must be random numbers from 0 to 255.
 * This can be done like so:
 */
static void changeToRandomColor(int rowNum, int colNum) {
	int red = (int)(256 * Math.random());
	int green = (int)(256 * Math.random());
	int blue = (int)(256 * Math.random());
	Mosaic.setColor(rowNum, colNum, red, green, blue);
}

/*
 * The randomMove() method is supposed to randomly move the square whose color is supposed to be changed up,
 * down, left, or right. The method also needs to prevent the random square from being off of the grid.
 */
int directionNum;
directionNum = (int)(4 * Math.random());
switch (directionNum) {
	case 0:  // Move up
		currentRow--;
		if (currentRow < 0) {  // currentRow is outside the mosaic
			currentRow = 15;  // Move it to the opposite edge
		}
		break;
	case 1:  // Move right
		currentColumn++;
		if (currentColumn >= 20) {  // currentColumn is outside the mosaic
			currentColumn = 0;  // Move it to the opposite edge
		}
		break;
	case 2:  // Move down
		currentRow++;
		if (currentRow >= 16) {  // currentRow is outside the mosaic
			currentRow = 0;  // Move it to the opposite edge
		}
		break;
	case 3:  // Move left
		currentColumn--;
		if (currentColumn < 0) {  // currentColumn is outside the mosaic
			currentColumn = 19;  // Move it to the opposite edge
		}
		break;
}


/* 4.6.3 The Program */
/* \\\\\\\\\\\\\\\\\ */

/*
 * The methods from the last subsection (4.6.2) can be found in RandomMosaicWalk.java.
 */