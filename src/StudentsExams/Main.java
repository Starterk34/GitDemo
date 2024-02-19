package StudentsExams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    private static void getFirstSixStudent(ArrayList<Student> CurrentStudent, String x) {
        Collections.sort(CurrentStudent, Comparator.comparing(Student::getGrades));
        Collections.reverse(CurrentStudent);
        System.out.println(x);
        for (int i = 0; i < 6; i++) {
            System.out.println(CurrentStudent.get(i).getName() + " with " + CurrentStudent.get(i).getGrades() + " result");
        }
    }

    public static void main(String[] Args) {
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
        System.out.println("Initial list of Student already studying in University:");
        System.out.println(CurrentStudent);

        getFirstSixStudent(CurrentStudent, "Student who passed the first round of exam:");
        ArrayList<Student> ForeignStudent = new ArrayList<>();
        ForeignStudent.add(new Student("Anna", 74));
        ForeignStudent.add(new Student("Nastia", 99));
        ForeignStudent.add(new Student("Kate", 66));
        ForeignStudent.add(new Student("Lina", 71));
        ForeignStudent.add(new Student("Masha", 63));
        ForeignStudent.add(new Student("Dasha", 69));
        ForeignStudent.add(new Student("Ira", 88));
        ForeignStudent.add(new Student("Julia", 69));
        ForeignStudent.add(new Student("Tania", 84));
        ForeignStudent.add(new Student("Liza", 93));
        CurrentStudent.addAll(ForeignStudent);
        getFirstSixStudent(CurrentStudent, "Student who passed the second round of exam:");
        System.out.println("Track changes 22");
    }

}
