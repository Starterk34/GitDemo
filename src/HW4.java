import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW4 {
    public static void main (String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter the first number");
        int a = stdin.nextInt();
        System.out.println("Enter the second number");
        int b = stdin.nextInt();
        System.out.println("Enter the third number");
        int c = stdin.nextInt();
        int max = 0;
        int min = 0;
        int sum = 0;
        int multiply = 1;
        if (a>=b && a>=c) {
            max = a;
        }
        else if (b>=a && b>=c) {
            max = b;
        } else  {
            max = c;
        }
if (a<=b && a<=c){
    min = a;
}
else if (b<=a && b<=c){
            min = b;
        } else  {
            min  = c;
        }
sum = a+b+c;
multiply = a*b*c;
System.out.println("Max value = " + max + ", min value = " + min + ", sum of numbers  = " + sum + " ,multiplication of numbers =  " + multiply);
    }
}
