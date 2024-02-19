import java.util.Random;

public class Lesson_4_Array_3 {
    public static void main(String[] args){
        int[] group = new int[32];
        int max = 0;
        int min = 100;
        Random random = new Random();
        for (int i = 0; i < group.length; i++){
            group[i] = random.nextInt(101);
            System.out.println("English test result for the "+ (i+1) + " student is " + group[i]);
            if (group[i] > max){
                max = group [i];
            }
            if (group[i] < min){
                min = group[i];
            }
        }
        System.out.println("Max grade in calss is "+ max);
        System.out.println("Min grade in calss is "+ min);

    }
}
