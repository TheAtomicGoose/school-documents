/* Inheritance */
/* \\\\\\\\\\\ */

/* Superclass and Subclass */
Inheritance is the mechanism by which a (new) class, called a subclass, is created from an existing class,
called a superclass. We say that the subclass inherits characteristics of its superclass.

/* Inheritance Hierarchy */
A subclass can intself be a superclass for another subclass, leading to an inheritance hierarchy of classes.
A method from a superclass can be overwritten with a new definition in a subclass, which is called method
overriding.

/* Implementing Subclasses */
The inheritance relationship b etween a subclass and a superclass is specified in the declaration of the sub-
class, using the keyword extends. It is done with the following format:

public class Superclass {
	// Code
}

public class Subclass extends Superclass {
	// More code
}

Constructors are never inherited. A subclass constructor can be inherited with a call to the super method,
which invokes the superclass constructor. This is done like so:

super();

If super is used in the implementation of a subclass constructor, it must be used in the first line of the
constructor body. If no constructor is provided in a subclass, the compiler uses the default constructor
of the superclass as the constructor of the subclass.

/* Declaring Subclass Objects */
When a variable of a superclass is declared in a client program, that reference can refer not only to an
object of the superclass, but also to objects of any of its subclasses. So, all of the following are legal:
Student s = new Student();
Student g = new GradStudent();
Student u = new UnderGrad();


/* Polymorphism */
/* \\\\\\\\\\\\ */

A method that has been overridden in at least one subclass is said to be polymorphic.
Polymorphism is the mechanism of selecting the appropriate method for a particular object in a class
hierarchy.

/* Dynamic Binding (Late Binding) */
Making a run-time decision about which instance method to call is known as dynamic binding or late binding.


/* Type Compatibility */
/* \\\\\\\\\\\\\\\\\\ */

/* Downcasting */
Casting a superclass to a subclass type is called a downcast.

/* The ClassCastException */
The ClassCastException is a run-time exception thrown to signal an attempt to cast an object to a class of
which it is not an instance.


/* Abstract Classes */
/* \\\\\\\\\\\\\\\\ */

An abstract class is a a superclass that repreesents an abstract concept, and therefore should not be
instantiated. For example, a maze program could have several different components -- paths, walls, entrances,
and exits. All of these share certain features (e.g., location, and a way of displaying). They can therefore
all be declared as subclasses of the abstract class MazeComponent. The program will create path objects, wall
objects, and so on, but no instances of MazeComponent.
Abstract methods are methods with a header but no statements. They are usually in abstract classes, and are
used as a placeholder.

/* The abstract Keyword */
An abstract class is declared with the keyword abstract in the header:
public abstract class AbstractClass { . . . }
If a subclass of an abstract class does not provide implementation code for all the abstract methods of its
superclass, it has to be declared as an abstract class as well.


/* Interfaces */
/* \\\\\\\\\\ */

/* Interface */
An interface is a collection of related methods whose headers are provided without implementations. All of
methods are both public and abstract -- no need to explicitly include these keywords. As such, they provide
a framework of behavior for any class.
A class that _implements_ an interface can define any number of methods. In particular, it contracts to 
provideimplementations for all the methods in the interface. If it doesn't implement any of the methods, the
class must be declared abstract.

/* Defining an Interface */
An interface is defined with the interface keyword. For example:
public interface FlyingObject { . . . }

/* The implements Keyword */
Interfaces are implemented using the implements keyword. For example:
public class Bird implements FlyingObject { . . . }

/* The Comparable Interface */
java.lang contains the Comparable interface, which is used for comparing objects. Any class that implements
Comparable must provide a compareTo method.