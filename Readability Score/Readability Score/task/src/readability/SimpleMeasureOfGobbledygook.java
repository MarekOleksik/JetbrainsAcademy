package readability;

public class SimpleMeasureOfGobbledygook {

    public double getScoreSimpleMeasureOfGobbledygook(double polysyllables, double sentences) {
        return 1.0430 * Math.sqrt(polysyllables * (30 / sentences)) + 3.1291;
    }
}
