import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter the amount of deposit:");
        double deposit = stdin.nextDouble();
        if (deposit < 0) {
            System.out.println("Amount of deposit must be greater than zero.");
        } else {
            for (int i = 0; i < 12; i++) {
                deposit = deposit * 1.12;
            }
            deposit = deposit * 0.97;
            System.out.println("The amount you will receive 12 months after paying taxes is " + String.format("%.2f", deposit) + "$.");
        }
    }
}
