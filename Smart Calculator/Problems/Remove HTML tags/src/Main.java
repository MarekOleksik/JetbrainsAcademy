import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWithHTMlTags = scanner.nextLine();
        String stringWithoutHTMlTags = stringWithHTMlTags.replaceAll("<.*?>", "");
        System.out.println(stringWithoutHTMlTags);

        // write your code here
    }
}
