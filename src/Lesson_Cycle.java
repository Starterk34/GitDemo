import java.io.BufferedInputStream;
import java.util.Scanner;

public class Lesson_Cycle {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter number");
        int i = stdin.nextInt();
        System.out.println("Odd numbers");
        int a = 0;
        while (i >= a) {
            if (a % 2 == 1) {

                System.out.println(a);
            } else {
                a = a - 1;
                System.out.println(a);
            }
            a = a + 2;
        }
    }
}
