import java.io.BufferedInputStream;
import java.util.Scanner;

public class HW_SeaBattle_v2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        int[][] BattleField = new int[10][10];
        int row;
        int column;
        String columnString;
        String direction;
        int result = 0;
        do {
            System.out.println("Enter the starting point of four-deck ship. First provide the row from 1 to 10 and press Enter. Then provide the column from a to j and press Enter");
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
            System.out.println("Enter the direction of ship placement: up, down left or right");
            direction = stdin.next();
            if (row <= 0 || row > 10 || column >= 10 || (!direction.equalsIgnoreCase("up") && !direction.equalsIgnoreCase("down") && !direction.equalsIgnoreCase("left") && !direction.equalsIgnoreCase("right"))) {
                System.out.println("You provided wrong data. Please try again.");
                result = 2;
            } else {
                if (direction.equalsIgnoreCase("up")) {
                    if (row < 4) {
                        result = 2;
                        System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                    } else {
                        result = 1;
                        for (int i = row - 1; i >= (row - 4); i--) {
                            BattleField[i][column] = 1;
                        }

                    }

                } else if (direction.equalsIgnoreCase("down")) {
                    if (row > 7) {
                        System.out.println("Position of ship is incorrect. It is out of the border of the field.");
                        result = 2;
                    } else {
                        result = 1;
                        for (int i = (row - 1); i < row + 3; i++) {
                            BattleField[i][column] = 1;
                        }
                    }
                } else if (direction.equalsIgnoreCase("right")) {
                    if (column > 6) {
                        System.out.println("Position of ship is incorrect. It is out of the border of the field.");
                        result = 2;
                    } else {
                        result = 1;
                        for (int i = column; i < column + 4; i++) {
                            BattleField[row - 1][i] = 1;
                        }
                    }

                } else if (direction.equalsIgnoreCase("left")) {
                    if (column < 3) {
                        System.out.println("Position of ship is incorrect. It is out of the border of the field.");
                        result = 2;
                    } else {
                        result = 1;
                        for (int i = column; i > column - 4; i--) {
                            BattleField[row - 1][i] = 1;
                        }
                    }
                }
            }
        }
        while (result == 2);
        System.out.println("See the ships already placed and go for the next one!");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  " + BattleField[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 2; i++) {
            do {
                result = 0;
                System.out.println("Enter the starting point of the " + (i + 1) + " three-deck ship. First provide the row from 1 to 10 and press Enter. Then provide the column from a to j and press Enter");
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
                System.out.println("Enter the direction of ship placement: up, down left or right");
                direction = stdin.next();
                if (row <= 0 || row > 10 || column >= 10 || (!direction.equalsIgnoreCase("up") && !direction.equalsIgnoreCase("down") && !direction.equalsIgnoreCase("left") && !direction.equalsIgnoreCase("right"))) {
                    System.out.println("You provided wrong data. Please try again.");
                    result = 2;
                } else {
                    if (direction.equalsIgnoreCase("up")) {
                        if (row < 3) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((column == 0 && row == 3 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 3][column] != 1)
                                || (column == 0 && row != 10 && row != 3 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 4][column + 1] != 1 && BattleField[row - 4][column] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 3][column] != 1)
                                || (column == 0 && row == 10 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 4][column + 1] != 1 && BattleField[row - 4][column] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 3][column] != 1)
                                || (column != 0 && column != 9 && row==3 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 && BattleField[row - 3][column + 1] != 1)
                                || (column != 0 && column != 9 && row!= 3 && row!= 10 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 4][column - 1] != 1 && BattleField[row - 4][column] != 1 && BattleField[row - 4][column + 1] != 1)
                                || (column != 0 && column != 9 && row== 10 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 4][column - 1] != 1 && BattleField[row - 4][column] != 1 && BattleField[row - 4][column + 1] != 1)
                                || (column == 9 && row == 3 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1)
                                || (column == 9 && row!= 3 && row != 10 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 && BattleField[row - 4][column - 1] != 1 && BattleField[row - 4][column] != 1)
                                || (column == 9 && row == 10 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 && BattleField[row - 4][column - 1] != 1 && BattleField[row - 4][column] != 1)) {
                            for (int j = row - 1; j >= row - 3; j--) {
                                BattleField[j][column] = 1;
                                result = 1;
                            }
                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }
                    } else if (direction.equalsIgnoreCase("down")) {
                        if (row > 8) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((column == 0 && row == 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1 && BattleField[row + 2][column] != 1 && BattleField[row + 2][column + 1] != 1)
                                || (column == 0 && row != 1 && row != 8 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1 && BattleField[row + 2][column] != 1 && BattleField[row + 2][column + 1] != 1)
                                || (column == 0 && row == 8 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1)
                                || (column != 0 && column != 9 && row == 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1)
                                || (column != 0 && column != 9 && row != 1 && row != 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1 && BattleField[row + 2][column - 1] != 1 && BattleField[row + 2][column] != 1 && BattleField[row + 2][column + 1] != 1)
                                || (column != 0 && column != 9 && row == 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1)
                                || (column == 9 && row == 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 & BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 & BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 2][column - 1] != 1 && BattleField[row + 2][column] != 1)
                                || (column == 9 && row != 1 && row != 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 & BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 & BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 2][column - 1] != 1 && BattleField[row + 2][column] != 1)
                                || (column == 9 && row == 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 & BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 & BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1)) {
                            for (int j = row - 1; j <= (row + 1); j++) {
                                BattleField[j][column] = 1;
                                result = 1;
                            }
                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }
                    } else if (direction.equalsIgnoreCase("left")) {
                        if (column < 2) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((row == 1 && column == 2 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row][column - 2] != 1)
                                || (row != 1 && row != 10 && column == 2 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row][column - 2] != 1)
                                || (row == 10 && column == 2 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 1][column - 2] != 1)
                                || (row == 1 && column != 2 && column != 9 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row][column - 2] != 1 && BattleField[row - 1][column - 3] != 1 && BattleField[row][column - 3] != 1)
                                || (row != 1 && row != 10 && column != 2 && column != 9 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 3] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row][column - 2] != 1 && BattleField[row - 1][column - 3] != 1 && BattleField[row][column - 3] != 1)
                                || (row == 10 && column != 2 && column != 9 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 3] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 3] != 1)
                                || (row == 1 && column == 9 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 3] != 1 && BattleField[row][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column - 2] != 1 && BattleField[row][column - 3] != 1)
                                || (row != 1 && row != 10 && column == 9 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 3] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 3] != 1 && BattleField[row][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column - 2] != 1 && BattleField[row][column - 3] != 1)
                                || (row == 10 && column == 9 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 3] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 3] != 1)) {
                            for (int j = column; j > column - 3; j--) {
                                BattleField[row - 1][j] = 1;
                                result = 1;
                            }

                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }

                    } else if (direction.equalsIgnoreCase("right")) {
                        if (column > 7) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((row == 1 && column == 0 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1 && BattleField[row][column + 3] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row - 1][column + 3] != 1)
                                || (row != 1 && row != 10 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 2][column + 3] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1 && BattleField[row][column + 3] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row - 1][column + 3] != 1)
                                || (row == 10 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 2][column + 3] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row - 1][column + 3] != 1)
                                || (row == 1 && column != 0 && column != 7 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row - 1][column + 3] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1 && BattleField[row][column + 3] != 1)
                                || (row != 1 && row != 10 && column != 0 && column != 7 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 2][column + 3] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row - 1][column + 3] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1 && BattleField[row][column + 3] != 1)
                                || (row == 10 && column != 0 && column != 7 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 2][column + 3] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row - 1][column + 3] != 1)
                                || (row == 1 && column == 7 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1)
                                || (row != 1 && row != 10 && column == 7 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1)
                                || (row == 10 && column == 7 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1)) {
                            for (int j = column; j < column + 3; j++) {
                                BattleField[row - 1][j] = 1;
                                result = 1;
                            }
                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }
                    }
                    System.out.println("See the ships already placed and go for the next one!");
                    for (int k = 0; k < 10; k++) {
                        for (int l = 0; l < 10; l++) {
                            System.out.print("  " + BattleField[k][l]);
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                }
            }
            while (result == 2);

        }
        for (int i = 0; i < 3; i++) {
            do {
                result = 0;
                System.out.println("Enter the starting point of the " + (i + 1) + " two-deck ship. First provide the row from 1 to 10 and press Enter. Then provide the column from a to j and press Enter");
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
                System.out.println("Enter the direction of ship placement: up, down left or right");
                direction = stdin.next();
                if (row <= 0 || row > 10 || column >= 10 || (!direction.equalsIgnoreCase("up") && !direction.equalsIgnoreCase("down") && !direction.equalsIgnoreCase("left") && !direction.equalsIgnoreCase("right"))) {
                    System.out.println("You provided wrong data. Please try again.");
                    result = 2;
                } else {
                    if (direction.equalsIgnoreCase("up")) {
                        if (row < 2) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((row == 2 && column == 0 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1)
                                || (row != 2 && row != 10 && column == 0 && BattleField[row - 3][column] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row == 10 && column == 0 && BattleField[row - 3][column] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1)
                                || (row == 2 && column != 0 && column != 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row != 2 && row != 10 && column != 0 && column != 9 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row == 10 && column != 0 && column != 9 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 && BattleField[row - 3][column + 1] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1)
                                || (row == 2 && column == 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1)
                                || (row != 2 && row != 10 && column == 9 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 & BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1)
                                || (row == 10 && column == 9 && BattleField[row - 3][column - 1] != 1 && BattleField[row - 3][column] != 1 & BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1)) {
                            for (int j = row - 1; j > row - 3; j--) {
                                BattleField[j][column] = 1;
                                result = 1;
                            }
                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }

                    } else if (direction.equalsIgnoreCase("down")) {
                        if (row > 8) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((row == 1 && column == 0 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1)
                                || (row != 1 && row != 9 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1)
                                || (row == 9 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row == 1 && column != 0 && column != 9 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1)
                                || (row != 1 && row != 9 && column != 0 && column != 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1 && BattleField[row + 1][column + 1] != 1)
                                || (row == 9 && column != 0 && column != 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row == 1 && column == 9 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1)
                                || (row != 1 && row != 9 && column == 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row + 1][column - 1] != 1 && BattleField[row + 1][column] != 1)
                                || (row == 9 && column == 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1)) {
                            for (int j = row - 1; j < row + 1; j++) {
                                BattleField[j][column] = 1;
                                result = 1;
                            }
                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }

                    } else if (direction.equalsIgnoreCase("left")) {
                        if (column < 1) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((row == 1 && column == 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row != 1 && row != 10 && column == 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row == 10 && column == 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1)
                                || (row == 1 && column != 1 && column != 9 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row != 1 && row != 10 && column != 1 && column != 9 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row == 10 && column != 1 && column != 9 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1)
                                || (row == 1 && column == 9 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1)
                                || (row != 1 && row != 10 && column == 9 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1)
                                || (row == 10 && column == 9 && BattleField[row - 2][column - 2] != 1 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1)) {
                            for (int j = column; j > column - 2; j--) {
                                BattleField[row - 1][j] = 1;
                                result = 1;
                            }
                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }

                    } else if (direction.equalsIgnoreCase("right")) {
                        if (column > 8) {
                            result = 2;
                            System.out.println("Position of the ship is incorrect. It is out of the border of the field.");
                        } else if ((row == 1 && column == 0 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1)
                                || (row != 1 && row != 10 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1)
                                || (row == 10 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1)
                                || (row == 1 && column != 0 && column != 8 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1)
                                || (row != 1 && row != 10 && column != 0 && column != 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1 && BattleField[row][column + 2] != 1)
                                || (row == 10 && column != 0 && column != 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 2][column + 2] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row - 1][column + 2] != 1)
                                || (row == 1 && column == 8 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row != 1 && row != 10 && column == 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                                || (row == 10 && column == 8 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1)) {
                            for (int j = column; j < column + 2; j++) {
                                BattleField[row - 1][j] = 1;
                                result = 1;
                            }
                        } else {
                            System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                            result = 2;
                        }
                    }
                    System.out.println("See the ships already placed and go for the next one!");
                    for (int k = 0; k < 10; k++) {
                        for (int l = 0; l < 10; l++) {
                            System.out.print("  " + BattleField[k][l]);
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                }


            }
            while (result == 2);
        }
        for (int i = 0; i < 4; i++) {
            do {
                result = 0;
                System.out.println("Enter the starting point of the " + (i + 1) + " one-deck ship. First provide the row from 1 to 10 and press Enter. Then provide the column from a to j and press Enter");
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
                if (row <= 0 || row > 10 || column >= 10) {
                    System.out.println("You provided wrong data. Please try again.");
                    result = 2;
                } else if ((row == 1 && column == 0 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                        || (row != 1 && row != 10 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                        || (row == 10 && column == 0 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1)
                        || (row == 1 && column != 0 && column != 9 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                        || (row != 1 && row != 10 && column != 0 && column != 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1 && BattleField[row][column + 1] != 1)
                        || (row == 10 && column != 0 && column != 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 2][column + 1] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row - 1][column + 1] != 1)
                        || (row == 1 && column == 9 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1)
                        || (row != 1 && row != 10 && column == 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1 && BattleField[row][column - 1] != 1 && BattleField[row][column] != 1)
                        || (row == 10 && column == 9 && BattleField[row - 2][column - 1] != 1 && BattleField[row - 2][column] != 1 && BattleField[row - 1][column - 1] != 1 && BattleField[row - 1][column] != 1)) {
                    BattleField[row - 1][column] = 1;
                } else {
                    System.out.println("Position of the ship is incorrect. Ship has to be placed at least one sell from another ships.");
                    result = 2;
                }


            }
            while (result == 2);
            if (i != 3) {
                System.out.println("You are almost there! " + (3-i) + " one-deck ships left.");
                System.out.println("See the ships already placed and go for the next one!");
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        System.out.print("  " + BattleField[k][l]);
                    }
                    System.out.print("\n");

                }
            } else {
                System.out.println("Congrats! All the ships are placed. See your ships on the battlefield.");
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        System.out.print("  " + BattleField[k][l]);
                    }
                    System.out.print("\n");
                }

            }

        }
    }
}