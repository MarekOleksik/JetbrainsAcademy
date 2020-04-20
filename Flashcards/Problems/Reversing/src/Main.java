import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        String[] numbers = result.split("");

        if (numbers[2].equals("0")) {
            System.out.print(numbers[1] + numbers[0]);
        } else {
            System.out.print(numbers[2] + numbers[1] + numbers[0]);
        }
    }
}
