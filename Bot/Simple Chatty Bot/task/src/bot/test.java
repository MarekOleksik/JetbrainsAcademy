package bot;

public class test {
    public static void main(String[] args) {
        boolean b1 = false, b2 = false, b3 = false;

        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
        System.out.println(result);
    }
}
