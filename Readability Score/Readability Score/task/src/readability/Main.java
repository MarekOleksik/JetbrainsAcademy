package readability;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadabilityScore readabilityScore = new ReadabilityScore();

        readabilityScore.importFromFile(args[0]);
        readabilityScore.processTheText();
        readabilityScore.printSummary();
        readabilityScore.calculateReadabilityScore(readabilityScore.askForAlgorithm());
    }
}
