public class Main {

    public static void main(String[] args) {
        Secret[] secrets = Secret.values();
        int counter = 0;
        for (Secret item : secrets) {
            if (item.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/
