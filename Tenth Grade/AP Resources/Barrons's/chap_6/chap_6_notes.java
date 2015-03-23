/* #### Arrays and Array Lists #### */

/* One Dimensional Arrays */
An array is a data structure used to implement a list object. Every
element in the array must be of the same data type (this is not true in
some languages).


// Initialization
An array is created with the keyword 'new'. The length of an array is fixed
once it is created. All of the following are equivalent:
//
double[] data = new double[25];
//
double data[] = new double[25];
//
double[] data;
data = new double[25];
//


// Initializer Lists
{
    int[] coins = new int[4];
    coins[0] = 1;
    coins[1] = 5;
    coins[2] = 5
    coins[2] = 10;
    coins[3] = 25;
}
Can be written as:
{
    int[] coins = {1, 5, 10, 25};
}


// Transversing an Array
A for-each loop can be used when you are not replacing or removing any
elements in an array, and just want to access every element in an array:

// Return the number of even integers in array arr of integers
public static int countEven(int[] arr) {
    int count = 0;
    for (int num : arr) {
        if (count % 2 == 0) {
            count++;
        }
    }
    return count;
}

All other times, use a for loop:

// Change each even-indexed element in array arr to 0
// Precondition: arr contains integers
// Postcondition: arr[0], arr[2], arr[4]...have value 0
public static void changeEven(int[] arr) {
    for (int i = 0; i < arr.length; i += 2) {
        arr[i] = 0;
    }
}


// Arrays as Parameters
Since arrays are objects, not primitive data types, you can actually change
them when they are passed into a method as a parameter.


/* Array Lists */
ArrayLists have the following advantages over arrays:
 - They shrink and grow dynamically (their length is not fixed)
 - The last slot of an ArrayList is always list.size() - 1
 - Insertion or deletion can be done with a single statement

// The Collections API
All of the collections classes are designed to be efficient, to provide
methods for insertion and removal of data, and provide for iteration over
the entire collection of data.

// The Collections Hierarchy
Many interfaces are used to manipulate collections.

// Collections and Generics
Collections classes are generic, with type parameters. That means that
List<E> and ArrayList<E> are both of type E.

// Auto-Boxing and -Unboxing
Primitive types are not allowed in collections classes. This means that
primitive types must be put in wrapper classes (boxed) before they are
inserted into an ArrayList.
Auto-boxing is the automatic wrapping of primitive types in their wrapper
classes.
The numerical value of an Integer or a Double is retrieved with .intValue()
and .doubleValue(). This is also done automatically (auto-unboxing).


/* The List<E> Interface */
A class that{} implements the List<E> interface is{} a list of elements of
type E.

// The Methods of List<E>
boolean add(E obj)  // Adds obj to the end of the list
int size()  // Returns the number of elements in the list
E get(int index)  // Returns the element at specified index in the list
E set(int index, E element)  // Replaces item at index with element
void add(int index, E element)  // Inserts element at index
E remove(int index)  // Removes and returns the element at index
Iterator<E> iterator()  // Returns an iterator over all the list items in order

// The ArrayList<E> Class
ArrayList is an implementation of the List<E> interface.
Shifting of elements is handled automatically by ArrayList.

// The Methods of ArrayList<E>
In addition to the add, size, get, set, add, remove, and iterator methods, ArrayList<E> has the ArrayList() constructor.


/* Collections and Iterators */
// Definition of an Iterator
An iterator is an object whose sole purpose is to traverse a collection one element at a time.

// The Iterator<E> Interface
java.util provides a generic interface, called Iterator<E>, whose methods are hasNext, next, and remove.

// The Methods of Iterator<E>
boolean hasNext()  // Returns true if there is at least one more element
E next()  // Returns the next element
void remove()  // Deletes the last element that was returned by next.

// Using a Generic Iterator
An iterator is made like so:
Iterator<String> itr = list.iterator();
When list is a List or ArrayList object.


/* Two-Dimensional Arrays */
A two-dimensional array is sometimes called a matrix.

// Declarations
Each of the following declares a two-dimensional array:
int[][] table;  // Table is currently a null reference
double[][] matrix = new double[3][4];  // matrix references a 3x4 array of real numbers
String[][] strs = new String[2][5];  // sts references a 2x5 array of null String objects

An initializer list can be used to make a two-dimensional array:
int[][] mat = { {3, 4, 5},
                {6, 7, 8} };

mat.length is equal to 2, since there are 2 lists contained in it.

// Processing a Two-Dimensional Array
Two-dimensional arrays are often processed with nested for loops. For instance:

// Find the sum of all elements in a matrix mat.
int sum = 0;
for (int r = 0; r < mat.length; r++) {
    for (int c = 0; c < mat[r].length; c++) {
        sum += mat[r][c];
    }
}
