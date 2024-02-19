import java.util.ArrayList;
import java.util.Random;

public class Lesson_Collections {
    public static void main (String[] args){
        Random random = new Random();
        ArrayList<Integer> Lesson = new ArrayList<>();
        for (int i=0; i<10; i++){
            Lesson.add(random.nextInt());
        }
        System.out.println(Lesson);
        System.out.println(Lesson.size());

       if (Lesson.size()%2==0){
           Lesson.add((Lesson.size()/2), random.nextInt());
       }
       else {
           Lesson.add((Lesson.size()-1)/2, random.nextInt());
       }
       System.out.println(Lesson);

    }
}
