import java.io.File;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.areSiblings(new File("dir/file1.txt"), new File("dir/file2.txt")));
    }

public boolean areSiblings(File f1, File f2) {
        return f1.getParent().equals(f2.getParent());

}
}