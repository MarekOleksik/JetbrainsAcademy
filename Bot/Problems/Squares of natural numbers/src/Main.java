import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = i * i;
            if (result <= n) {
                System.out.println(result);
            } else {
                break;
            }
        }

    }
}