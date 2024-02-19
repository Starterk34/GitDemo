import java.util.Random;

public class Lesson_Two_demension_Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 0;
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(100);
                if ((array[i][j] / 10) < 1) {
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
                System.out.print("\n");

        }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
            System.out.println("Max value is " + max);

            for (int i = 0; i < 5; i++) {
                int maxInRow = 0;
                for (int j = 0; j < 5; j++) {
                    if (array[i][j] > maxInRow) {
                        maxInRow = array[i][j];
                    }
                }
                System.out.println("Max value in the " + (i + 1) + " row is " + maxInRow);

            }
        }
    }
