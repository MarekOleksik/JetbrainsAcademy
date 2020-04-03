import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeanut = scanner.nextInt();
        boolean isWeekend = Boolean.parseBoolean(scanner.next());
        if (isWeekend) {
            System.out.println(numberOfPeanut >= 15 && numberOfPeanut <= 25);
        } else {
            System.out.println(numberOfPeanut >= 10 && numberOfPeanut <= 20);
        }
    }
}