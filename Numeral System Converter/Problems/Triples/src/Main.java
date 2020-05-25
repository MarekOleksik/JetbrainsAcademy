import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        int countOfTriples = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == array[i - 1] + 1 && array[i] == array[i + 1] - 1) {
                countOfTriples++;
            }
        }
        System.out.println(countOfTriples);
    }
}