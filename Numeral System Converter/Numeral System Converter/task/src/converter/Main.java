package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int radix = scanner.nextInt();
        String prefix;

        switch (radix) {
            case 2:
                prefix = "0b";
                break;
            case 8:
                prefix = "0";
                break;
            case 16:
                prefix = "0x";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + radix);
        }

        System.out.println(prefix + Long.toString(number, radix));
    }
}
