import java.io.BufferedInputStream;
import java.util.Random;
import java.util.Scanner;

public class HW_Arrays_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        int multiplication = 1;
        System.out.println("Enter the length of array");
        int a = stdin.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = random.nextInt(100);
            System.out.println(i+1 + " element of array is " + array[i]);
            if (array[i] != 0) {
                multiplication = multiplication * array[i];
            }
        }
        System.out.println("Multiplication result is " + multiplication);
    }
}
