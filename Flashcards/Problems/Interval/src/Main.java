import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if ((-15 < number && number <= 12) || (14 < number && number < 17) || (19 <= number && number < Long.MAX_VALUE)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}