package converter;

public class DigitsConverter {

    public static String[] changeLettersToDigits(String[] splittedFractionalPart) {
        String[] result = new String[splittedFractionalPart.length];
        for (int i = 0; i < splittedFractionalPart.length; i++) {
            switch (splittedFractionalPart[i]) {
                case "1":
                    result[i] = "1";
                    break;
                case "2":
                    result[i] = "2";
                    break;
                case "3":
                    result[i] = "3";
                    break;
                case "4":
                    result[i] = "4";
                    break;
                case "5":
                    result[i] = "5";
                    break;
                case "6":
                    result[i] = "6";
                    break;
                case "7":
                    result[i] = "7";
                    break;
                case "8":
                    result[i] = "8";
                    break;
                case "9":
                    result[i] = "9";
                    break;
                case "0":
                    result[i] = "0";
                    break;
                case "a":
                    result[i] = "10";
                    break;
                case "b":
                    result[i] = "11";
                    break;
                case "c":
                    result[i] = "12";
                    break;
                case "d":
                    result[i] = "13";
                    break;
                case "e":
                    result[i] = "14";
                    break;
                case "f":
                    result[i] = "15";
                    break;
                case "g":
                    result[i] = "16";
                    break;
                case "h":
                    result[i] = "17";
                    break;
                case "i":
                    result[i] = "18";
                    break;
                case "j":
                    result[i] = "19";
                    break;
                case "k":
                    result[i] = "20";
                    break;
                case "l":
                    result[i] = "21";
                    break;
                case "m":
                    result[i] = "22";
                    break;
                case "n":
                    result[i] = "23";
                    break;
                case "o":
                    result[i] = "24";
                    break;
                case "p":
                    result[i] = "25";
                    break;
                case "q":
                    result[i] = "26";
                    break;
                case "r":
                    result[i] = "27";
                    break;
                case "s":
                    result[i] = "28";
                    break;
                case "t":
                    result[i] = "29";
                    break;
                case "u":
                    result[i] = "30";
                    break;
                case "v":
                    result[i] = "31";
                    break;
                case "w":
                    result[i] = "32";
                    break;
                case "x":
                    result[i] = "33";
                    break;
                case "y":
                    result[i] = "34";
                    break;
                case "z":
                    result[i] = "35";
                    break;
            }
        }
        return result;
    }

    public static String changeDigitsToLetters(String fractional) {
        String result = "";
        switch (fractional) {
            case "1":
                result = "1";
                break;
            case "2":
                result = "2";
                break;
            case "3":
                result = "3";
                break;
            case "4":
                result = "4";
                break;
            case "5":
                result = "5";
                break;
            case "6":
                result = "6";
                break;
            case "7":
                result = "7";
                break;
            case "8":
                result = "8";
                break;
            case "9":
                result = "9";
                break;
            case "0":
                result = "0";
                break;
            case "10":
                result = "a";
                break;
            case "11":
                result = "b";
                break;
            case "12":
                result = "c";
                break;
            case "13":
                result = "d";
                break;
            case "14":
                result = "e";
                break;
            case "15":
                result = "f";
                break;
            case "16":
                result = "g";
                break;
            case "17":
                result = "h";
                break;
            case "18":
                result = "i";
                break;
            case "19":
                result = "j";
                break;
            case "20":
                result = "k";
                break;
            case "21":
                result = "l";
                break;
            case "22":
                result = "m";
                break;
            case "23":
                result = "n";
                break;
            case "24":
                result = "o";
                break;
            case "25":
                result = "p";
                break;
            case "26":
                result = "q";
                break;
            case "27":
                result = "r";
                break;
            case "28":
                result = "s";
                break;
            case "29":
                result = "t";
                break;
            case "30":
                result = "u";
                break;
            case "31":
                result = "v";
                break;
            case "32":
                result = "w";
                break;
            case "33":
                result = "x";
                break;
            case "34":
                result = "y";
                break;
            case "35":
                result = "z";
                break;
        }

        return result;
    }
}
