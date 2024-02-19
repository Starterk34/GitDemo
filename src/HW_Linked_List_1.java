import java.util.LinkedList;
import java.util.Random;

public class HW_Linked_List_1 {
    public static void main (String[] args){
        Random random = new Random();
        LinkedList <Integer> RandomList = new LinkedList<>();
        LinkedList<Integer> WithoutDuplicates = new LinkedList<>();
        for (int i=0; i<10; i++){
            RandomList.add(random.nextInt(5));
        }
System.out.println(RandomList);
        for (int number: RandomList){
            if (!WithoutDuplicates.contains(number)){
                WithoutDuplicates.add(number);
            }

        }
        System.out.println("Initial LinkedList contained " + RandomList.size() + " elements.");
        System.out.println("LinkedList without duplicates containes " + WithoutDuplicates.size() + " elements.");
        System.out.println(WithoutDuplicates);
    }
}
