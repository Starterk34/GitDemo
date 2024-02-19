import java.io.BufferedInputStream;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter number from 1 to 7");
        int Day = stdin.nextInt();
        switch (Day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesdaydayday");
                break;
            case 3:
                System.out.println("Wednesdaydayday ");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Day off. Saturday");
                break;
            case 7:
                System.out.println("Day off. Sunday");
                break;
            default:
                System.out.println("Not a number of day");
                break;

        }
    }
}


