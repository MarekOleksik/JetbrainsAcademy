// Posted from EduTools plugin
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = reader.readLine();
            String[] array = text.trim().split("\\s+");
            int result = 0;
            if (array[0].isBlank()) {
                result = 0;
            } else {
                result = array.length;
            }
            System.out.println(result);
        }
    }

}