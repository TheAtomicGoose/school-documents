/* #### Introduction to GUI Programming #### */
/* _________________________________________ */


/*
 * A GUI program is a program that opens one or more windows on your
 * screen.
 */


/* 3.9.1 Drawing Shapes */
/* \\\\\\\\\\\\\\\\\\\\ */

/*
 * Drawing in Java is done using a graphics context, which is an object.
 * It can include methods and data. A font can be selected for drawing,
 * which specifies the style and size of characters. 
 *
 * A graphics context is represented by variable of type Graphics. Some
 * methods available to a graphics variable g:
 *
 * g.setColor(c)  Sets the color to be used. Parameter c is of type Color.
 * g.drawline(x1, y1, x2, y2)  Draws a line from (x1, y1) to (x2, y2)
 * g.drawRect(x, y, w, h)  Draws a rectangle with sides w and h pixels 
 * 		long from point (x, y)
 * g.fillRect(x, y, w, h)  Same as last, but fills in the rectangle
 * g.drawOval(x, y, w, h)  Draws an oval that would fit inside
 *		g.drawRect(x, y, w, h)
 * g.fillOval(x, y, w, h)  Same as last, but with the oval filled in
 *
 */


/* 3.9.2 Drawing in a Program */
/* \\\\\\\\\\\\\\\\\\\\\\\\\\ */

/*
 * See DrawFrame.java for a full drawing program.
 */