import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> map = new TreeMap<>();
        for (String string : strings) {

            int count = map.containsKey(string) ? map.get(string) : 0;
            map.put(string, count + 1);
        }
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        // write your code here
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}