/**
 * This class extends the Person class. It gives each student a unique
 * studentID, and also holds their grade level. It contains a getLevel()
 * method and a toString() method.
 *
 * Written as part of an assignment for AmplifyMOOC on 03-16-2015 by Jesse
 * Evers.
 */

public class Student extends Person {

    private static int num = 1;
    private int studentId;
    private int level;

    public Student(String fName, String lName, int gLevel) {
        super(fName, lName);
        if (gLevel >= 0 && gLevel <= 12) {
            level = gLevel;
        } else {
            level = 0;
        }

        studentId = num++;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return super.toString() + "\n   Grade Level: " + level + "\n   ID #: " + studentId;
    }
}
