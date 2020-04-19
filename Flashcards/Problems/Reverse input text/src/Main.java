// Posted from EduTools plugin
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(input.length() - 1 - i));
            }
            // start coding here
        }
    }
}