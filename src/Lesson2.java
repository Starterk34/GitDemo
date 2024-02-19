import java.io.BufferedInputStream;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        String Capital = "Kyiv"; //оголошувати змінну було не обов'язково, можна було Address.equalsIgnoreCase("Kyiv")
        String newAddress;
        System.out.println("Enter your name");
        String Name = stdin.next();
        System.out.println("Enter your age");
        int Age = stdin.nextInt();
        System.out.println("Enter your address");
        String Address = stdin.next();

        if (Address.equalsIgnoreCase(Capital)) {
            newAddress = Capital;
        } else {
            newAddress = "lives in oblast.";
        }
        if ((Age <= 18) && (Age > 0)) {
            System.out.println(Name + " underage. Lives in " + newAddress);
        } else if ((Age > 18) && (Age <= 64)) {
            System.out.println(Name + " of working age. Lives in " + newAddress);
        } else if ((Age > 64) && (Age < 150)) {
            System.out.println(Name + " of retirement age. Lives in " + newAddress);
        } else if (Age > 150) {
            System.out.println(Name + " is dead!! Lived in " + newAddress);
        } else {
            System.out.println("Age entered is incorrect");
        }


    }

}

