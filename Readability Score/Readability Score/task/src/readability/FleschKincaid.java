package readability;

public class FleschKincaid {

    double getScoreFleschKincaid(double words, double sentences, double syllables) {
        return 0.39 * (words / sentences) + 11.8 * (syllables / words) - 15.59;
    }
}
