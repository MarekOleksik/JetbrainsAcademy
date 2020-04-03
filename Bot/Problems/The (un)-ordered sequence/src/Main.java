import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int number;
        boolean isTrue = true;

        while (scanner.hasNext()) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            } else {
                list.add(number);
            }
        }

        if (list.size() == 1) {
            System.out.println(isTrue);
        } else {
            isTrue = isTrue(list);
            System.out.println(isTrue);
        }
    }

    private static boolean isTrue(List<Integer> list) {
        boolean isTrue = false;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(0) > list.get(1)) {
                if (list.get(i) >= list.get(i + 1)) {
                    isTrue = true;
                } else {
                    return false;
                }
            } else {
                if (list.get(i) <= list.get(i + 1)) {
                    isTrue = true;
                } else {
                    return false;
                }
            }
        }

        return isTrue;
    }
}
