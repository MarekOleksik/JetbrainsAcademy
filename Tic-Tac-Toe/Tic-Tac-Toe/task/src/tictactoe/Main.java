package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String cells = scanner.nextLine();
        char[] charOfCells = cells.toCharArray();
        System.out.println("---------");
        System.out.printf("| %c %c %c |%n", charOfCells[0], charOfCells[1], charOfCells[2]);
        System.out.printf("| %c %c %c |%n", charOfCells[3], charOfCells[4], charOfCells[5]);
        System.out.printf("| %c %c %c |%n", charOfCells[6], charOfCells[7], charOfCells[8]);
        System.out.println("---------");

        // write your code here
    }
}
