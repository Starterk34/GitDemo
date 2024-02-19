package w34;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.lang.Math;



public class Main {
    public static void main(String[] args) {
        double circumference;
        double area;
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        Circle circle = new Circle();
        System.out.println("Enter radius of the circle");
        circle.setRadius(stdin.nextInt());
        circumference = 2*Math.PI*circle.getRadius();
        area = Math.pow(circle.getRadius(),2)*Math.PI;
        System.out.println("Circle radius is " + circle.getRadius());
        System.out.println("Circle circumference is " + String.format("%.2f",circumference ));
        System.out.println("Circle area is " + String.format("%.2f",area));

    }
}