import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] elements = new int[numberOfElements];
        int i = 0;
        int maximumElementDivisibleByFour = 0;
        while (i < numberOfElements) {
            elements[i] = scanner.nextInt();
            if (elements[i] % 4 == 0 && elements[i] > maximumElementDivisibleByFour) {
                maximumElementDivisibleByFour = elements[i];
            }
            i++;
        }
        System.out.println(maximumElementDivisibleByFour);
        // put your code here
    }
}
