import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        int a;
        int b;
        int result;
        do {
            System.out.println("Enter the first number. It must be greater than 100 and less than 1000.");
            a = stdin.nextInt();
        }
        while ((a <= 100) || (a >= 1000));
        do {
            System.out.println("Enter the second number. It must be greater than 100 and less than 1000.");
            b = stdin.nextInt();
        }
        while ((b <= 100) || (b >= 1000));
        if (a > b) {
            result = a - b;
        } else if (a < b) {
            result = a + b;
        } else {
            result = a * b;
        }
        System.out.println("Calculation result is " + result);
    }
}
