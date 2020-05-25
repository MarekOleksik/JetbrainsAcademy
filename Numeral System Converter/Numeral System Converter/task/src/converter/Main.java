package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = 0;
        String sourceNumber = "";
        int targetRadix = 0;
        try {
            sourceRadix = scanner.nextInt();
            sourceNumber = scanner.next();
            targetRadix = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("error");
        }


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
            if (sourceRadix > Character.MAX_RADIX || sourceRadix < Character.MIN_RADIX) {
                System.out.println("Error - Source Radix is not valid.");
                return;
            }
            try {
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
            } catch (Exception e) {
                System.out.println("error");
            }

        }

        if (targetRadix == 1) {
            String result = "";
            for (int i = 0; i < integerPartDecimal; i++) {
                result += "1";
            }
            System.out.println(result);
        } else {
            if (targetRadix > Character.MAX_RADIX || targetRadix < Character.MIN_RADIX) {
                System.out.println("Error - Target Radix is not valid.");
                return;
            }
            try {
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
            } catch (Exception e) {
                System.out.println("error");
            }

        }

    }


}
