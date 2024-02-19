import java.io.BufferedInputStream;
import java.util.Scanner;

public class Lesson_Cycle_1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(new BufferedInputStream(System.in));


        System.out.println("Enter number");
        int num = r.nextInt();
        int res = 1;
        for (int i = num; i > 0; i--) {
            res = res * i;
        }
        System.out.println(res);
    }
}
