package HW_Train;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainTestDataBackwards {

    // Застрибує в останній вагон. У вагоні будуть вільні місця,
    // якщо кількість пасажирів менше 24.
    // Задача знайти перший вагон (пасажир йде з кінця) в якому є вільне місце і зайняти його.

    public static void main(String[] Args) {
        boolean tookPlace=false;
        ArrayList<ArrayList<Character>> train = readTestDataFromFile("src/HW_Train/testData_2.txt");
        System.out.println("Train seats before passenger starts search:\n" + train);

        for (int i=(train.size()-1); i>=0; i--){
            for (int j = (train.get(i).size()-1); j>=0;j--){
                if (train.get(i).get(j).equals('0')){
                    train.get(i).set(j,'1');
                    tookPlace=true;
                    System.out.println("Passenger took " + (j + 1) + " place in the " + (i + 1) + " coach");
                    break;
                }
            }
            if (tookPlace==true){
                break;
            }
        }
        if (tookPlace==false){
            System.out.println("Passenger has a problem! There are no places to sit.");
        }
    }

    private static ArrayList<ArrayList<Character>> readTestDataFromFile(String fileName) {
        ArrayList<ArrayList<Character>> train = new ArrayList<>();

        try (FileReader reader = new FileReader(fileName)) {
            int c;
            ArrayList<Character> coach = new ArrayList<>();
            while ((c = reader.read()) != -1) {
                if ((char) c == ';') {
                    train.add(coach);
                    coach = new ArrayList<>();
                } else {
                    coach.add((char) c);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return train;
    }
}