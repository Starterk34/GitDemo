import java.io.BufferedInputStream;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Lesson3_2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter number from 5 to 155");
        int number = stdin.nextInt();
        sleep (10000);
        if (number < 5 || number > 155) {
            System.out.println("You entered wrong number. Please number from 5 to 155");
        } else if ((number <= 25) || (number <= 155)) {
            System.out.println("Your number is NOT in specified interval");
        } else {
            System.out.println("Your number is in specified interval");
        }

    }
}
