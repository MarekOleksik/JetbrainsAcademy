import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String code = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(code.contains(text));

    }
}