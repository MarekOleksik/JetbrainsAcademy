import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParts = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < numberOfParts; i++) {
            switch (scanner.nextInt()) {
                case -1:
                    smaller++;
                    break;
                case 0:
                    perfect++;
                    break;
                case 1:
                    larger++;
                    break;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}