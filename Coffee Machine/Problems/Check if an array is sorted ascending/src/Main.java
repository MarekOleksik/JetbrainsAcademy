import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
            list.add(array[i]);
        }
        Collections.sort(list);
        boolean isSorted = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != array[i]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
