package tictactoe;

import java.util.Scanner;

public class Game {
    private String[][] charOfCells = new String[3][3];
    private Scanner scanner = new Scanner(System.in);
    private String turn = "X";
    private boolean gameOver = false;
    private String[] array = new String[2];
    private String coordinates = "";

    void play() {
        start();
        while (!gameOver) {
            enterCoordinates();
            changeTurn();
            checkBoard();
        }

    }

    private void start() {
        for (int i = 0; i < charOfCells.length; i++) {
            for (int j = 0; j < charOfCells[i].length; j++) {
                charOfCells[i][j] = " ";
            }
        }
        drawBoard();
    }

    private void enterCoordinates() {
        System.out.print("Enter the coordinates: ");
        coordinates = scanner.nextLine();
        array = coordinates.split(" ");
        while (!checkValidate()) {
            System.out.print("Enter the coordinates: ");
            coordinates = scanner.nextLine();
            array = coordinates.split(" ");
        }
    }

    private void changeTurn() {
        int row = Integer.parseInt(array[0]);
        int column = Integer.parseInt(array[1]);

        if (turn.equals("X")) {
            charOfCells[row - 1][column - 1] = "X";
            turn = "O";
        } else {
            charOfCells[row - 1][column - 1] = "O";
            turn = "X";
        }
    }

    private boolean checkValidate() {
        while (!isNumeric(array[0]) || !isNumeric(array[1])) {
            System.out.println("You should enter numbers!");
            return false;
        }

        while (Integer.parseInt(array[0]) > 3 || Integer.parseInt(array[0]) < 1 || Integer.parseInt(array[1]) > 3 || Integer.parseInt(array[1]) < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }

        while (!charOfCells[Integer.parseInt(array[0]) - 1][Integer.parseInt(array[1]) - 1].equals("_") && !charOfCells[Integer.parseInt(array[0]) - 1][Integer.parseInt(array[1]) - 1].equals(" ")) {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
        return true;
    }

    private void checkBoard() {
        drawBoard();
        if (xWins()) {
            gameOver = true;
            System.out.println("X wins");
        } else if (oWins()) {
            gameOver = true;
            System.out.println("O wins");
        } else if (draw()) {
            gameOver = true;
            System.out.println("Draw");
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private void drawBoard() {
        System.out.println("---------");
        System.out.printf("| %s %s %s |%n", charOfCells[0][2], charOfCells[1][2], charOfCells[2][2]);
        System.out.printf("| %s %s %s |%n", charOfCells[0][1], charOfCells[1][1], charOfCells[2][1]);
        System.out.printf("| %s %s %s |%n", charOfCells[0][0], charOfCells[1][0], charOfCells[2][0]);
        System.out.println("---------");
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

    private String checkWinner() {
        String result = "";

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
            } else if (line.equals("OOO")) {
                result = "O";
            }

        }
        return result;
    }
}
