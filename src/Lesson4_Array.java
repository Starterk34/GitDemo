import java.io.BufferedInputStream;
import java.util.Random;
import java.util.Scanner;

public class Lesson4_Array {
    public static void main(String[] args) {
        /*int[] numbers = new int[10];
        for (int i = (numbers.length - 1); i >= 0; i--) {
            numbers[i] = i;
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }*/
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        Random random = new Random();
        System.out.println("Enter length of array");
        int a = stdin.nextInt();
        int [] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}