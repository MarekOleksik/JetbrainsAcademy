package tictactoe;

import java.util.Scanner;

public class Main {
    private static String[] charOfCells = new String[9];
    private static String cells;
    private static int counter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        cells = scanner.nextLine();
        for (int i = 0; i < cells.length(); i++) {
            charOfCells[i] = String.valueOf(cells.charAt(i));
        }

        System.out.println("---------");
        System.out.printf("| %s %s %s |%n", charOfCells[0], charOfCells[1], charOfCells[2]);
        System.out.printf("| %s %s %s |%n", charOfCells[3], charOfCells[4], charOfCells[5]);
        System.out.printf("| %s %s %s |%n", charOfCells[6], charOfCells[7], charOfCells[8]);
        System.out.println("---------");
        if (xWins()) {
            System.out.println("X wins");
        } else if (oWins()) {
            System.out.println("O wins");
        } else if (draw()) {
            System.out.println("Draw");
        } else if (gameNotFinished()) {
            System.out.println("Game not finished");
        } else if (impossible()) {
            System.out.println("Impossible");
        }
        // write your code here
    }

    private static boolean impossible() {
        if (counter > 1) {
            return true;
        }
        int numberOfX = 0;
        int numberOfO = 0;
        for (int i = 0; i < charOfCells.length; i++) {
            if (charOfCells[i].equals("X")) {
                numberOfX++;
            }
            if (charOfCells[i].equals("O")) {
                numberOfO++;
            }
        }
        if (Math.abs(numberOfO - numberOfX) > 1) {
            return true;
        }

        return false;
    }

    private static boolean xWins() {

        return checkWinner().equals("X");
    }

    private static boolean oWins() {
        return checkWinner().equals("O");
    }

    private static boolean draw() {
        boolean draw = true;
        for (int i = 0; i < charOfCells.length; i++) {
            if (!charOfCells[i].equals("X") && !charOfCells[i].equals(("O"))) {
                draw = false;
            }
        }
        return draw;
    }

    private static boolean gameNotFinished() {
        boolean notFinished = false;
        for (int i = 0; i < charOfCells.length; i++) {
            if (charOfCells[i].equals("_") && !impossible()) {
                notFinished = true;
            }
        }
        return notFinished;
    }

    private static String checkWinner() {
        String result = "";
        counter = 0;

        for (int i = 0; i < 8; i++) {
            String line = "";

            switch (i) {
                case 0:
                    line = charOfCells[0] + charOfCells[1] + charOfCells[2];
                    break;
                case 1:
                    line = charOfCells[3] + charOfCells[4] + charOfCells[5];
                    break;
                case 2:
                    line = charOfCells[6] + charOfCells[7] + charOfCells[8];
                    break;
                case 3:
                    line = charOfCells[0] + charOfCells[3] + charOfCells[6];
                    break;
                case 4:
                    line = charOfCells[1] + charOfCells[4] + charOfCells[7];
                    break;
                case 5:
                    line = charOfCells[2] + charOfCells[5] + charOfCells[8];
                    break;
                case 6:
                    line = charOfCells[0] + charOfCells[4] + charOfCells[8];
                    break;
                case 7:
                    line = charOfCells[2] + charOfCells[4] + charOfCells[6];
                    break;
            }

            if (line.equals("XXX")) {
                result = "X";
                counter++;
            } else if (line.equals("OOO")) {
                result = "O";
                counter++;
            }
            if (counter > 1) {
                result = "";
            }
        }
        return result;
    }
}
