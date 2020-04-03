import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        System.out.println(firstLine.replaceAll("\\s+", "").trim()
                .equals(secondLine.replaceAll("\\s+", "").trim()));
    }
}