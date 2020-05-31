import java.util.Scanner;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String result = text.replaceAll("\\s+", " ");
        System.out.println(result);

        // write your code here
    }
}