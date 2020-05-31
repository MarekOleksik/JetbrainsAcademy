import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();
        String codeWithoutComments = codeWithComments.replaceAll("\\/\\*.*?\\*\\/|\\/\\/.*", "");
        System.out.println(codeWithoutComments);

        // write your code here
    }
}
