package CardRank_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardRanks[] cardRanks = CardRanks.values();
        System.out.println("Card Ranks:");
        Arrays.stream(cardRanks)
                .forEach(cardRank -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name()));
    }
}
