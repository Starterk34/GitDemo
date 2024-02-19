import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter circle radius:");
        double radius = stdin.nextDouble();
        double area;
        if (radius > 0) {
            area = radius * radius * Math.PI;
            System.out.println("Circle area is " + area);
        } else {
            System.out.println("Radius must be greater than zero");
        }
    }

}
