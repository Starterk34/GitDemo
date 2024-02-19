import java.io.BufferedInputStream;
import java.util.Random;
import java.util.Scanner;

public class HW_Arrays_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        int max = 0;
        int min = 51;
        int a = 0;
        int b = 0;
        int sum = 0;
        System.out.println("Enter the length of array");
        int k = stdin.nextInt();
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = random.nextInt(51);
            System.out.println(i + 1 + " element of array is " + array[i]);
            if (array[i] >= max) {
                max = array[i];
                a = i;
            }
            if (array[i] <= min) {
                min = array[i];
                b = i;
            }
        }
        if ((a - b) > 1) {
            for (int i = b + 1; i < a; i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of the elements between max and min elements is " + sum);
        } else if ((b - a) > 1) {
            for (int i = a + 1; i < b; i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of the elements between max and min elements is " + sum);
        } else {
            System.out.println("There is no elemets between min and max values");
        }


    }
}