import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            list.add(scanner.nextInt());
        }
        int number = scanner.nextInt();
        int sum = 0;
        for (int item : list) {
            if (item > number) {
                sum += item;
            }
        }
        System.out.println(sum);
    }
}