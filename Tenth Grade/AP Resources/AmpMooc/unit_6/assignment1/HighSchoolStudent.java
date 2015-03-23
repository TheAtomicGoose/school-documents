/**
 * This class extends the Student class. It adds a GPA to the mix.
 *
 * Written as part of an assignment for AmplifyMOOC on 03-16-2015 by Jesse
 * Evers.
 */

public class HighSchoolStudent extends Student {

    private double gpa;

    public HighSchoolStudent(String fName, String lName, int gLevel, double g) {
        super(fName, lName, gLevel);
        if (g >= 0 && g <= 5) {
            gpa = g;
        } else {
            gpa = 0;
        }
    }

    public String toString() {
        return super.toString() + "\n   GPA: " + gpa;
    }
}
