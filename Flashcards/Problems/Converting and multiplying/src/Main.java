import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        text = scanner.next();
        List<String> list = new LinkedList<>();
        addValueToList(text, list);
        while (!"0".equals(text)) {
            text = scanner.next();
            addValueToList(text, list);
        }
        list.remove(list.size() - 1);
        list.forEach(System.out::println);
        // put your code here
    }

    private static void addValueToList(String text, List<String> list) {
        try {
            list.add(String.valueOf(Integer.parseInt(text) * 10));
        } catch (Exception e) {
            list.add("Invalid user input: " + text);
        }
    }
}