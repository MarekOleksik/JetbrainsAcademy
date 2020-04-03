import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int beginIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        System.out.println(text.substring(beginIndex, endIndex + 1));
    }
}