package StudentsExams;

public class Student {
    private String name;
    private int grades;

    public Student(String StudName, int StudGrades) {
        this.name = StudName;
        this.grades = StudGrades;
    }

    public Integer getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student name is " + name + ", grades=" + grades;
    }

}
