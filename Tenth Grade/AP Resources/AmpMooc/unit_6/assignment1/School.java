import java.util.ArrayList;

/**
 * This class keeps track of all the teachers and students at a school. It
 * has a getGradeLevel method which returns all students in the specified
 * grade.
 *
 * Written as part of an assignment for AmplifyMOOC on 03-16-2015 by Jesse
 * Evers.
 */

public class School {

    private ArrayList <Student>students;
    private ArrayList <Teacher>teachers;

    public School(ArrayList <Student>s, ArrayList <Teacher>t) {
        students = s;
        teachers = t;
    }

    public String getGradeLevel(int level) {
        String grade = "";
        for (Student student: students) {
            //student = (HighSchoolStudent)student;
            if (student.getLevel() == level) {
                grade += student.toString() + "\n";
            }
        }
        return grade;
    }

    public String toString() {
        String school = "Faculty:\n";
        for (Teacher teacher: teachers) {
            school += teacher.toString() + "\n";
        }
        school += "\n\nStudent Body:";
        for (Student student: students) {
            //student = (HighSchoolStudent)student;
            school += student.toString() + "\n";
        }

        return school;
    }
}
