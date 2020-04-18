import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == number) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}