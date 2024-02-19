import java.util.Random;

public class HW_Arrays_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        int[] b = new int[20];
        int dif = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(5);
            System.out.println(i + 1 + " element of array A is " + a[i]);
            b[i] = random.nextInt(5);
            System.out.println(i + 1 + " element of array B is " + b[i]);
            if (a[i] != b[i]) {
                dif = dif +1;
            }
        }
        System.out.println("Amount of different elements of arrays is " + dif);
    }
}
