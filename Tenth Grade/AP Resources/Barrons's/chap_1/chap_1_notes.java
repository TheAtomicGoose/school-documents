/* Packages and Classes */ 
// Import an entire package:
import packagename.*;
// Import a single class from a package:
import packagename.ClassName;
// Import a single class of a subpackage:
import packagename.subpackagename.ClassName;


/* Types and Identifiers */
// Integers don't have decimal places:
int x = 24;
int y = -2;
// Booleans are only true or false:
boolean ture = true;
boolean fasle = false;
// Doubles are floating point numbers:
double twoTimes = 2.345;
/* Hex numbers can be computed by taking each hex digit in the number, 
   replacing it with the binary number it represents, and multiplying 
   it by whatever place it's in minus one. E.g. */
Hex number: C2A
            (C)(16^2) + (2)(16^1) + (A)(16^0)
			(12)(16^2) + (2)(16^1) + (10)(16^0)
            3072 + 32 + 10
            3114

// Final variables are constants
// They conventionally are all caps
final double TAX_RATE = 12;


/* Operators */
// These can be applied to ints and doubles

Operator |         Meaning        | Example
============================================================
    +    |          addition      | 3 + x
    -    |        subtraction     | p - q
    *    |      multiplication    | 6 * i
    /    |         division       | 10 / 4  // Returns 2, not 2.5!
    %    |         modulus        | 11 % 8  // Returns 3
    ==   |        equal to        | if (x == 100)
    !=   |     not equal to       | if (age != 21)
    >    |     greater than       | if (salary > 30000)
    <    |       less than        | if (grade < 65)
    >=   |greater than or equal to| if (age >= 16)
    <=   | less than or equal to  | if (height <= 6)
    !    |          NOT           | if (!found)
    &&   |          AND           | if (x < 3 && y > 4)
    ||   |           OR           | if (age < 2 || height < 4)
     =   |    simple assignment   | x = 2
    +=   |        x = x + 4       | x += 4
    -=   |        y = y - 6       | y -= 6
    *=   |        p = p * 5       | p *= 5
    /=   |        n = n / 5       | n /= 5
    %=   |        n = n % 10      | n %= 10
    ++   | i is incremented by 1  | i++ or ++i
    --   | k is decremented by 1  | k-- or --k

// Division is different with doubles and ints
3.0 / 4 -> .75
3 / 4.0 -> .75
(int) 3.0 / 4 -> 0
(double) 3 / 4 -> .75
(double) (3 / 4) -> 0.0

// Relativity operators are used in boolean expressions

** Precedence **
(1) !, ++, --
(2) *, /, %
(3) +, -
(4) <, >, <=, >=
(5) ==, !=
(6) &&
(7) ||
(8) =, +=, -=, *=, /=, %=


/* Input/Output */

// Getting input:
double x = IO.readDouble();

Escape Sequence | Meaning
=========================
       \n       | newline
       \""      | double quote
       \\       | backslash


/* Control Structures */

// If statement:
if (boolean expression) 
{
    // Code ...
}
else if (boolean expression 2)
{
    // Code ...
}
else
{
    // Code ...
}


// For loop:
for (initialization; termination condition; update statement)
{
    // Code ...
}

// Example:
for (i = 0; i <= 10; i++)
{
    System.out.println(i + " ");
}


// For-each loop:
for (SomeType element : collection)
{
    // Code ...
}

// Example:
for (int element : arr)
{
    System.out.println(element);
}


// While loop:
while (boolean test)
{
    // Code ...
}

// Example:
int i = 1, mult3 = 3;
while (mult3 < 20)
{
    System.out.println(mult3 + " ");
    i++;
    mult3 *= i;
}


// Nested loop:
for (int k = 1; k <= 3; k++)
{
    for (int i = 1; i <= 4; i++)
    {
        System.out.print("*");
    }
    System.out.println();
}


/* Errors and Exceptions */
// You can write code to throw exceptions

// Example:
if (numScores == 0)
{
    throw new ArithmeticException("Cannot divide by zero");
}
else
{
    findAverageScore();
}
