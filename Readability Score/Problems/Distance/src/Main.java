import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int timeTravel = scanner.nextInt();
        System.out.println((double) distance / timeTravel);
    }
}