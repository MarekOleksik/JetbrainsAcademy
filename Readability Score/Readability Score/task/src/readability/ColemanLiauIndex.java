package readability;

public class ColemanLiauIndex {
    public double getScoreColemanLiauIndex(double characters, double words, double sentences) {
        return 0.0588 * (characters / words * 100) - 0.296 * (sentences / words * 100) - 15.8;
    }
}
