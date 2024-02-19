import java.io.BufferedInputStream;
import java.util.Scanner;

public class Lesson4_Array_4 {
    public static void main(String[] args) {

        Scanner stdin = new Scanner (new BufferedInputStream(System.in));
        String[] names = new String[5];
        int[] salary = new int[5];
        int salaryFund = 0;
        int maxSalary = 0;
        int a = 0;
        String highestPaidEmployee;
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name of the " + (i + 1) + " employee");
            names[i] = stdin.next();
            do {
                System.out.println("Enter the salary of the " + (i + 1) + " employee. It must be greater then zero");
                salary[i] = stdin.nextInt();
            }
            while (salary[i]<0);
        }
        for (int i = 0; i < names.length; i++) {
            salaryFund = salaryFund + salary[i];
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];
                a = i;
            }
        } System.out.println("Total salary fund is " + salaryFund);
        System.out.println("The highest paid employee is " + names[a]);

    }
}
