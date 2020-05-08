import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    private static boolean isPassPresent = false;
    private static String password = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String[] stringOfParameters = url.split("html?");
        String param = stringOfParameters[1].substring(1);
        String[] parameters = param.split("&");
        Map<String, String> mapOfParameters = new LinkedHashMap<>();
        for (String param1 : parameters) {
            String[] temp = param1.split("=", -1);
            if (temp[1].isEmpty()) {
                temp[1] = "not found";
            }
            mapOfParameters.put(temp[0], temp[1]);
        }

        mapOfParameters.forEach((key, value) -> {
            System.out.println(key + " : " + value);
            if ("pass".equals(key)) {
                isPassPresent = true;
                password = value;
            }
        });

        if (isPassPresent) {
            System.out.println("password : " + password);
        }
    }
}