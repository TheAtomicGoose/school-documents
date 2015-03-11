/**
 * This class creates objects which hold a GPA, a name, a grade level, and an ID
 * number.
 */

public class Student {

    public String first;
    public String last;
    public int grade;
    public double average;

    public static int num;
    public int studentID;

    public Student() {
        this("None", "None", 0, 0.0);
    }

    public Student(String firstName, String lastName, int gradeLevel, double gpa) {
        num++;
        studentID = num;
        first = firstName;
        last = lastName;
        if (gradeLevel >= 0 && gradeLevel <= 12) {
            grade = gradeLevel;
        } else {
            grade = 0;
        }
        if (average >= 0.0 && average <= 4.5) {
            average = gpa;
        } else {
            average = 0.0;
        }
    }

    public String toString() {
        return last + ", " + first + "\nGPA: " + average + "\nGrade Level: " + grade + " " + "id # " + studentID;
    }
}
