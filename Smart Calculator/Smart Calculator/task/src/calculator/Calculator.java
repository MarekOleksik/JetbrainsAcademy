package calculator;

public class Calculator {
    String a, operator, b;


    String calculations(String a, String operator, String b) {
        this.a = a;
        this.b = b;
        this.operator = operator;

        switch (operator) {
            case "+" :
                return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
            case "-" :
                return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
            default:
                return "Bad operator";
        }
    }
}
