package CaseManagement;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Report report1 = new Report("15","Imaging report", "TF-0001", "Hitachi");
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter device name");
        String deviceInput = stdin.next();
        if (report1.isDeviceFromConsole(deviceInput)==true){
            System.out.println("Report relates to this device");
        }
        else {
            System.out.println("Report relate doesn't relate to this device");

        }
        System.out.println(report1.toString());
        report1.setCaseIDAsDeviceAndTitle();
        System.out.println(report1.toString());
    }

}
