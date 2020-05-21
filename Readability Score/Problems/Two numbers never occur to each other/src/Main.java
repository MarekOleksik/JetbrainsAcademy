import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < sizeArray; i++) {
            list.add(scanner.nextInt());
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isNotNext = true;

        for (int i = 1; i < list.size(); i++) {
            if (m == list.get(i) && n == list.get(i - 1) || n == list.get(i) && m == list.get(i - 1)) {
                isNotNext = false;
                break;
            }
        }
        System.out.println(isNotNext);
    }
}