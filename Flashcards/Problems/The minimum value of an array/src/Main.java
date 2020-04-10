import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int minimum = Integer.MAX_VALUE;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println(minimum);
    }
}