import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println((firstNumber > 0 && (secondNumber <= 0 && thirdNumber <= 0)) ||
                (secondNumber > 0 && (firstNumber <= 0 && thirdNumber <= 0)) ||
                (thirdNumber > 0 && (firstNumber <= 0 && secondNumber <= 0)));
    }
}