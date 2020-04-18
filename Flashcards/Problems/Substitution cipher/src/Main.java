import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code1 = scanner.next();
        String code2 = scanner.next();
        String inputText1 = scanner.next();
        String inputText2 = scanner.next();
        Map<Character, Character> map = new TreeMap<>();

        for (int i = 0; i < code1.length(); i++) {
            map.put(code1.charAt(i), code2.charAt(i));
        }

        for (int i = 0; i < inputText1.length(); i++) {
            System.out.print(map.get(inputText1.charAt(i)));
        }
        System.out.println();

        for (int i = 0; i < inputText2.length(); i++) {
            System.out.print(getKeyFromValue(map, inputText2.charAt(i)));
        }

    }

    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}