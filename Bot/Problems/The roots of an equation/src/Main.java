import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            result = (a * i * i * i) + (b * i * i) + (c * i) + d;
            if (result == 0) {
                list.add(i);
            }
        }

        Collections.sort(list);
        for (int item : list) {
            System.out.println(item);
        }

    }
}