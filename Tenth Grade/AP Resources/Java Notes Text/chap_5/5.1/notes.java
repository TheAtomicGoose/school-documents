/* #### Objects, Instance Methods, and Instance Variables #### */

/*
 * Object Oriented Programming tries to make programming more like how people actually think.
 *
 * OOP is mostly just a change in point of view. In fact, object oriented techniques can be used in any
 * language. However, OOP is much easier in languages that actively support it.
 */

/* Objects, Classes, and Instances */

/*
 * Objects are closely related to classes.
 *
 * Classes describe objects. The more mainstream way to say this is that objects belong to classes. A class
 * is a blueprint for constructing objects.
 *
 * For an example, here is a class that could store information about the person using the program:
 */

class UserData {
    static String name;
    static int age;
}

/*
 * Since name and age are static, there can only ever be a single user, since name and age can only be changed
 * from inside of the class itself. Space for the name and age variables is allocated in memory as soon as the
 * class is loaded. The name and age variables would be accessed with UserData.name and UserData.age. The two
 * variables exist as long as the program runs, which is what it means for something to be static. Now, a
 * class with some non-static variables:
 */

 class PlayerData {
     static int playerCount;
     String name;
     int age;
 }

/*
 * The playerCount variable is stored as part of the representation of the class in memory. Its full name is
 * PlayerData.playerCount, and there is only one of it, which lasts as long as the program runs. However, each
 * instance of PlayerData will have its own versions of name and age.
 *
 * An object belongs to a class. Variables and methods that the object contains are called instance variables
 * and methods.
 *
 * Static member variables and methods are called class variables and methods, since they belong to the class
 * itself, not to instances of the class.
 */


/* 5.1.2 Fundamentals of Objects */

/* Consider the following example: */

public class Student {
    public String name;  // Student's name
    public double test1, test2, test3;  // Grades on 3 tests

    public double getAverage() {  // Compute average test grade
        return (test1 + test2 + test3) / 3;
    }
}

/*
 * Since no part of this class is static, the class only exists to create objects. It will have variables
 * name, test1, test2, and test3. It will have a method called getAverage().
 *
 * Declaring a variable does not create an object.
 * ####    In Java, no variable can ever hold an object.   ####
 * #### A variable can only hold a reference to an object. ####
 * There is a special portion of memory called the heap which holds objects. The information that a variable
 * which references an object holds is called a pointer.
 *
 * If there is an object called std with instance variables test1, test2,
 * and test3, the variables can be referred to as std.test1, std.test2, and
 * std.test3.
 *
 * It is possible for a variable whose type is given by a class to refer to
 * no object at all. A null variable holds a null pointer.
 *
 * Null is an actual value stored in the variable, so the following
 * statement is valid:
 */
 if (var == null) {} ...
 /* These statements all work with objects: */

Student std, std1, std2, std3;  // Declare four variables of type Student
std = new Student();  // Create a new instance of class Student in var std
std1 = new Student();  // Create a second instance of Student in var std
std2 = std1;  // Copy the reference value in std1 into the variable std2
std3 = null;  // Store a null reference in var std3

/*
 * This is a very important thing to understand:
 *
 * #### When one object variable is assignged to another, only       ####
 * #### a reference is copied. The object referred to is not copied. ####
 *
 * The == operator tests if two things hold exactly the same thing, so ==
 * does not work to test if two objects are the same, because unless one
 * is explicitly set equal to the other, they hold pointers to different
 * locations in memory.
 *
 * If a variable is declared to be final, it can't be changed once it is
 * defined. However, if the variable points to an object, the data inside
 * the object can still be changed.
 */


/* 5.1.3 Getters and Setters */

/*
 * It is important to pay attention to access control when writing new
 * classes.
 *
 * Many people think that all member variables should be private. That
 * gives the programmer complete control over the variable. A public
 * accessor method can be written to return the value of the variable.
 * For example, with a private member variable named title with type
 * String, the following is an accessor method:
 */

public String getTitle() {
    return title;
}

/*
 * Because they are usually named with "get" + variable name, they are
 * often called getter methods.
 *
 * To make it possible for other classes to change a variable, a setter
 * method is written. A setter method is named with "set" + variable name,
 * and has a parameter of the same type as the variable being set:
 */

public void setTitle(String newTitle) {
    title = newTitle;
}


/* 5.1.4 Arrays and Objects */

/*
 * Arrays are objects. Therefore, an array variable can never hold an
 * actual array, only a pointer to an array in the heap.
 *
 * Arrays can also be null, since they are objects.
 */