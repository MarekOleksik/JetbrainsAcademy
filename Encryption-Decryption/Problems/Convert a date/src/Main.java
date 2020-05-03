import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] splitedDate = date.split("-");
        System.out.printf("%s/%s/%s", splitedDate[1], splitedDate[2], splitedDate[0]);
        // put your code here
    }
}