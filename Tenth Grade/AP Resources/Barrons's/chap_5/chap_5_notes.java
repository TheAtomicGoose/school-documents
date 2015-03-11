/* #### Program Design and Analysis #### */


/* The Software Development Life Cycle */

// The Waterfall Mode
The waterfall model of software development brings structure and efficiency into the process of creating programs. Each step in the process flows into the next:
Analysis of the Specification ---
								|
								Program Design ---
												 |
												 Implementation ---
												 				  |
												 				  Testing & Debugging ---
												 				  						|
												 				  						Maintenance

// Program Specification
The spec is a written description of the program based on a customer''s requirements. The first step in a project is to understand the spec.

// Program Design
Good design saves programming time and enhance the reliability of the final program. The design is usually a fairly detailed plan.

// Program Implementation
Program implementation is actually writing the code.

// Testing and Debugging
A set of test data should be selected since every possible input cannot be tested. Typical values, as well as endpoints and out of range value should be tested.

// Types of Errors
A compile-time error occurs during compilation of the program.
A run-time error occurs during execution of the program.
The intent or logic error is one that runs properly but fails to carry out the spec.

// Robustness
Always assume that your program is dumber than you. You have to try to write a program that
 - Won''t give inaccurate answers for some input data
 - Won''t crash if the input data are invalid
 - Won''t allow execution to proceed if invalid data are entered

// Program Maintenance
Maintenance is upgrading the code as the circumstances change, e.g., gnu features are added, gnu programmers are working on the program.

/* Object-Oriented Program Design */
Object-oriented programming blurs the lines of the waterfall model. The steps in object-oriented design are:
 - Identify classes to be written
 - Identify behaviors (i.e., methods) for each class
 - Determine the relationships between classes
 - Write the interface (public method headers) for each class
 - Implement the methods

// Identifying Classes
Identify the classes in a program by picking out the nouns in the spec. Ignore nouns and pronouns that refer to the user. Select "big
picture" nouns that describe the major objects in the application.
It is common for a program to have a low level basic component, a collection of low level components, a controller, and a display object.
Example:
	Basic Object: StockItem
	Collection:   Inventory (a list of StockItems)
	Controller:   Store (has an Inventory, uses a StoreDisplay)
	Display:	  StoreDisplay (could be a GUI)

// Identifying behaviors
Verbs in the spec will likely become the methods of the classes. Then decide which methods belong in which classes. Bundling a group of methods and data fields
into a class is{} called *encapsulation*.
Do not ask basic classes to perform operations for the group. You wouldn''t ask StockItem to search for another item.
Lastly, you need to decide which data fields each class will{} need.

// Determining Relationships Between Classes
	// Inheritance Relationships
	Look for is-a relationships: if object1 is-a object2, then object2 could potentially be a superclass of{} object1.
	// Composition Relationships
	Composition relationships are defined by the has-a relationship. If two classes have a has-a relationship, one of the classes has an instance variable with the
	type of the other class.

// UML Diagrams
UML diagrams are a great way to keep track of the relationships between classes. Here is a simplified version of the UML rules:
 - Represent classes with rectangles.
 - Use angle brackets with the word "abstract" or "interface" to indicate either an abstract class or{} an interface.
 - Show the is-a relationship between classes with an open up-arrow.
 - Show the is-a relationship that involves an interface with{} an open, dotted, up-arrow.
 - Show the has-a relationship with a down arrow or sideways arrow (indicates composition).

// Implementing Classes
	// Bottom-Up Development
	Classes that are needed to implement a method in another classes are called collaborator classes. A class with{} no collaborators is called independent.
	To implement the classes, a bottom-up approach is often used. So, independent classes are fuly implemented before being incorporated into the overall project.

	// Top-Down Development
	Top-down design involves starting with an overview of the program, and developing the highest-level controlling object and simplifying from that point.
