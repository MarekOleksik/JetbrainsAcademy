package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        String sourceNumber = scanner.next();
        int targetRadix = scanner.nextInt();
        String[] splittedIntoIntegerAndFractional = new String[0];

        int integerPartDecimal = 0;
        double fractionalPartDecimal = 0;
        String integerPartConverted = "";

        if (sourceRadix == 1) {
            String[] sourceNumbers = sourceNumber.split("");
            for (int i = 0; i < sourceNumbers.length; i++) {
                integerPartDecimal += Integer.parseInt(sourceNumbers[i]);
            }
        } else {
            splittedIntoIntegerAndFractional = sourceNumber.split("\\.");
            if (splittedIntoIntegerAndFractional.length <= 1) {
                integerPartDecimal = Integer.parseInt(sourceNumber, sourceRadix);
            } else {
                integerPartDecimal = Integer.parseInt(splittedIntoIntegerAndFractional[0], sourceRadix);
                String[] splittedFractionalPart = splittedIntoIntegerAndFractional[1].split("");
                String[] splittedFractionalPartWithoutLetters = DigitsConverter.changeLettersToDigits(splittedFractionalPart);
                for (int i = 1; i <= splittedIntoIntegerAndFractional[1].length(); i++) {
                    fractionalPartDecimal += Double.parseDouble(splittedFractionalPartWithoutLetters[i - 1]) / Math.pow(sourceRadix, i);
                }
            }
        }

        if (targetRadix == 1) {
            String result = "";
            for (int i = 0; i < integerPartDecimal; i++) {
                result += "1";
            }
            System.out.println(result);
        } else {
            if (splittedIntoIntegerAndFractional.length <= 1) {
                System.out.println(Integer.toString(integerPartDecimal, targetRadix));
            } else {
                integerPartConverted = Integer.toString(integerPartDecimal, targetRadix);
                double temp = fractionalPartDecimal;
                String result = "";
                for (int i = 0; i < 5; i++) {
                    double fractional = temp * targetRadix;
                    String output = Double.toString(fractional);
                    String[] outputs = output.split("\\.");
                    result += DigitsConverter.changeDigitsToLetters(outputs[0]);
                    temp = Double.parseDouble("0." + outputs[1]);
                }

                System.out.println(integerPartConverted + "." + result);
            }

        }

    }


}
