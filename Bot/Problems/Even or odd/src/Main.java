import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            result = scanner.nextInt();
            if (result == 0) {
                break;
            } else {
                list.add(result);
            }
        }

        for (int item : list) {
            if (item % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}