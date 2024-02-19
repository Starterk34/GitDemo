import java.util.Random;

public class Lesson_TwoDemension_arrays_2 {
    public static void main (String[] args){
        Random random = new Random();
        int citizens = 0;
        int array [][] = new int [5][];
        for (int i=0; i< array.length;i++){
            if ((i+1)%2==1){
                array[i] = new int [5];
            }
            else {
                array [i] = new int [6];
            }
            for (int j = 0; j<array[i].length; j++){
                array[i][j] = random.nextInt(4)+1;
                System.out.print(array[i][j] + " ");
                citizens = citizens+array[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("Total amount of citizens in this house is " +citizens);


    }
}
