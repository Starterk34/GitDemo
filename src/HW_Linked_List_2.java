import StudentsExams.Student;

import java.util.*;

public class HW_Linked_List_2 {
    public static void main(String[] args) {
        ArrayList<Student> CurrentStudent = new ArrayList<>();
        CurrentStudent.add(new Student("Anton", 75));
        CurrentStudent.add(new Student("Bohdan", 80));
        CurrentStudent.add(new Student("Dima", 60));
        CurrentStudent.add(new Student("Vova", 100));
        CurrentStudent.add(new Student("Alex", 95));
        CurrentStudent.add(new Student("Ivan", 85));
        CurrentStudent.add(new Student("Roman", 90));
        CurrentStudent.add(new Student("Petro", 95));
        CurrentStudent.add(new Student("Stas", 65));
        CurrentStudent.add(new Student("Max", 66));
        Collections.sort(CurrentStudent, Comparator.comparing(Student::getGrades));
        System.out.println ("Student who passed exam:");
        for (Student stud : CurrentStudent){
            System.out.println("Name: " + stud.getName() + "with " + stud.getGrades() + " result");
        }
    }
}
