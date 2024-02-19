import java.util.ArrayList;
import java.util.List;

public class HW_ArrayList {
    public static void main (String[] args){
        ArrayList<String> Surname = new ArrayList<>(List.of("Nescheret", "Vivcharenko", "Syrota", "Diachuk", "Tymchyk", "Sydorchuk", "Andriievskyi", "Voloshyn", "Buialskyi", "Vanat"));
        System.out.println(Surname);
        ArrayList<String> Name = new ArrayList<>(List.of("Ruslan", "Kostiantyn", "Oleksandr", "Maksym", "Oleksandr", "Serhii", "Oleksandr", "Nazar", "Vitalii", "Vladyslav"));
        System.out.println(Name);
        String element;
        ArrayList<String> FullName = new ArrayList<>();
       for (int i = 0; i<Name.size(); i++){

           FullName.add(i,(Name.get(i)+ " " + Surname.get(i))) ;
        }
       Name.clear();
       Surname.clear();
        System.out.println(FullName);
        System.out.println(Name);
        System.out.println(Surname);



    }
}
