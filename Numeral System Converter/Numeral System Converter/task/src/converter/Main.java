package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        String sourceNumber = scanner.next();
        int targetRadix = scanner.nextInt();
        int decimalNumber = 0;

        if (sourceRadix == 1) {
            String[] sourceNumbers = sourceNumber.split("");
            for (int i = 0; i < sourceNumbers.length; i++) {
                decimalNumber += Integer.parseInt(sourceNumbers[i]);
            }
        } else {
            decimalNumber = Integer.parseInt(sourceNumber, sourceRadix);
        }

        if (targetRadix == 1) {
            String result = "";
            for (int i = 0; i < decimalNumber; i++) {
                result += "1";
            }
            System.out.println(result);
        } else {
            System.out.println(Integer.toString(decimalNumber, targetRadix));
        }

    }
}
