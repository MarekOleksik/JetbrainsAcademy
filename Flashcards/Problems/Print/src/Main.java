// Posted from EduTools plugin
import java.util.Scanner;

public class Main {

    public static void print(String strArg) {

        System.out.println(String.format("print(\"%s\")", strArg));
    }

    public static void print(String strArg, int number) {
        System.out.println(String.format("print(\"%s\", %d)", strArg, number));
    }
    // write your method here

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}