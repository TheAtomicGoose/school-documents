/* #### Introduction to Arrays #### */
/* ________________________________ */


/* 3.8.1 Creating and Using Arrays */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * A data structure consists of a numbe rof data items chunked together so
 * that they can be treated as a unit. An array is a data structure in which
 * the items are arranged as a numbered sequence. In Java, all the items in
 * an array must be of the same type. The number of items in an array is
 * called the length of an array. The type of the individual items in an array
 * is called the base type of the array. The position number of an item in an
 * array is called the index of that array.
 *
 * Arrays are useful if you want to hold many similar pieces of data. If you
 * wanted to hold 1000 names, before you knew about arrays you would have to
 * make 1000 separate variables and 1000 separate print statements to print
 * out the names, but with an array, you can use one variable and iterate over
 * the names to print them out. The items in an array are more often referred
 * to as the elements of the array.
 *
 * To refer to a specific element of an array, you use the syntax:
 */

arrayName[indexNumber];

/* The length of an array is found like so: */

arrayName.length;

/* Arrays are declared with the syntax: */

typeName[] varName;

/* For example: */

double[] prices;

/* However, to actually create the array, the following is necessary: */

prices = new double[100];  // Has 100 elements!

/* General array syntax is: */

arrayVariable = new baseType[arrayLength];


/* 3.8.1 Arrays and FOR Loops */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Much of the power of arrays comes from the fact that indices can be given
 * by an integer or an integer-valued expression. For instance, list[2*i+1] is
 * a valid index (if list has at least 2*i items in it).
 *
 * An example of this is:
 */

int i;  // The array index
for (i = 0; i < list.length; i++) {
	System.out.println(list[i]);
}

/* Another example, which finds the average of an array of doubles: */

double total;
double average;
int i;
total = 0;
for (i = 0; i < list.length; i++) {
	total = total + A[i];  // Add element number i to the total
}
average = total / A.length;  // A.length is the number of items

/*
 * Another typical problem done with arrays and loops is finding the largest
 * number in an array:
 */

double max;  // The largest number so far
max = A[0]  // At first, the largest number is A[0]
int i;
for (i = 1; i < A.length; i++) {
	if (A[i] > max) {
		max = A[i];
	}
}

/*
 * If you only wanted to average elements in an array that weren't zero, you
 * would do something like this:
 */

double total;  // The sum of the non-zero numbers in the array
int count;  // The number of non-zero numbers
double average;  // The average of the non-zero numbers
int i;
total = 0;
count = 0;
for (i = 0; i < A.length; i++) {
	if (A[i] != 0) {
		total =+ A[i];  // Add element to the total
		count += 1;  // Count the element once it's processed
	}
}
if (count == 0) {
	System.out.println("There were no non-zero elements.");
} else {
	average = total / count;  // Divide by number of items
	System.out.printf("Average of %d elements is %1.5g%n", count, average);
}


/* 3.8.3 Random Access */
/* \\\\\\\\\\\\\\\\\\\ */

/*
 * The type of access in this file so far is sequential access, in which you 
 * access each element in order. However, one of the big advantages of arrays
 * is that they allow random access, which means that you can access any 
 * element at any time.
 *
 * As an example, let's look at a problem called the birthday problem. With
 * N people in a room, what is the chance that there are two people in the
 * room who have the same birthday? Or, as this program will do, if you're 
 * checking people at random, how many people will you have to check before
 * you check two people with the same birthday?
 *
 * To simulate this, we'll need to keep track of the birthdays of people that
 * we've found. To hold this data, we'll use a boolean array 365 elements
 * long. The value of an element in the array is true if someone has been
 * found with that birthday. Before an element is set to true, it is checked
 * to see if that element is already true, in which case someone already has
 * been found with that birthday and the program is done.
 *
 * SEE BIRTHDAYPROBLEM.JAVA FOR THE CODE FOR THE PROBLEM ABOVE 
 */


/* 3.8.4 Partially Full Arrays */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * For some applications, you might not know the number of items that you
 * want to be stored in an array until after the program runs. Since the size
 * of the array can't be changed, a count has to be kept of how many elements
 * of the array are in use.
 *
 * For an example of this, SEE REVERSEINPUTNUMBERS.JAVA.
 */


/* 3.8.5 Two-Dimesional Arrays */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * So far in this file, all the arrays have been one-dimesional, meaning that
 * they can be thought of as being laid out along a line. It is also possible
 * to have two-dimesional arrays, where the elements can be laid out in a
 * grid. A two-dimesional array is an array of arrays.
 *
 * The syntax for a two-dimesional array is similar to that of one-dimesional
 * arrays, except that an extra index is involved:
 */

int [][] A;
A = new int[5][7];

/*
 * This creates an array with 5 arrays inside it, each of which in turn has
 * 7 elements. Two-dimesional arrays are often processed using nested FOR
 * loops:
 */

int row, col;
for (row = 0; row < 5; row++) {
	for (col = 0; col < 7; col++) {
		System.out.printf("%7d", A[row][col]);
	}
	System.out.println();
}

/*
 * 2D arrays can be used to store the contents of a board in a game such as
 * chess or checkers. However, sometimes two-dimesional arrays are used for
 * things that are not as grid-like as a board game. An example is a company
 * with data about the profit earned at each store for each month in the year
 * 2014. If the stores are numbered from 0 to 24, and the twelve months of the
 * year are numbered from 0 to 11, then the profit dat could be stored in the
 * following two-dimesional array:
 */

double[][] profit;
profit = new double[25][12];

/*
 * To print out the total profit from the previous two-dimesional array, you
 * could do something like this:
 */

double totalProfit;  // Company's total profit in 2014
int store, month;  // Variables for looping through the stores and months
totalProfit = 0;
for (store = 0; store < 25; store++) {
	for (month = 0; month < 12; month++) {
		totalProfit += profit[store][month];
	}
}
