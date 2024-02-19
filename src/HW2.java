import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter color of the fruit");
        String color = stdin.next();
        System.out.println("Enter form of the fruit");
        String form = stdin.next();
        String result = "";
        if ((form.equalsIgnoreCase("round")) && ((color.equalsIgnoreCase("green")) || (color.equalsIgnoreCase("yellow")) || (color.equalsIgnoreCase("red")))) {
            result = "This is an apple!";
        } else if ((form.equalsIgnoreCase("round") == false) && (color.equalsIgnoreCase("yellow"))) {
            System.out.println("Please specify the form of the fruit: it is elongated or drop-shaped?");
            String specifiedForm = stdin.next();
            if (specifiedForm.equalsIgnoreCase("elongated")) {
                result = "This is babana!";
            } else if (specifiedForm.equalsIgnoreCase("drop-shaped")) {
                result = "This is pear!";
            } else {
                result = "I don't know such fruit.";
            }

        } else {
            result = "I don't know such fruit.";
        }
        System.out.println(result);
    }
}