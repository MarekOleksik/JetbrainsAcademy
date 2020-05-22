import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = number;
        while (number != 0) {
            number = scanner.nextInt();
            if (sum < 1000) {
                sum += number;
            } else {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}