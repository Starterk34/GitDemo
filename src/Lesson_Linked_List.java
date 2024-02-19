import java.util.LinkedList;
import java.util.Random;

public class Lesson_Linked_List {
    public static void main (String[] args){
        Random random = new Random();
        LinkedList<Integer> Lesson = new LinkedList<>();
        for (int i=0; i<10;i++){
            Lesson.add(random.nextInt());
        }
    System.out.println(Lesson);
        if (Lesson.size()%2==0){
            Lesson.add((Lesson.size()/2), random.nextInt());
        }
        else {
            Lesson.add((Lesson.size()/2-1), random.nextInt());
        }
        System.out.println(Lesson);
        System.out.println("Checking GIT777");
    }
}
