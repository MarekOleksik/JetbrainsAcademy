package readability;

public class AutomatedReadabilityIndex {

    double getScoreAutomatedReadabilityIndex(double characters, double words, double sentences) {
        return 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
    }
}
