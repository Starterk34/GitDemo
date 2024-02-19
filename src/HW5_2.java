import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW5_2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
            System.out.println("Enter the amount of deposit:");
            double deposit = stdin.nextDouble();
            System.out.println("Enter the interest rate, %:");
            double interestRate = stdin.nextDouble();
            System.out.println("Enter term of deposit in months:");
            int depositTerm = stdin.nextInt();
            System.out.println("Enter the tax rate, %:");
            double taxRate = stdin.nextDouble();
            if ( (deposit <= 0) ||(interestRate <= 0) || (depositTerm <= 0) || (taxRate < 0)){
                System.out.println("Entered data is incorrect. Deposit amount, term, interest and tax rate must be greater than zero.");
            }
            for(int i = 0; i<depositTerm; i++){
                deposit = deposit * (1 + interestRate / 100);
            }
            deposit =deposit *(1-taxRate/100);
            System.out.println("The amount you will receive "+depositTerm +" months after paying taxes is "+String.format("%.2f",deposit)+"$.");
        }
    }
