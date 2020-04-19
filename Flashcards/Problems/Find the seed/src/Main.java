import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seedA = scanner.nextInt();
        int seedB = scanner.nextInt();
        int numbers = scanner.nextInt();
        int bound = scanner.nextInt();

        int index = seedA;
        int minimum = bound;

        for (int i = seedA; i <= seedB; i++) {
            Random random = new Random(i);
            int maximum = 0;

            for (int j = 0; j < numbers; j++) {
                int randomNumber = random.nextInt(bound);

                if (randomNumber > maximum) {
                    maximum = randomNumber;
                }
            }

            if (maximum < minimum) {
                index = i;
                minimum = maximum;
            }
        }

        System.out.println(index);
        System.out.println(minimum);
    }
}
