import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        int searchInteger = scanner.nextInt();
        boolean result = false;
        for (int number : array) {
            if (number == searchInteger) {
                result = true;
            }
        }
        System.out.println(result);
    }
}