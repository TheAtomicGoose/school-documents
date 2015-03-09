/* #### Some Standard Classes #### */
/* _______________________________ */


/* The OBJECT Class */

/* The Universal Superclass */
Every class automatically extends Object{}, which makes Object either a direct or indirect superclass of every other class.
Methods in Object can be overridden if they don't make sense for the class being{} written.

/* Methods in OBJECT */
// The toString Method
toString returns a version of your object in String form. If you try to use toString on an object, it will just return a memory address, so toString has to be
overridden with a method that makes sense for the current class.

// The equals Method
equals returns true if this object and the other are the same object (e.g., referencing the same memory slot).

// The hashCode Method
hashCode returns an integer that is produced by a formula which maps your object to an address in a hash table.


/* The STRING Class */

/* String Objects */
All string literals, such as "", "string", or "stuff\n", are instances of the String class. Strings are also immutable, which means that they cannot be changed
once created. 

/* Constructing STRING Objects */
Ways to initialize a string:

String s = "abc";
String s = new String("abc");
String s1 = null;  // Creates a null reference
String s2 = new String();  // Empty character sequence

/* The Concatenation Operator */
+ can be used to combine to strings, for instance:
"hi my name is " + "Jesse" is the same as "hi my name is Jesse"

/* Comparison of STRING Objects */
There are two ways to compare String objects. You can use the equals method, which is overridden in the String class:
string1.equals(string2)
Or you can use the compareTo method:
string1.compareTo(string2)
If the above code is < 0, then string1 precedes string2 in the dictionary
If the above code is > 0, then string2 precedes string1 in the dictionary
If the above code is equal to 0, then string1 and string2 are identical

/* Other STRING Methods */
int length()  -- returns the length of the string
String substring(int startIndex)  -- returns a new string which is a substring of this string, starting at character startIndex
String substring(int startIndex, int endIndex)  -- same as last, except the substring goes from the character at startIndex to the character before endIndex
int indexOf(String str)  -- returns the index of the first occurrence of str within this string.


/* Wrapper Classes */

A wrapper class takes an existing object or primitive value, wraps it into an object, and provides an new set of methods for that type.
The point of a wrapper clsas is to provide extended capabilities for the boxed quantity.
A wrapper class allows{}
	construction of an object from a single value
	retrieval of the primitive value

/* The Integer Class */
Methods:
	Integer(int value)  -- Constructs an Integer object from an int
	int compareTo(Object other)  -- returns 0 if the values are equal, < 0 if this is less than other, and > 0 if this is greater than other
	int intValue()  -- returns the value of this as an int
	boolean equals(Object obj)  -- returns true if and only if this equals obj
	String toString()  -- returns a String representing the value of this Integer

/* The Double Class */
Methods:
	Double(double value)  -- constructs a Double object from a double
	double doubleValue()  -- returns the value of this Double as a double
	int compareTo(Object other)  -- same as compareTo above, but with doubles instead of ints
	boolean equals()  -- same as equals above, but with doubles instead of ints
	String toString()  -- returns a String representing the value of this

/* The MATH Class */
This class implements{} standard mathematical functions. The ones that I need to know for the AP Exam:

static int abs(int x)  -- returns the absolute value of integer x
static double abs(double x)  -- returns the absolute value of double x
static double pow(double base, double exp)  -- returns base^exp
static double sqrt(double x)  -- returns the square root of x
static double random()  -- returns a random number r where 0.0 <= r < 1.0


/* Random Numbers */
double r = Math.random() produces a random real number in the range 0.0 <= r < 1.0. It is possible to shift and scale this range.

Examples:
	double x = 6 * Math.random();  -- 0.0 <= x < 6.0
	double x = Math.random() + 2;  -- 2.0 <= x < 3.0
	double x = 2 * Math.random() + 4;  -- 4.0 <= x < 6.0

The general rule for producing random numbers between lowValue and highValue is:
	double x = (highValue - lowValue) * Math.random() + lowValue;

If you want random() to produce an integer, simply cast it to int:
	int x = (int)(6 * Math.random() + 2);