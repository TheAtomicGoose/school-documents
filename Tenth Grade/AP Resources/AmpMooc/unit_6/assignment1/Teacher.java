/**
 * This class extends the Person class. It holds what subject a teacher
 * teaches.
 *
 * Written as part of an assignment for AmplifyMOOC on 03-16-2015 by Jesse
 * Evers.
 */

public class Teacher extends Person {

    private String subject;

    public Teacher(String fName, String lName, String s) {
        super(fName, lName);
        subject = s;
    }

    public String toString() {
        return super.toString() + "\n   Subject: " + subject;
    }
}
