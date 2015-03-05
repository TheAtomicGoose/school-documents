/* #### APIs, Packages, and Javadoc #### */
/* _____________________________________ */


/* 4.5.1 Toolboxes */
/* \\\\\\\\\\\\\\\ */

/*
 * Taking the tools available and applying them to a specific task, problem, or project, is called 
 * applications programming. A software toolbox is a type of black box which presents a certain interface
 * to the programmer of what routines are in the toolbox, their parameters, and what they do. This
 * information is called an API, or Application Programming Interface.
 *
 * Java is supplemented by a large, standard API. Any routines/methods that are available without importing
 * or writing them yourself are part of the standard API.
 */


/* 4.5.2 Java's Standard Packages */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * Classes in Java can be grouped into packages. Packages can also contain other packages.
 *
 * Since one of the sub-packages of the "java" package is called "awt", its full name is actually "java.awt".
 * Classes in java.awt can be called by java.awt.ClassName. For instance, java.awt.Color.
 */


/* 4.5.3 Using Classes from Packages */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * If you want to define a variable called rectColor of type java.awt.Color, you could do:
 */

java.awt.Color rectColor;

/*
 * However, writing the full name of every class is complicated and time-consuming, so instead, you can
 * import the class by putting:
 */

import java.awt.Color;

/*
 * At the beginning of your file. Then, in the rest of the file, you can refer to the java.awt.Color class by
 * just the simple class name, which is Color, like so:
 */

Color rectColor;

/*
 * If you want to import all the classes in a file, you can put an asterisk after the package name, like so:
 */

import java.awt.*;

/*
 * The asterisk is called a wildcard. It matches every class in the package.
 *
 * If you want a class that you are writing to be included in a specific package name (say utilities), you
 * must begin the class file with:
 */

package utilities;

/*
 * The file with the above line in it must also be placed in a folder called utilities
 *
 * Although not every class has a specified package, all classes are part of a package. If the package name
 * is not specified, the class is included in the default (and nameless) package.
 */


/* 4.5.4 Javadoc */
/* \\\\\\\\\\\\\ */

/*
 * To effectively use an API, the API must have good documentation. Most Java API documentation is prepared
 * with a system called Javadoc.
 *
 * Javadoc is prepared with special comments, which are similar to the standard comments, such as this one,
 * which take the following format:
 */

/* ... */

/* Javadoc comments look like this: */

/** ... */

/*
 * A Javadoc comment always comes just before the subroutine/method that is being commented on.
 *
 * By default, Javadoc only collects information about public class, subroutines, and member variables, but
 * can be configured to collect information about non-public things as well. If Javadoc cannot find any
 * Javadoc comments about something, it constructs a basic one with only syntactic information about the
 * thing.
 *
 * Javadoc pages are created in HTML, and so Javadoc comments can contain HTML tags and other special HTML
 * constructions.
 *
 * Javadoc can also include doc tags, which are processed as commands by the javadoc tool. Doc tags begin
 * with the character @. These doc tags must be at the end of the comment. Their syntax is:
 */

@param parameter-name description-of-parameter
@return description-of-return-value
@throws exception-class-name description-of-exception

/*
 * Descriptions can extend over several lines.
 *
 * The following example doesn't do anything, but uses all types of doc tag:
 */


/**
 * This subroutine computes the area of a rectangle, given its width and its height. The length and the
 * width should be positive numbers.
 * @param width the length of one side of the rectangle
 * @param length the length of the second side of the rectangle
 * @return the area of the rectangle
 * @throws IllegalArgumentException if either the width or the height is a negative number.
 */
public static double areaOfRectangle(double length, double width) {
	if (width < 0 || height < 0) {
		throw new IllegalArgumentException("Sides must have positive length.");
	}
	double area;
	area = width * height;
	return area;
}


/* 4.5.5 Static Import */
/* \\\\\\\\\\\\\\\\\\\ */

/*
 * It is possible to import static members of a class with a static import. Its syntax:
 */

import static package-name.class-name.static-member-name;