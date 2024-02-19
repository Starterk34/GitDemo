package w33;

import java.io.BufferedInputStream;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int area;
        Rectangle rectangle = new Rectangle();
        Scanner stdin  = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter rectangle width:");
        rectangle.setWidth(stdin.nextInt());
        System.out.println("Enter rectangle height:");
        rectangle.setHeight(stdin.nextInt());
        area = rectangle.getWidth()*rectangle.getHeight();
        System.out.println("Rectangle width is " + rectangle.getWidth());
        System.out.println("Rectangle height is " + rectangle.getHeight());
        System.out.println("Rectangle area is " + area);



    }
}
