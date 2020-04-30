package tictactoe;

import java.util.Scanner;

public class Game {
    private String[][] charOfCells = new String[3][3];
    private String cells;
    private int counter;
    private Scanner scanner = new Scanner(System.in);

    void play1() {
        scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        cells = scanner.nextLine();
        readRows();
        drawBoard();
        System.out.print("Enter the coordinates: ");
        String coordinates = scanner.nextLine();
        String[] array = coordinates.split(" ");
        while (!isNumeric(array[0]) || !isNumeric(array[1])) {
            System.out.println("You should enter numbers!");
            System.out.print("Enter the coordinates: ");
            coordinates = scanner.nextLine();
            array = coordinates.split(" ");
        }
        int row = Integer.parseInt(array[0]);
        int column = Integer.parseInt(array[1]);
        while (row > 3 || row < 1 || column > 3 || column < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            System.out.print("Enter the coordinates: ");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }
        while (!charOfCells[row - 1][column - 1].equals("_")) {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.print("Enter the coordinates: ");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }
        charOfCells[row - 1][column - 1] = "X";
        drawBoard();
    }

    void play() {
        scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        cells = scanner.nextLine();
        readRows();
        drawBoard();
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
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private void readRows() {

        for (int i = 0; i < 3; i++) {
            charOfCells[i][2] = String.valueOf(cells.charAt(i));
        }
        for (int i = 0; i < 3; i++) {
            charOfCells[i][1] = String.valueOf(cells.charAt(i + 3));
        }
        for (int i = 0; i < 3; i++) {
            charOfCells[i][0] = String.valueOf(cells.charAt(i + 6));
        }
    }

    private void drawBoard() {
        System.out.println("---------");
        System.out.printf("| %s %s %s |%n", charOfCells[0][2], charOfCells[1][2], charOfCells[2][2]);
        System.out.printf("| %s %s %s |%n", charOfCells[0][1], charOfCells[1][1], charOfCells[2][1]);
        System.out.printf("| %s %s %s |%n", charOfCells[0][0], charOfCells[1][0], charOfCells[2][0]);
        System.out.println("---------");
    }

    private boolean impossible() {
        if (counter > 1) {
            return true;
        }
        int numberOfX = 0;
        int numberOfO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (charOfCells[i][j].equals("X")) {
                    numberOfX++;
                }
                if (charOfCells[i][j].equals("O")) {
                    numberOfO++;
                }
            }
        }
        if (Math.abs(numberOfO - numberOfX) > 1) {
            return true;
        }

        return false;
    }

    private boolean xWins() {

        return checkWinner().equals("X");
    }

    private boolean oWins() {

        return checkWinner().equals("O");
    }

    private boolean draw() {
        boolean draw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!charOfCells[i][j].equals("X") && !charOfCells[i][j].equals(("O"))) {
                    draw = false;
                }
            }
        }
        return draw;
    }

    private boolean gameNotFinished() {
        boolean notFinished = false;
        for (int i = 0; i < charOfCells.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (charOfCells[i][j].equals("_") && !impossible()) {
                    notFinished = true;
                }
            }
        }
        return notFinished;
    }

    private String checkWinner() {
        String result = "";
        counter = 0;

        for (int i = 0; i < 8; i++) {
            String line = "";

            switch (i) {
                case 0:
                    line = charOfCells[0][0] + charOfCells[0][1] + charOfCells[0][2];
                    break;
                case 1:
                    line = charOfCells[1][0] + charOfCells[1][1] + charOfCells[1][2];
                    break;
                case 2:
                    line = charOfCells[2][0] + charOfCells[2][1] + charOfCells[2][2];
                    break;
                case 3:
                    line = charOfCells[0][0] + charOfCells[1][0] + charOfCells[2][0];
                    break;
                case 4:
                    line = charOfCells[0][1] + charOfCells[1][1] + charOfCells[2][1];
                    break;
                case 5:
                    line = charOfCells[0][2] + charOfCells[1][2] + charOfCells[2][2];
                    break;
                case 6:
                    line = charOfCells[0][0] + charOfCells[1][1] + charOfCells[2][2];
                    break;
                case 7:
                    line = charOfCells[0][2] + charOfCells[1][1] + charOfCells[2][0];
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
