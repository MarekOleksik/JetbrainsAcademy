//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String stageOfEducation = scanner.nextLine();
        int yearsOfExperience = Integer.parseInt(scanner.nextLine());
        String cuisinePreference = scanner.nextLine();
        System.out.printf("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.", firstName, cuisinePreference);
    }
}