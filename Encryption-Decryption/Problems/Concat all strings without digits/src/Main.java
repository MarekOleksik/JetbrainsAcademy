import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {

        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            StringBuilder stringBuilder = new StringBuilder(string);
            result.append(stringBuilder.toString().replaceAll("[0-9]", ""));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}