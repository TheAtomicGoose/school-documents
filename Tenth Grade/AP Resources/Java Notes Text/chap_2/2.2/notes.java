2.2.2 Types
===========

// Byte is the smallest data type. Only holds 1 byte/8 bits of data
byte maxByteVal = 127;
byte minByteVal = -128;

// Short is the next smallest, and holds 2 bytes/16 bits
short maxShortVal = 32767;
short minShortVal = -32767;

// Next is int, holding 4 bytes/32 bits
int maxIntVal = 2147483647;
int minIntVal = -214748368

// Finally, long holds 8 bytes/64 bits.
long maxLongVal = 9223372036854775807;
long minLongVal = -9223372036854775808;

// Float holds 4 bytes/32 bits with up to 7 significant digits
float exFloat = 32.398923;

// Double can 8 bytes/64 bits with up to 15 significant digits
double exDouble = 32.123456789098765;

// A char holds a single Unicode character
char character = 'a';


2.2.5 Variables in Programs
===========================

// Only declare one variable per declaration statement unless
// they're closely related
int numberOfStudents;
String name;
double x, y;
boolean isFinished;
char firstInitial, middleInitial, lastInitial;

// It's good form to add a comment after each variable declaration
double principal;  // Amount of money invested
double interestRate;  // Rate as a decimal, not a percentage

/* Variables declared in a subroutine are called local variables for that
 * subroutine. They only exist inside the subroutine, and are only accessible
 * when the program is running. */
