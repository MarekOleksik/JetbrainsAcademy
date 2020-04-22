import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print(A[arraySize - 1] + " ");
        for (int i = 0; i < arraySize - 1; i++) {
            System.out.print(A[i] + " ");
        }
        // put your code here
    }
}
