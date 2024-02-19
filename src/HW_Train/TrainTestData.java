package HW_Train;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TrainTestData {

    public static void main(String[] Args) {
        boolean tookPlace = false;
        // Заповнити зайняті місця у вагонах

        ArrayList<ArrayList<Character>> train = readTestDataFromFile("src/HW_Train/testData_2.txt");
        System.out.println("Train seats before passenger starts search:\n" + train);

        for (int i = 0; i < train.size(); i++) {
            for (int j = 0; j < train.get(i).size(); j++) {
                if (train.get(i).get(j).equals('0')) {
                    train.get(i).set(j, '1');
                    System.out.println("Passenger took " + (j + 1) + " place in the " + (i + 1) + " coach");
                    tookPlace = true;
                    break;
                }
            }
            if (tookPlace) {
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
