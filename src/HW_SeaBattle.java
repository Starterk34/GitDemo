import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW_SeaBattle {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        int[][] BattleField = new int[10][10];
        int row;
        int column;
        int rowMargin;
        int columnMargin = 0;
        String columnString;
        String direction;
        do {
            System.out.println("Enter the starting point of four-deck ship. First provide the row from 1 to 10. Then provide the column from a to j");
            row = stdin.nextInt();
            columnString = stdin.next();
            switch (columnString) {
                case "a":
                    column = 0;
                    break;
                case "b":
                    column = 1;
                    break;
                case "c":
                    column = 2;
                    break;
                case "d":
                    column = 3;
                    break;
                case "e":
                    column = 4;
                    break;
                case "f":
                    column = 5;
                    break;
                case "g":
                    column = 6;
                    break;
                case "h":
                    column = 7;
                    break;
                case "i":
                    column = 8;
                    break;
                case "j":
                    column = 9;
                    break;
                default:
                    column = 10;
            }

        } while (row < 0 || row > 10 || column < 0 || column >= 10);
        do {
            System.out.println("Enter the direction of ship placement: up, down left or right");
            direction = stdin.next();
        } while (!direction.equalsIgnoreCase("up") && !direction.equalsIgnoreCase("down") && !direction.equalsIgnoreCase("left") && !direction.equalsIgnoreCase("right"));
        if (direction.equalsIgnoreCase("up")) {
            columnMargin = (row - 4);
            if (columnMargin < 0) {
                System.out.println("Position of ship is incorrect");
            } else {
                for (int i = (row - 1); i >= 0; i--) {
                    BattleField[i][column] = 1;
                }
            }
        }
        else if (direction.equalsIgnoreCase("down")){
            columnMargin = (row+4);
            if (columnMargin>11){
                System.out.println("Position of ship is incorrect");
            }
            else {
               for (int i=(row-1); i<10;i++){
                   BattleField[i][column] = 1;
               }
            }
        }



        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(BattleField[i][j]);
            }
            System.out.print("\n");
        }
    }
}
