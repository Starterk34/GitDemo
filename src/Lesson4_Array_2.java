import java.util.Random;

public class Lesson4_Array_2 {
    public static void main(String[] args){
        int[] grades = new int[15];
        int gradesSum = 0;
        int avarage;
        Random random = new Random();
        for (int i = 0; i< grades.length; i++){
            grades[i] = random.nextInt(101);
            System.out.println("Grade for the "+ (i+1) + " subject is " + grades[i]);
            gradesSum = gradesSum + grades[i];
        }
        avarage = gradesSum/grades.length;
        System.out.println("Avarage grades are " + avarage);
    }
}
