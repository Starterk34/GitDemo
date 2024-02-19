package OOP;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        String needCheckup;
       Patient me = new Patient("Stas", "Terk", "103", "2");
       if (me.visitDoctor("випадає шерсть")==true){
           System.out.println("У " + me.getName() + " " + me.getSurname() + " " + me.getCard());
       }
       else  {
           System.out.println(me.getName() + " " + me.getSurname() + " ще не ходив до поліклініки" );
        }
       Patient student1 = new Patient("Andrii", "Shevchenko", "103" , "1", new ArrayList<>(List.of("косопапий", "дві ноги")));
       if (student1.visitDoctor("дві руки") == true){
           System.out.println("У " + student1.getName() + " " + student1.getSurname() + " " + student1.getCard());
       }
       else  {
           System.out.println(student1.getName() + " " + student1.getSurname() + " ще не ходив до поліклініки" );
       }
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Does " + student1.getName() + " " + student1.getSurname() + " needs checkup? YES/NO");
        needCheckup = stdin.next();

       if (student1.checkup(needCheckup) ==true){
           System.out.println(student1.getName() + " " + student1.getSurname() + "має прийти завтра до полікліники з 2 баночками з аналізами");
       }
       else {
           System.out.println(student1.getName() + " " + student1.getSurname() + " вже був на медогляді");
           student1.addCard("був на медогляді");
       }
        System.out.println("Track changes 1");

       }

    }

