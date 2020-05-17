package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringsOfText = text.split("[.!?]+");
        int sum = 0;
        double average = 0;
        String[] temp;
        int empty = 0;

        for (String item : stringsOfText) {
            temp = item.trim().split("[^\\w,]");
           //System.out.println("item: " + item);
            for (String temp1 : temp) {
                //System.out.println("temp1: " + temp1);
                if (temp1.isEmpty()) {
                    empty++;
                }
            }
            sum += temp.length - empty;
            //System.out.println("sum: " + sum);
        }

        average = (double) sum / stringsOfText.length;
        //System.out.println("average: " + average);

        if (average <= 10) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }

    }
}
