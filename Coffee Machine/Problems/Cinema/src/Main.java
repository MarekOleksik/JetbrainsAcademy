import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] cinemaSeats = new int[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinemaSeats[i][j] = scanner.nextInt();
            }
        }

        int availableSeats = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < cinemaSeats.length; i++) {
            int counter = 1;

            for (int j = 1; j < cinemaSeats[i].length; j++) {
                if (cinemaSeats[i][j] == 0 && availableSeats == 1) {
                    result = i + 1;
                    i = cinemaSeats.length;
                    break;
                }

                if (cinemaSeats[i][j] == cinemaSeats[i][j - 1] && cinemaSeats[i][j - 1] == 0) {
                    counter++;
                    if (counter == availableSeats) {
                        result = i + 1;
                        i = cinemaSeats.length;
                        break;
                    }
                }
                if (cinemaSeats[i][j] == 1) {
                    counter = 1;
                }
            }
        }

        System.out.println(result);
    }
}
