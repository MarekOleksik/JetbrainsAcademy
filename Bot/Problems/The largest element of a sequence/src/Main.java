import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number >= largest) {
                largest = number;
            }
        }

        System.out.println(largest);
    }
}