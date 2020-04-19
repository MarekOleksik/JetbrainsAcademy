import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();
        int number = scanner.nextInt();
        String[] tableOfNumbers = lineOfNumbers.split("\\s+");
        ArrayList<Integer> list = new ArrayList<>();
        for (String item : tableOfNumbers) {
            list.add(Integer.parseInt(item));
        }
        ArrayList<Integer> nearestNumbers = new ArrayList<>();
        int distance = Integer.MAX_VALUE;
        for (int num : list) {
            int tempDistance = Math.abs(number - num);
            if (tempDistance < distance) {
                distance = tempDistance;
                nearestNumbers.clear();
                nearestNumbers.add(num);
            } else if (tempDistance == distance) {
                nearestNumbers.add(num);
            }
        }

        Collections.sort(nearestNumbers);
        nearestNumbers.forEach(print -> System.out.print(print + " "));

        // write your code here
    }
}
