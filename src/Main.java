import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        long LBA = 0;
        LBA = stdin.nextLong();

        System.out.println("User entered LBA value " + LBA);
        if (LBA>200000000){
            System.out.println ("Passed");
        }
        else {
            System.out.println ("Failed");
        }


       //System.out.println(stdin.next());


        System.out.println();


    }
}