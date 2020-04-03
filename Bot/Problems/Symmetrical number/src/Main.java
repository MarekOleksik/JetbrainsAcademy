import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        switch (number.length()) {
            case 3:
                number = "0" + number;
                break;
            case 2:
                number = "00" + number;
                break;
            case 1:
                number = "000" + number;
                break;
        }
        if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2)) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }
    }
}