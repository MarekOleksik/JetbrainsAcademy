import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] numbers = number.split("");
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            sum1 += Integer.parseInt(numbers[i]);
        }
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            sum2 += Integer.parseInt(numbers[i]);
        }
        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}