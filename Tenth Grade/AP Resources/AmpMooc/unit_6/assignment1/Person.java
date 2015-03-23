/**
 * This class holds a person's first name, last name, and a toString()
 * method.
 *
 * Written as part of an assignment for AmplifyMOOC on 03-16-2015 by Jesse
 * Evers.
 */

public class Person {

    private String firstName;
    private String lastName;

    public Person(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String toString() {
        return lastName + ", " + firstName;
    }
}
