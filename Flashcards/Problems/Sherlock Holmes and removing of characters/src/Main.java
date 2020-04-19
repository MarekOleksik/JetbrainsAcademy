// Posted from EduTools plugin
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next().toLowerCase();
        String word2 = scanner.next().toLowerCase();
        char[] letters1 = word1.toCharArray();
        char[] letters2 = word2.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character character : letters1) {
            int count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, count + 1);
        }

        for (Character character : letters2) {
            int count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, count - 1);
        }

        for (Character key : map.keySet()) {
            int count = map.get(key);
            if (count < 0) {
                count *= -1;
                map.put(key, count);
            }
        }

        int counter = 0;
        for (Character key : map.keySet()) {
            counter = map.get(key) + counter;
        }

        System.out.println(counter);

    }
}