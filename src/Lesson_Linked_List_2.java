import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lesson_Linked_List_2 {
    public static void main (String [] args){
        LinkedList<String> Europe = new LinkedList<>(List.of("France", "Bulgaria", "Romania", "Greece","Italy", "Great Britain", "Hungary", "Spain"));
        LinkedList<String> Asia = new LinkedList<>(List.of("China", "Japan", "Korea", "Vietnam"));
        LinkedList<String> CountriesVisited= new LinkedList<>();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter the countries you've visited in Europe and Asia. When finished enter 'stop'.");
        String visitedCountry = stdin.next();
        int counterEurope = 0;
        int counterAsia=0;
        while (visitedCountry.equalsIgnoreCase("stop") == false){
            CountriesVisited.add(visitedCountry);
            visitedCountry = stdin.next();
        }

        System.out.println("Visited countries are:");
        System.out.println(CountriesVisited);


        /*for (int i=0; i<CountriesVisited.size(); i++) {
            for (int j = 0; j < Europe.size(); j++) {
                if (CountriesVisited.get(i).equalsIgnoreCase(Europe.get(j))) {
                    counterEurope++;
                }
            }
            for (int k = 0; k < Asia.size(); k++) {

                    if (CountriesVisited.get(i).equalsIgnoreCase(Asia.get(k))) {
                        counterAsia++;
                    }
                }
            }*/

        int count1 = 0;
        int count2 = 0;

        for (String country: CountriesVisited)
        {
            if (Europe.contains(country))
                count1++;
            if (Asia.contains(country))
                count2++;
        }
        System.out.println("You have visited " + count1 + " countries in Europe and " + count2 + " countries in Asia");
    }
}
