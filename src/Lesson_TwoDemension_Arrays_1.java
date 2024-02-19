import java.util.Random;

public class Lesson_TwoDemension_Arrays_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[][] = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                if ((array[i][j] / 10) < 1) {
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2 != 0){
                    array[i][j]++;
                }
                if ((array[i][j] / 10) < 1) {
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}