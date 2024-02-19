import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_Collections_1 {
    public static void main (String[] args){
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        ArrayList<Integer> Lesson = new ArrayList<>();
        int multiplication = 1;
        int a =1;
        System.out.println("Enter integer value");
        while (a !=0){
            a = stdin.nextInt();
            if (a!=0) {
                Lesson.add(a);
            }
        }
        System.out.println(Lesson);
        for (int i: Lesson){
            multiplication = multiplication*i;
        }
        System.out.println("Result of multiplication of oaa ArrayList elements is " + multiplication);
    }
}
